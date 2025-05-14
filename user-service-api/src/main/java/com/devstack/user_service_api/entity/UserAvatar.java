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
@Table(name = "user_avatar")
public class UserAvatar {

    @Id
    private String avatarId;

    @Embedded
    private FileResource resource;


}
