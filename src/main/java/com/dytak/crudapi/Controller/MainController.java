package com.dytak.crudapi.Controller;

import com.dytak.crudapi.Domain.Member;
import com.dytak.crudapi.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class MainController {
    final MemberService memberService;

    @RequestMapping(value="/")
    public Optional<Member> test(){
        System.out.println("memberServi = " );
        Optional<Member> result = memberService.test();
        String test="abc";

        return result;
    }


}
