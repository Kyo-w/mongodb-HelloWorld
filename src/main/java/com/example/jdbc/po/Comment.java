package com.example.jdbc.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "comment")
public class Comment implements Serializable {
    public Comment() {
    }

    public Comment(String id, String content, String pulishtime) {
        this.id = id;
        this.content = content;
        this.pulishtime = pulishtime;
    }

    @Id
    private String id;
    @Field("content")
    private String content;
    private String  pulishtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPulishtime() {
        return pulishtime;
    }

    public void setPulishtime(String pulishtime) {
        this.pulishtime = pulishtime;
    }
}
