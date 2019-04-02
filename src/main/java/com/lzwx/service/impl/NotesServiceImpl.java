package com.lzwx.service.impl;

import com.lzwx.dao.NotesDao;
import com.lzwx.dao.entity.Notes;
import com.lzwx.service.NoteService;
import com.lzwx.util.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NotesServiceImpl implements NoteService {
    @Autowired
    NotesDao notesDao;

    @Override
    public ResultDto save(Notes notes) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }

    @Override
    public ResultDto update(Notes notes) {
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }

    @Override
    public ResultDto del(Notes notes) {
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
        Sort sort = new Sort(Sort.Direction.DESC, "modifiedtime");
       // PageRequest pageable = new PageRequest(1,3);
        List<Notes> list = notesDao.findAll(sort);
        resultDto.setData(list.subList(0,2));
        return resultDto;
    }
}
