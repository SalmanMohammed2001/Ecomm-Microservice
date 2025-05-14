package com.devstack.user_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipping_address")
public class ShippingAddress {

    @Id
    private String id;
    private String country;
    private String city;
    private String street;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private User user;

}
