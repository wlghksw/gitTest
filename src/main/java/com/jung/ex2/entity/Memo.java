package com.jung.ex2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity //Entity 자체가 VO 역할을 함
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder //build() 메소드를 사용해서 갹체를 생성할 수 있게 해주는 어노테이션
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
