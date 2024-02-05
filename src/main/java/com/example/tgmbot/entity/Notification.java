package com.example.tgmbot.entity;

import com.example.tgmbot.entity.contract.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notifications")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification extends AbstractEntity {

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Enumerated(EnumType.STRING)
    NotificationStatus status;

    @Column(name = "sesconds")
    Long seconds;



    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
