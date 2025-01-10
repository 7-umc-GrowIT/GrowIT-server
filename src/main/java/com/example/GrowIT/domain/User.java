package com.example.GrowIT.domain;

import com.example.GrowIT.domain.common.BaseEntity;
import com.example.GrowIT.domain.enums.Provider;
import com.example.GrowIT.domain.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer currentCredit;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer totalCredit;

    @Enumerated(EnumType.STRING)
    private Provider provider;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserTerm> userTerm;

}