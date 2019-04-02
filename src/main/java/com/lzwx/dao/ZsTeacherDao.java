package com.lzwx.dao;

import com.lzwx.dao.entity.ZsTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ZsTeacherDao extends JpaRepository<ZsTeacher,Long>,JpaSpecificationExecutor{
    List<ZsTeacher> findByNameIsLikeAndStatus(String name,Byte status);
    List<ZsTeacher> findByStatus(Byte status);
}
