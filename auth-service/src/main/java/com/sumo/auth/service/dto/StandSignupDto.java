package com.sumo.auth.service.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StandSignupDto extends GenericDto {
    private String name;
    private String state;
    private String district;
    private String town;
    private int pincode;
    private double longitude;
    private double latitude;
    private String standRegistrationNumber;
    private int signupSecret;
    private String password;
}
