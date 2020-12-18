package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.personEntity;
import com.example.demo.repo.personRepository;



@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "http://localhost:4200")
public class personController {

	@Autowired
	private personRepository repo;
	
	@GetMapping("/users")
    public List<personEntity> getUsers() {
        return (List<personEntity>) repo.findAll();
    }

    @PostMapping("/users")
    void addPerson(@RequestBody personEntity person) {
        repo.save(person);
    }

	
}
