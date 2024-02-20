package com.example.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "demo-topic", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming the message from demo-topic:: %s", message));

    }

    @KafkaListener(topics = "demo-topic", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the student from demo-topic:: %s", student));

    }

}
