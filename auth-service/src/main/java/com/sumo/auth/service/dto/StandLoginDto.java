package com.sumo.auth.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandLoginDto {
    private String standId;
    private String password;
}
