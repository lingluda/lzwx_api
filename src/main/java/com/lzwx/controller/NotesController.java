package com.lzwx.controller;

import com.lzwx.service.impl.NotesServiceImpl;
import com.lzwx.util.RequestDto;
import com.lzwx.util.ResultDto;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/note")
public class NotesController {
    @Autowired
    NotesServiceImpl service;
    @PostMapping("/list")
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String,String>>dto){
        return new ResponseEntity<>(service.list(dto.getData()), HttpStatus.OK);
    }
}
