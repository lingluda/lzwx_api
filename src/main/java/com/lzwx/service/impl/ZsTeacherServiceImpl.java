package com.lzwx.service.impl;

import com.lzwx.dao.ZsTeacherDao;
import com.lzwx.dao.entity.Base;
import com.lzwx.dao.entity.ZsTeacher;
import com.lzwx.service.ZsTeacherService;
import com.lzwx.util.ResultDto;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ZsTeacherServiceImpl implements ZsTeacherService {
    @Resource
    ZsTeacherDao zsTeacherDao;

    @Override
    public ResultDto save(ZsTeacher teacher) {
        ResultDto resultDto = new ResultDto();
        teacher.setCreatetime(new Date());
        teacher.setModifiedtime(new Date());
        zsTeacherDao.save(teacher);
        return resultDto;
    }

    @Override
    public ResultDto update(ZsTeacher teacher) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }

    @Override
    public ResultDto del(ZsTeacher teacher) {
        ResultDto resultDto = new ResultDto();
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
        List<ZsTeacher> list = new ArrayList<>();
        Specification<ZsTeacher> specification = new Specification<ZsTeacher>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<ZsTeacher> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                Join<ZsTeacher, Base> baseJoin = root.join("base", JoinType.LEFT);
                Predicate p1 = cb.equal(baseJoin.get("id"), data.get("majorid"));
                Predicate p2 = cb.equal(root.get("id"),data.get("id"));
                predicates.add(p1);
                predicates.add(p2);
                return cb.and(predicates.toArray(new Predicate[0]));
            }
       /* if (StringUtils.isNotBlank(data.get("name"))){
            String name = "%" + data.get("name") +"%";
            resultDto.setData(zsTeacherDao.findByNameIsLikeAndStatus(name,status));
        }else {
            resultDto.setData(zsTeacherDao.findByStatus(status));
        }*/
        };
        list = zsTeacherDao.findAll(specification, new Sort(Sort.Direction.DESC, "id"));
        resultDto.setData(list);
        return resultDto;
    }
}
