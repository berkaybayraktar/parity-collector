package com.ub.paritycollector.web.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.service.parity.ParityService;
import com.ub.paritycollector.service.websocket.WebSocketMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;

@Component
public class ParityWebsocketMessageSender {

    private final Logger log = LoggerFactory.getLogger(ParityWebsocketMessageSender.class);

    private final ObjectMapper objectMapper;

    private final WebSocketMessageHandler webSocketMessageHandler;

    /**
     * Dependency Injection
     */
    @Autowired
    public ParityWebsocketMessageSender(ObjectMapper objectMapper, WebSocketMessageHandler webSocketMessageHandler) {
        this.objectMapper = objectMapper;
        this.webSocketMessageHandler = webSocketMessageHandler;
    }

    @Scheduled(fixedDelay = 5000)
    public void publishParities() throws Exception {
        log.info("Publishing all parities to websocket clients");

        List<Parity> parities = ParityService.getInstance().getParities();

        TextMessage textMessage = new TextMessage(objectMapper.writeValueAsString(parities));

        for (WebSocketSession webSocketSession : webSocketMessageHandler.getWebSocketSessions()) {

            try {
                if (webSocketSession.isOpen()) {
                    webSocketSession.sendMessage(textMessage);
                }
            } catch (Exception e) {
                log.error("Exception occurred while sending message");
                e.printStackTrace();
            }

        }
    }

}
