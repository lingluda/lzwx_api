package com.lzwx.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class ListPaging extends PageRequest {
    public ListPaging(int page, int size, Sort sort) {
        super(page, size, sort);
    }
}
