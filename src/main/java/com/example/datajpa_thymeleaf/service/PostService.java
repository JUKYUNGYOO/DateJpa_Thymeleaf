package com.example.datajpa_thymeleaf.service;

import com.example.datajpa_thymeleaf.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> findAllPosts();

}
