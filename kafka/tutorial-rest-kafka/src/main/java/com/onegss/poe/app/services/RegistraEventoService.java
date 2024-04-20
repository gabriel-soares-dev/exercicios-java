package com.onegss.poe.app.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public <T> void adicionarEvento(String topic, T dados) {
        kafkaTemplate.send(topic, dados);
    }
}
