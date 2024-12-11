package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 추가 어노테이션(매개변수가 없는 생성자)
@ToString
@Entity // JPA에서 제공하는 어노테이션, 이 어노테이션이 붙은 클래서를 기반으로 DB에 테이블이 생성됨
@Getter
public class Article { // 테이블 이름은 클래스 이름과 동일하게 생성됨
    @Id // 대푯값
    @GeneratedValue // 자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
