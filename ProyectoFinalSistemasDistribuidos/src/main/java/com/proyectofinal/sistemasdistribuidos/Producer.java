package com.proyectofinal.sistemasdistribuidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.ArrayList;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, ArrayList<Producto>> kafkaTemplateList;

    @Autowired
    private KafkaTemplate<String, ConfirmationCart> kafkaTemplateListTotal;

    @Value(value = "${message.topic.name:ShoppingCart}")
    private String topicName;

    public void sendMessage(String topic, String message) {
        if (topic==null || topic.trim().equals(""))
            topic= topicName;
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {

            }

            @Override
            public void onSuccess(SendResult<String, String> result) {

            }
        });
    }

    public void sendList(String topic, ArrayList<Producto> list){
        if (topic==null || topic.trim().equals(""))
            topic= topicName;
        ListenableFuture<SendResult<String, ArrayList<Producto>>> future = kafkaTemplateList.send(topic, list);
        future.addCallback(new ListenableFutureCallback<SendResult<String, ArrayList<Producto>>>() {
            @Override
            public void onFailure(Throwable ex) {

            }

            @Override
            public void onSuccess(SendResult<String, ArrayList<Producto>> result) {

            }
        });
    }

    public void sendListTotal(String topic, ConfirmationCart confirmationCart){
        if (topic==null || topic.trim().equals(""))
            topic= topicName;
        ListenableFuture<SendResult<String, ConfirmationCart>> future = kafkaTemplateListTotal.send(topic, confirmationCart);
        future.addCallback(new ListenableFutureCallback<SendResult<String, ConfirmationCart>>() {
            @Override
            public void onFailure(Throwable ex) {

            }

            @Override
            public void onSuccess(SendResult<String, ConfirmationCart> result) {

            }
        });
    }

}
