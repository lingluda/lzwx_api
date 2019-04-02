package com.lzwx.controller;

import com.lzwx.dao.entity.Base;
import com.lzwx.service.impl.BaseServiceImpl;
import com.lzwx.util.RequestDto;
import com.lzwx.util.ResultDto;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Api(tags = "智障CURD接口")
@RestController
@RequestMapping("/base")
public class BaseController {
    @Resource
    BaseServiceImpl baseService;
    @PostMapping("/save")
    public ResponseEntity<ResultDto> save(@RequestBody RequestDto<Base> dto){
        return new ResponseEntity<>(baseService.save(dto.getData()), HttpStatus.OK);
    }
    @PostMapping("/update")
    public ResponseEntity<ResultDto> update(@RequestBody RequestDto<Base> dto){
        return new ResponseEntity<>(baseService.update(dto.getData()), HttpStatus.OK);
    }
    @PostMapping("/del")
    public ResponseEntity<ResultDto> del(@RequestBody RequestDto<Base> dto){
        return new ResponseEntity<>(baseService.del(dto.getData()), HttpStatus.OK);
    }
    @PostMapping("/list")
    @RequiresAuthentication
    public ResponseEntity<ResultDto> list(@RequestBody RequestDto<Map<String,String>> dto){
        return new ResponseEntity<>(baseService.list(dto.getData()), HttpStatus.OK);
    }
    @PostMapping("/list2")
    public ResponseEntity<ResultDto> list2(@RequestBody RequestDto<Map<String,String>> dto){
        return new ResponseEntity<>(baseService.list2(dto.getData()), HttpStatus.OK);
    }
}
