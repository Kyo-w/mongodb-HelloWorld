package com.example.jdbc.dao;

import com.example.jdbc.po.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CommentRepository extends MongoRepository<Comment, String> {
//    @Aggregation("{ $group: { _id : $lastname, names : { $addToSet : :#{?0} } } }")
    @Query(":#{?0}")
    Comment searchByDates(String sql);
}
