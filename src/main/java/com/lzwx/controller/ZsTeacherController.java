package com.lzwx.controller;

import com.lzwx.dao.entity.ZsTeacher;
import com.lzwx.service.impl.ZsTeacherServiceImpl;
import com.lzwx.util.RequestDto;
import com.lzwx.util.ResultDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
public class ZsTeacherController {
    @Resource
    ZsTeacherServiceImpl zsTeacherService;
//    @Resource
//    TeacherInfoDao teacherInfoDao;
    @PostMapping("/save")
    public ResponseEntity<ResultDto> save(@RequestBody RequestDto<ZsTeacher> dto){
        return new ResponseEntity<>(zsTeacherService.save(dto.getData()), HttpStatus.OK);
    }
    @PostMapping("/list")
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String,String>> dto){
        return new ResponseEntity<>(zsTeacherService.list(dto.getData()),HttpStatus.OK);
    }
//    @PostMapping("/lists")
//    public List<TeacherInfo> lists(){
//        return teacherInfoDao.findbyid();
//    }
}
