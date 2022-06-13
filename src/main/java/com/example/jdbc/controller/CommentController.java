package com.example.jdbc.controller;

import com.example.jdbc.po.Comment;
import com.example.jdbc.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentService testRepository;

    @RequestMapping("/get/{sql}")
    public Comment getId(@PathVariable String sql){
        Comment commentById = testRepository.searchByDates(sql);
        if (commentById == null){
            return  new Comment();
        }
        return commentById;
    }
}
