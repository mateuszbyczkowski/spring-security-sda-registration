package com.kss.springmovies.service;

import com.kss.springmovies.dto.Actor;
import com.kss.springmovies.repository.EntityExistsException;
import com.kss.springmovies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final IActorRepository actorRepository;

    @Autowired
    public ActorService(IActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findActors() {
        return this.actorRepository.findAll();
    }

    public Page<Actor> findActors(Integer page, Integer limit) {
        return this.actorRepository.findAll(PageRequest.of(page, limit));
    }

    public void deleteById(Long id) {
        this.actorRepository.deleteById(id);
    }

    public Actor addActor(Actor actor) {

        if(this.actorRepository.existsByNameAndSurname(actor.getName(), actor.getSurname())){
            throw new EntityExistsException("Actor already exists");
        } else {
            return this.actorRepository.save(actor);
        }
    }
}
