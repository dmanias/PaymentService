package gr.dmanias.PaymentService.service;

import gr.dmanias.PaymentService.model.PaymentRequest;
import gr.dmanias.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}