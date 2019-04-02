package com.lzwx.service.impl;

import com.lzwx.dao.XzUserDao;
import com.lzwx.dao.entity.XzUser;
import com.lzwx.service.XzUserService;
import com.lzwx.util.ResultDto;
import com.lzwx.util.jwt.JWTUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service
public class XzUserServiceImpl implements XzUserService{
    @Resource
    XzUserDao xzUserDao;
    @Override
    public ResultDto save(XzUser user) {
        ResultDto resultDto = new ResultDto();
        xzUserDao.save(user);
        return resultDto;
    }

    @Override
    public ResultDto update(XzUser user) {
        ResultDto resultDto = new ResultDto();
        if (user.getId()==null){
            resultDto.setCode("error");
            resultDto.setMsg("id不能为空！");
        }
        xzUserDao.save(user);
        return resultDto;
    }

    @Override
    public ResultDto del(XzUser user) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }

    @Override
    public ResultDto login(XzUser user) {
        ResultDto resultDto = new ResultDto();
        XzUser xzUser = xzUserDao.findByUsername(user.getUsername());
        if (xzUser==null){
            resultDto.setCode("warning");
            resultDto.setMsg("没有此用户！请与系统管理员联系!");
        }
        else if (StringUtils.isNotBlank(user.getPassword())&&xzUser.getPassword().equals(user.getPassword())){
            resultDto.setData(JWTUtil.sign(xzUser.getUsername(),xzUser.getUsername()));
        }
        else {
            resultDto.setCode("error");
            resultDto.setMsg("密码错误！请重新输入！");
        }
        return resultDto;
    }

    @Override
    public ResultDto info(Long id) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }

    @Override
    public ResultDto list(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }
}
