package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//form 데이터를 받아올 DTO가 됨
@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

//    // 생성자
//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }

//    // 데이터를 잘 받았는지 확인하기 위한 메서드
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    public Article toEntity() { // 엔티티로 반환
        return new Article(id, title, content);
    }
}
