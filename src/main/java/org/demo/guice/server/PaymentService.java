package org.demo.guice.server;

public interface PaymentService {
    void pay(long orderId, long price, Long sessionId);
}
