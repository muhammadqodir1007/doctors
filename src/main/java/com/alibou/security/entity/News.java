package com.alibou.security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 500)
    String title_uz;
    @Column(length = 500)
    String title_ru;
    @Column(length = 500)
    String title_en;
    @Column(length = 1000)
    String description_uz;
    @Column(length = 1000)
    String description_en;
    @Column(length = 1000)
    String description_ru;
    String link;
    LocalDateTime createdDate;


}
