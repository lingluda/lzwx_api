package com.lzwx.service;

import com.lzwx.dao.entity.XzUser;
import com.lzwx.util.ResultDto;

import java.util.Map;

public interface XzUserService {
    ResultDto save(XzUser user);
    ResultDto update(XzUser user);
    ResultDto del(XzUser user);
    ResultDto login(XzUser user);
    ResultDto info(Long id);
    ResultDto list(Map<String,String> data);
}
