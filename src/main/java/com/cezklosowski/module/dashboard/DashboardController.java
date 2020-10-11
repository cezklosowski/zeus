package com.cezklosowski.module.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String getDashboard(Model model){
        model.addAttribute("menu",getMenu());
        model.addAttribute("article",getArticle());

        return "dashboard";
    }

    private List<MenuDto> getMenu(){
        return List.of(
                new MenuDto("AWS","http://michalszalkowski.com/aws/"),
                new MenuDto("Security","http://michalszalkowski.com/security/"),
                new MenuDto("Java","http://michalszalkowski.com/java/")
        );
    }

    private ArticleDto getArticle(){
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
