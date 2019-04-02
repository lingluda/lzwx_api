package com.lzwx.service;

import com.lzwx.dao.entity.ZsTeacher;
import com.lzwx.util.ResultDto;

import java.util.Map;

public interface ZsTeacherService {
    ResultDto save(ZsTeacher teacher);
    ResultDto update(ZsTeacher teacher);
    ResultDto del(ZsTeacher teacher);
    ResultDto info(Long id);
    ResultDto list(Map<String,String> data);
}
