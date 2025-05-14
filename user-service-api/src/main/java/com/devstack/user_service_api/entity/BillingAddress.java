package com.devstack.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "billing_address")
public class BillingAddress {

    @Id
    private String id;
    private String country;
    private String city;
    private String street;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private User user;
}
