package com.proyectofinal.sistemasdistribuidos;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "${message.topic.name:defaultShoppingCart}", groupId = "${message.group.name:apiShoppingCart}")
    public void listenDeafultTopic(String message) {
        System.out.println("Recieved Message of default topic in  listener: " + message);
    }

    @KafkaListener(topics = "${message.topic.name:addItems}", groupId = "${message.group.name:apiShoppingCart}")
    public void listenTopic1(String message) {
        System.out.println("Recieved Message of topic1 in  listener: " + message);
    }

   @KafkaListener(topics = "${message.topic.name2:deleteItems}", groupId = "${message.group.name:apiShoppingCart}")
    public void listenTopic2(String message) {
        System.out.println("Recieved Message of topic2 in  listener:  "+message);
    }

    @KafkaListener(topics = "${message.topic.name2:showItems}", groupId = "${message.group.name:apiShoppingCart}")
    public void listenTopic3(String message) {
        System.out.println("Recieved Message of topic3 in  listener:  "+message);
    }

}
