package com.springboot.hellopractice.controller;

import com.springboot.hellopractice.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value="/domain", method = RequestMethod.POST)
    public String postExample() {
        return "Hello Post API";
    }

    @PostMapping("/member1")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map->sb.append(map.getKey()+" : "+map.getValue()+"\n"));
        return sb.toString();
    }

    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }



}
