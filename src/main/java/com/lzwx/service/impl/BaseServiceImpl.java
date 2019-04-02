package com.lzwx.service.impl;

import com.lzwx.dao.entity.Base;
import com.lzwx.dao.BaseDao;
import com.lzwx.service.BaseService;
import com.lzwx.util.ResultDto;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class BaseServiceImpl implements BaseService {
    @Resource
    BaseDao baseDao;
    @Override
    public ResultDto update(Base base) {
        ResultDto resultDto = new ResultDto();
        if (base.getId()==null){
            resultDto.setCode("1");
            resultDto.setMsg("id不能为空！");
        }
        Base update = baseDao.getOne(base.getId());
        update.setModifiedtime(new Date());
        update.setName(base.getName());
        baseDao.save(update);
        return resultDto;
    }

    @Override
    public ResultDto save(Base base) {
        ResultDto resultDto = new ResultDto();
        base.setCreatetime(new Date());
        base.setModifiedtime(new Date());
        base.setStatus((byte)0);
        baseDao.save(base);
        return resultDto;
    }

    @Override
    public ResultDto del(Base base) {
        ResultDto resultDto = new ResultDto();
        if (base.getId() == null){
            resultDto.setCode("1");
            resultDto.setMsg("id不能为空！");
        }
        Base del = baseDao.getOne(base.getId());
        del.setStatus((byte)-1);
        del.setModifiedtime(new Date());
        baseDao.save(del);
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
        Byte status = 0;
        Specification<Base> specification = new Specification<Base>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<Base> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>(); //所有的断言
                Predicate p1 = cb.equal(root.get("status"),status);
                predicates.add(p1);
                if(StringUtils.isNotBlank(data.get("name"))){ //添加断言
                    Predicate likeNickName = cb.like(root.get("name"),"%"+data.get("name")+"%");
                    predicates.add(likeNickName);
                }
                return cb.and(predicates.toArray(new Predicate[0]));
            }
        };
        Sort sort = new Sort(Sort.Direction.DESC, "modifiedtime");
        //Pageable pageable = new PageRequest(1, 2, Sort.Direction.ASC, "id");
        Pageable pageable = new PageRequest(1, 2, sort);
        // System.out.println("json: "+baseDao.findAll(specification,pageable));
        Page<Base> list = baseDao.findAll(specification,pageable);
        resultDto.setData(list);
        return resultDto;
    }

    @Override
    public ResultDto list2(Map<String, String> data) {
        ResultDto resultDto = new ResultDto();
        //resultDto.setData(baseDao.findFirst10ByStatus(B));
        return resultDto;
    }

}
