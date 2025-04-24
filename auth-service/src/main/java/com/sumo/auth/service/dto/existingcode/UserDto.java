package com.sumo.auth.service.dto.existingcode;

import com.sumo.auth.service.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private Role role;
}
