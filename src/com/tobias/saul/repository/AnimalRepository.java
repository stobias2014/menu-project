package com.tobias.saul.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.tobias.saul.model.Animal;

public class AnimalRepository {
	
	static long animalId = 0;
	private final Map<Long, Animal> animals;
	
	public AnimalRepository() {
		animals = new HashMap<Long, Animal>();
	}
	
	public void save(Animal animal) {
		animals.put(animalId, animal);
		animalId++;
	}
	
	public Animal get(long animalId) {
		Animal animal = animals.get(animalId);
		return animal;
	}

	public List<Animal> getAll() {
		return animals.values().stream().collect(Collectors.toList());
	}
	

}
