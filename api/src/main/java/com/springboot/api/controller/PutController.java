package com.springboot.api.controller;

import com.springboot.api.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping(value = "/member1")
    public String  putMemberDTO1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping(value = "/member2")
    public MemberDTO putMemberDTO2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    //  httpstatus 수정 가능
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDTO> putMemberDTO3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDTO);
    }

}
