/*
package com.lzwx.dao.combine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherInfoDao extends JpaRepository<TeacherInfo,Long>{
    @Query(value = "select t from TeacherInfo t where t.id in (select a.id from Base a)")
    List<TeacherInfo> findbyid();
}
*/
