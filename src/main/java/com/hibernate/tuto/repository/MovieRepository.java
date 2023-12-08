package com.hibernate.tuto.repository;

import com.hibernate.tuto.domain.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MovieRepository {

    private Logger logger = LoggerFactory.getLogger(MovieRepository.class);
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void createMovie(Movie movie){
        logger.trace("entityManager.contains(movie: "+ movie.getName()+") : "+entityManager.contains(movie));
        entityManager.persist(movie);
        logger.trace("entityManager.contains(movie: "+ movie.getName()+") : "+entityManager.contains(movie));
    }

    public List<Movie> getAll(){
        throw new UnsupportedOperationException();
    }
}
