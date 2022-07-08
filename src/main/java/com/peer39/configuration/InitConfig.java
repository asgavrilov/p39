package com.peer39.configuration;

import com.peer39.entities.Category;
import com.peer39.entities.Keyword;
import com.peer39.service.CategoryStorage;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

@Log4j2
@Component
public class InitConfig {

    @Autowired
    CategoryStorage categoryStorage;

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
        basketball.addKeywords(Set.of(new Keyword[]{
                new Keyword("basketball"),
                new Keyword("nba"),
                new Keyword("ncaa"),
                new Keyword("lebron james"),
                new Keyword("john stokton"),
                new Keyword("anthony davis")
        }));

        categoryStorage.addCategory(starWars);
        categoryStorage.addCategory(basketball);
        log.info("{} categories have been created", categoryStorage.getCategories().size());
    }
}
