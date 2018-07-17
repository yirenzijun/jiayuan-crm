package com.jiayuan.crm.basetestjiayuancloud.bean;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
}
