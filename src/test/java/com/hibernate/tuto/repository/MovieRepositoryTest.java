package com.hibernate.tuto.repository;

import com.hibernate.tuto.config.PersistenceConfig;
import com.hibernate.tuto.domain.Movie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {PersistenceConfig.class})
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository repository;

    @Test
    public void save_casNominal(){
        Movie movie = new Movie();
        movie.setName("Matrix");
        repository.createMovie(movie);
        System.out.println("Création avec succès");
    }
}
