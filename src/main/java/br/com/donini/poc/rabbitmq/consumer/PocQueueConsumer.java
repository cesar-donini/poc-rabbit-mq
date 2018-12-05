package br.com.donini.poc.rabbitmq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PocQueueConsumer {

    @RabbitListener(queues = "${spring.rabbitmq.queue.poc.name}")
    public void consume(Message teste) {

        System.out.println(new String(teste.getBody()));

    }

}
