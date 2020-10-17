package com.kss.springmovies.repository;

import com.kss.springmovies.dto.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorRepository extends CrudRepository<Actor, Long> {
}
