package com.sumo.auth.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StandDto {
    private String standId;
    private String name;
    private String state;
    private String district;
    private String town;
    private Integer pincode;
    private Double longitude;
    private Double latitude;
    private String standRegistrationNumber;
    private Integer dailyStandFee;
    private Integer membershipFee;
    @JsonProperty("isActive")
    private Boolean isActive;
    private Date createdAt;
    private Date updatedAt;
    private String address;

    public void buildAddress() {
        this.address = this.name+", "+this.town+", "+this.district+", "+this.pincode+", "+this.state;
    }
}
