package com.dytak.crudapi.Controller;

import com.dytak.crudapi.Service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class MainController {


    private final MemberService memberService;
    public MainController(MemberService memberService){
        this.memberService = memberService;
    }

    @PostMapping(value="/")
    public void registerMember(@RequestBody Map<String,String> playerInfo){
        memberService.join(playerInfo);
        Map<String,String> result = memberService.findByUserId(1L);
        System.out.println("playername:" +  result.get("playername"));
        System.out.println("position:" +  result.get("position"));
    }


}
