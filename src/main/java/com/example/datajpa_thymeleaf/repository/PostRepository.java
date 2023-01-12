package com.example.datajpa_thymeleaf.repository;

import com.example.datajpa_thymeleaf.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Post : Entity Type, Long : Primary Type
public interface PostRepository extends JpaRepository<Post, Long> {
            Optional<Post> findByUrl(String url);
}
