package com.example.datajpa_thymeleaf.service.impl;

import com.example.datajpa_thymeleaf.dto.PostDto;
import com.example.datajpa_thymeleaf.entity.Post;
import com.example.datajpa_thymeleaf.mapper.PostMapper;
import com.example.datajpa_thymeleaf.repository.PostRepository;
import com.example.datajpa_thymeleaf.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(PostMapper::mapToPostDto)
                .collect(Collectors.toList());

    }
}
