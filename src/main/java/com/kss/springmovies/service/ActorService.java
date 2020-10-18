package com.kss.springmovies.service;

import com.kss.springmovies.dto.Actor;
import com.kss.springmovies.dto.Movie;
import com.kss.springmovies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final IActorRepository actorRepository;

    @Autowired
    public ActorService(IActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findActors(){
        return this.actorRepository.findAll();
    }

    public void deleteById(Long id){
        this.actorRepository.deleteById(id);
    }

    public Actor addActor(Actor actor){
        return this.actorRepository.save(actor);
    }
}
