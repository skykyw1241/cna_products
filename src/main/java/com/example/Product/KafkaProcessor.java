package com.example.Product;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaProcessor extends Processor {
    String productChanged_INPUT="productChanged-in";
    String productChanged_OUTPUT="productChanged-out";

    String productExcept_INPUT="productChanged-in";
    String productExcept_OUTPUT="productChanged-out";

    String orderCreated_INPUT="orderCreated-in";
    String orderCreated_OUTPUT="orderCreated-in";

    @Input(productChanged_INPUT)
    SubscribableChannel inboundProductChanged();

    @Output(productChanged_OUTPUT)
    MessageChannel outboundProductChanged();

    @Input(productExcept_INPUT)
    SubscribableChannel inboundProductExcept();

    @Output(productExcept_OUTPUT)
    MessageChannel outboundProductExcept();

    @Input(orderCreated_INPUT)
    SubscribableChannel inboundOrderCreated();

    @Output(orderCreated_OUTPUT)
    MessageChannel outboundOrderCreated();
}
