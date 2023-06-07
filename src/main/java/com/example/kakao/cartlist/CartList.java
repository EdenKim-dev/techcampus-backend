package com.example.kakao.cartlist;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CartList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartListId;

    private int cartId;
    private int optionId;
    private int quantity;
    private int price;

    @Builder
    public CartList(int cartListId, int cartId, int optionId, int quantity, int price) {
        this.cartListId = cartListId;
        this.cartId = cartId;
        this.optionId = optionId;
        this.quantity = quantity;
        this.price = price;
    }
}