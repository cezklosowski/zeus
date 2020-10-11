package com.cezklosowski.module.news.sopot;

import com.cezklosowski.module.news.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SopotNewsService implements NewsService {
    @Override
    public List<String> getLastNews() {
        return List.of(
                "1 - News from Sopot...",
                "2 - News from Sopot...",
                "3 - News from Sopot...",
                "4 - News from Sopot...",
                "5 - News from Sopot..."
        );
    }
}
