package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.entity.valueobject.Money;
import com.food.ordering.system.domain.entity.valueobject.OrderId;
import com.food.ordering.system.order.service.domain.entity.Product;

public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId orderId;
    private final Product product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    private OrderItem(Builder builder) {
        super.setId(builder.orderItemId);
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder {
        private OrderItemId orderItemId;
        private OrderId orderId;
        private  Product product;
        private int quantity;
        private  Money price;
        private  Money subTotal;

        public Builder(Product product, int quantity, Money price, Money subTotal) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
            this.subTotal = subTotal;
        }

        private Builder(){};

        public Builder orderItemId(OrderItemId val) {
            orderItemId = val;
            return this;
        }

        public Builder product(Product val)
        {
            product = val;
            return this;
        }

        public Builder quantity(int val)
        {
            quantity = val;
            return this;
        }

        public Builder price(Money val)
        {
            price = val;
            return this;
        }

        public Builder subTotal(Money val)
        {
            subTotal = val;
            return this;
        }

        public Builder orderId(OrderId val) {
            orderId = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }
}
