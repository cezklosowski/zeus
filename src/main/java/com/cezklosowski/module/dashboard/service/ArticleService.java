package com.cezklosowski.module.dashboard.service;

import com.cezklosowski.module.dashboard.dto.ArticleDto;
import com.cezklosowski.module.dashboard.dto.CommentDto;
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
