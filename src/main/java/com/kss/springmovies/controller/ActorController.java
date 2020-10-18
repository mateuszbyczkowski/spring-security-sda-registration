package com.kss.springmovies.controller;

import com.kss.springmovies.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {

    private final IActorRepository actorRepository;

    @Autowired
    public ActorController(IActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("actor")
    public String readAllActors(Model model) {
        model.addAttribute("actorsVariable", actorRepository.findAll(PageRequest.of(10,10))
                .getContent());
        return "actors";
    }
}
