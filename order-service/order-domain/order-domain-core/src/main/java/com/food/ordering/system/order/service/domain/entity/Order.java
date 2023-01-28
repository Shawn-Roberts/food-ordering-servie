package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.entity.valueobject.CustomerId;
import com.food.ordering.system.domain.entity.valueobject.Money;
import com.food.ordering.system.domain.entity.valueobject.OrderId;
import com.food.ordering.system.domain.entity.valueobject.RestaurantId;
import com.food.ordering.system.order.service.domain.valueobject.OrderItem;
import com.food.ordering.system.order.service.domain.valueobject.StreetAddress;

import java.util.List;

public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final RestaurantId restaurantId;
    private final StreetAddress deliveryAddress;
    private final Money price;
    private final List<OrderItem> orderItems;


}
