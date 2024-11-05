package com.DivyanshuLearn.microservices.order.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderplacedEvent {
    private String orderNumber;
    private String email;
}
