package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

// JPA에서 제공하는 인터페이스 상속
public interface ArticleRepository extends CrudRepository<Article, Long> { // Article -> 관리 대상 엔티티 클래스

    @Override
    ArrayList<Article> findAll();
}
