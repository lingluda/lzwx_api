package com.lzwx.service;

import com.lzwx.dao.entity.Base;
import com.lzwx.util.ResultDto;

import java.util.Map;

public interface BaseService {
    ResultDto save(Base base);
    ResultDto update(Base base);
    ResultDto del(Base base);
    ResultDto info(Long id);
    ResultDto list(Map<String,String> data);
    ResultDto list2(Map<String,String> data);
}
