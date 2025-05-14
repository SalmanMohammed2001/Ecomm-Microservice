package com.devstack.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @Column(unique = true, nullable = false,name = "user_id")
    private String userId;
    @Column(unique = true, nullable = false,name = "user_name",length =100)
    private String userName;
    @Column(length = 50,nullable = false,name = "first_name")
    private String firstName;
    @Column(length = 50,nullable = false,name = "last_name")
    private String lastName;
    @Column(columnDefinition = "TINYINT",name = "active_state")
    private boolean activeState;
    @Column(nullable = false,name = "otp")
    private int otp;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
    private ShippingAddress shippingAddress;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
    private BillingAddress billingAddress;
}
