package com.lzwx.dao;

import com.lzwx.dao.entity.XzUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface XzUserDao extends JpaRepository<XzUser,Long>,JpaSpecificationExecutor{
    XzUser findByUsername(String name);
}
