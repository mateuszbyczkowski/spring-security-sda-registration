package com.kss.springmovies.repository;

import com.kss.springmovies.dto.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IActorRepository extends PagingAndSortingRepository<Actor, Long> {

    List<Actor> findAll();

    boolean existsByNameAndSurname(String name, String surname);

}
