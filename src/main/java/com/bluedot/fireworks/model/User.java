package com.bluedot.fireworks.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {

    private Long id;

//    Random 28 characters
    private Long playerId;

    private String playerName;

    private String accessToken;

    private String username;

    private String email;

    private ExternalIdentityProvider externalIdentityProvider;

    private Date createdDate;

    private Date updatedDate;

}
