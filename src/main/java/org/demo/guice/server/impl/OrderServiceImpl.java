package org.demo.guice.server.impl;

import org.demo.guice.server.OrderService;
import org.demo.guice.server.PaymentService;
import org.demo.guice.server.PriceService;

import javax.inject.Inject;

public class OrderServiceImpl implements OrderService {
    private final PriceService priceService;
    private final PaymentService paymentService;
    private final SessionManager sessionManager;

    private Long orderPaid=0L;

    @Inject
    public OrderServiceImpl(PriceService priceService,
                            PaymentService paymentService,
                            SessionManager sessionManager) {
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }

    public void sendToPayment(long orderId){
        long price=priceService.getPrice(orderId);
        paymentService.pay(orderId,price,sessionManager.getSessionId());
        orderPaid=orderPaid+1;
    }
}
