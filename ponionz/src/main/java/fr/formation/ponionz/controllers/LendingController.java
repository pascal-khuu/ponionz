package fr.formation.ponionz.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ponionz.domain.dtos.LendingCreate;
import fr.formation.ponionz.domain.dtos.LendingView;
import fr.formation.ponionz.service.ServiceLending;

@RestController
@RequestMapping("/lending")
public class LendingController {
    private final ServiceLending service;

    public LendingController(ServiceLending service) {
	this.service = service;
    }

    // create a lending in "ponionz"
    @PostMapping
    public void createLending(@Valid @RequestBody LendingCreate dto) {
	service.createLending(dto);
    }

    @GetMapping("/{id}")
    // Get a lending by id in the database "ponionz"
    public LendingView GetLendingById(@PathVariable("id") Long id) {
	return service.GetLendingById(id);
    }

}
