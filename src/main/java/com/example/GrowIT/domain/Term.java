package com.example.GrowIT.domain;

import com.example.GrowIT.domain.common.BaseEntity;
import com.example.GrowIT.domain.enums.TermType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Term extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TermType type;

    @OneToMany(mappedBy = "term", cascade = CascadeType.ALL)
    private List<UserTerm> userTerm;


}