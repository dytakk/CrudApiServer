package com.dytak.crudapi.Service;


import com.dytak.crudapi.Domain.Member;
import com.dytak.crudapi.Repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    final MemberRepository memberRepository;

    public Optional<Member> test(){
        Member member = new Member();
        member.setId(1L);
        member.setUsername("dytak");
        member.setName("dy");
        memberRepository.save(member);
        //System.out.println(memberRepository.findAll());
        Optional<Member> findMember = memberRepository.findById(1L);

        return findMember;
    }
}
