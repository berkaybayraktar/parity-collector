package com.ub.paritycollector.service.websocket;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WebSocketMessageHandler extends TextWebSocketHandler {

    private List<WebSocketSession> webSocketSessions = new ArrayList<>();

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        String clientMessage = message.getPayload();

        if (clientMessage.contains("/topic/parities")) {
            webSocketSessions.add(session);
        }
    }

    public List<WebSocketSession> getWebSocketSessions() {
        return new ArrayList<>(webSocketSessions);
    }

    @Scheduled(fixedDelay = 1000)
    public void closeSessions() {
        webSocketSessions
                .removeAll(webSocketSessions
                        .stream()
                        .filter(webSocketSession -> !webSocketSession.isOpen())
                        .collect(Collectors.toList())
                );
    }
}
