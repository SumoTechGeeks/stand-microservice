package com.safalifter.notificationservice.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "notifications")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(generator = "UUID")
    private String id;

    private String userId;
    private String offerId;
    private String message;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;
}
