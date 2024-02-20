package com.example.demo.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info(String.format("Sending message to demo-topic:: %s", message));
        kafkaTemplate.send("demo-topic", message);
    }
}
