package com.example.datajpa_thymeleaf.controller;

import com.example.datajpa_thymeleaf.dto.PostDto;
import com.example.datajpa_thymeleaf.entity.Post;
import com.example.datajpa_thymeleaf.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/admin/posts")
    public String posts(Model model){
        List<PostDto> posts = postService.findAllPosts();
        model.addAttribute("posts",posts);
//        key, value
        return "/admin/posts";
    }
}
