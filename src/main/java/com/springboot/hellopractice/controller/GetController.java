package com.springboot.hellopractice.controller;

import com.springboot.hellopractice.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/name")
    public String name() {
        return "soonmin";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/request1")
    public String getRequest1(@RequestParam String name, @RequestParam String email, @RequestParam String organization) {
        return String.format("%s %s %s",name, email, organization);
    }

    @GetMapping("/request2")
    public String getRequest2(@RequestParam Map<String,String> param) {
        param.entrySet().forEach(map-> {
            System.out.printf("key : %s value : %s\n", map.getKey(), map.getValue());
        });
        return "request2 호출 완료!";
    }

    @GetMapping("/request3")
    public String getRequest3(MemberDto memberDto) {
        return memberDto.toString();
    }


}
