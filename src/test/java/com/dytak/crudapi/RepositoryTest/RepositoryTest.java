package com.dytak.crudapi.RepositoryTest;

import com.dytak.crudapi.Domain.Member;
import com.dytak.crudapi.Repository.MemberRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
public class RepositoryTest {


    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("JpaRepository 저장 및 조회 테스트")
    void readMember(){

        Member member = new Member();
        member.setId(1L);
        member.setUsername("dytak");
        member.setName("탁대영");
        memberRepository.save(member);

        System.out.println("memberRepository.findById(1L).get().getUsername() = " + memberRepository.findById(1L).get().getUsername());
        System.out.println("memberRepository.findById(1L).get().getUsername() = " + memberRepository.findById(1L).get().getName());

        Assertions.assertThat("dytak").isEqualTo(memberRepository.findById(1L).get().getUsername());



    }
}
