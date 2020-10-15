package com.chrisboer.sqsproducer;

import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class SqsController {

    private static final String QUEUE = "cnsd-blok2-queue";

    private final QueueMessagingTemplate queueMessagingTemplate;

    public SqsController(QueueMessagingTemplate queueMessagingTemplate) {
        this.queueMessagingTemplate = queueMessagingTemplate;
    }

    public void sendMessageToSqs(final Message message) {
        queueMessagingTemplate.convertAndSend(QUEUE, message);
    }
}
