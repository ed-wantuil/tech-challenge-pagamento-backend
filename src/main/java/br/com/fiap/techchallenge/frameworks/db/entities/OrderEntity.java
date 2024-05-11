package br.com.fiap.techchallenge.frameworks.db.entities;

import java.time.LocalDate;
import java.util.UUID;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@DynamoDBDocument
public class OrderEntity {

    @DynamoDBAttribute(attributeName = "orderId")
    private UUID orderId;

    @DynamoDBAttribute(attributeName = "customerId")
    private String customerId;

    @DynamoDBAttribute(attributeName = "paymentStatus")
    private String paymentStatus;

    @DynamoDBAttribute(attributeName = "created")
    private LocalDate created;

    @DynamoDBAttribute(attributeName = "amount")
    private Double amount;

}
