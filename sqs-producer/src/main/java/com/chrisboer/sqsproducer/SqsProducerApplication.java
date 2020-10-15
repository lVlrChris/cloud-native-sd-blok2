package com.chrisboer.sqsproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SqsProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqsProducerApplication.class, args);

        SqsController controller = new SqsController();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.next();
            Message message = new Message(0, input);
            controller.sendMessageToSqs(message);
            System.out.println("Sending message: " + message);
        }
    }

}
