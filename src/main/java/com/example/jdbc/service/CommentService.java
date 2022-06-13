package com.example.jdbc.service;

import com.example.jdbc.dao.CommentRepository;
import com.example.jdbc.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public Comment searchByDates(String sql){
        return commentRepository.searchByDates(sql);
    }
}
