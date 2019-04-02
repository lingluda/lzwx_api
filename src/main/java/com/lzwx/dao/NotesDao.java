package com.lzwx.dao;

import com.lzwx.dao.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NotesDao extends JpaRepository<Notes,Long>,JpaSpecificationExecutor {
}
