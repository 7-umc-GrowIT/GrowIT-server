package com.example.GrowIT.domain;


import com.example.GrowIT.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ChallengeKeyword extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "challenge_id", nullable = false)
    private Challenge challenge;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "keyword_id", nullable = false)
//    private Keyword keyword;


}