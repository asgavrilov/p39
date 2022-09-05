package com.crawler.configuration;

import com.crawler.entities.Category;
import com.crawler.entities.Keyword;
import com.crawler.service.CategoryStorage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

@Log4j2
@Component
@AllArgsConstructor
public class InitConfig {

    private CategoryStorage categoryStorage;

    @PostConstruct
    void init() {
        Category starWars = new Category("Star Wars");
        starWars.addKeywords(Set.of(
                new Keyword[]{
                new Keyword("star war"),
                new Keyword("starwars"),
                new Keyword("starwar"),
                new Keyword("r2d2"),
                new Keyword("may the force be with you")
        }));

        Category basketball = new Category("Basketball");
        basketball.addKeywords(Set.of(
                new Keyword[]{
                new Keyword("basketball"),
                new Keyword("nba"),
                new Keyword("ncaa"),
                new Keyword("lebron james"),
                new Keyword("john stokton"),
                new Keyword("anthony davis")
        }));

        Category news = new Category("Boris Johnson");
        news.addKeywords(Set.of(
                new Keyword[]{
                new Keyword("johnson"),
                new Keyword("war"),
                new Keyword("uk")
        }));

        categoryStorage.addCategory(starWars);
        categoryStorage.addCategory(basketball);
        categoryStorage.addCategory(news);
        log.debug("{} categories have been created", categoryStorage.getCategories().size());
    }
}
