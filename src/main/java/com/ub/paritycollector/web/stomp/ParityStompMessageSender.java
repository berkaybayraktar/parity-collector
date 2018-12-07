package com.ub.paritycollector.web.stomp;

import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.service.parity.ParityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParityStompMessageSender {

    private final Logger log = LoggerFactory.getLogger(ParityStompMessageSender.class);

    private final SimpMessagingTemplate template;

    /**
     * Dependency Injection
     */
    @Autowired
    public ParityStompMessageSender(SimpMessagingTemplate template) {
        this.template = template;
    }

    @Scheduled(fixedDelay = 5000)
    public void publishParities() throws Exception {
        log.info("Publishing all parities to websocket clients");

        List<Parity> parities = ParityService.getInstance().getParities();

        template.convertAndSend("/topic/parities", parities);
    }

}
