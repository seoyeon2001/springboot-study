package com.example.firstproject.repository;

import com.example.firstproject.entity.Member;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

// JPA에서 제공하는 인터페이스 상속
public interface MemberRepository extends CrudRepository<Member, Long> {

    @Override
    ArrayList<Member> findAll();
}
