package com.cezklosowski.module.dashboard;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    public ArticleDto getArticle(){
        return new ArticleDto()
                .setTitle("AWS Certifield Cloud Practitioner (CLF-C01")
                .setText("lorem ipsum ...")
                .setComments(
                        List.of(
                                new CommentDto("admin","text 1"),
                                new CommentDto("admin","text 2"),
                                new CommentDto("admin","text 3")
                        )
                );
    }
}
