package com.kss.springmovies.runners;

import com.kss.springmovies.dto.Actor;
import com.kss.springmovies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AddActorsRunner implements CommandLineRunner {

    private final IActorRepository actorRepository;

    @Autowired
    public AddActorsRunner(IActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (actorRepository.count() == 0) {
            Actor actor = new Actor();
            actor.setName("Keanu");
            actor.setSurname("Reaves");

            Actor actor1 = new Actor();
            actor1.setName("Natalie");
            actor1.setSurname("Portman");

            actorRepository.save(actor);
            actorRepository.save(actor1);
        }
    }
}
