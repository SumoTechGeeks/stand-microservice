package com.sumo.auth.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandAuthResponseDto {
    private String standId;
    private String name;
    private String state;
    private String district;
    private String town;
    private int pincode;
    private double longitude;
    private double latitude;
    private String standRegistrationNumber;
    private String accessToken;
}
