package com.lzwx.service;

import com.lzwx.dao.entity.Notes;
import com.lzwx.util.ResultDto;

import java.util.Map;

public interface NoteService {
    ResultDto save(Notes notes);
    ResultDto update(Notes notes);
    ResultDto del(Notes notes);
    ResultDto info(Long id);
    ResultDto list(Map<String,String> data);
}
