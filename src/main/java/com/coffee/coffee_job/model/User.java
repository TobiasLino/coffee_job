package com.coffee.coffee_job.model;

import com.coffee.coffee_job.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.ws.rs.client.Entity;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String email;
    private String password = "";
    private UserType userType;
}
