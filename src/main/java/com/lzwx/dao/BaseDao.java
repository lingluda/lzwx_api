package com.lzwx.dao;

import com.lzwx.dao.entity.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.Nullable;

import java.util.List;

public interface BaseDao extends JpaRepository<Base,Long>,JpaSpecificationExecutor{
    List<Base> findAll();
    List<Base> findByNameIsLikeAndStatus(String name,Byte status);
    List<Base> findFirst10ByStatus(Byte status, Sort sort);
}
