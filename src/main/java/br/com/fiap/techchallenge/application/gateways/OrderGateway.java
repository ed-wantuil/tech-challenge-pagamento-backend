package br.com.fiap.techchallenge.application.gateways;

import java.util.List;

import br.com.fiap.techchallenge.domain.entities.Order;


public interface OrderGateway {
    Order updatePaymentStatus(String id, String paymentStatus);

    Order findById(String id);
}
