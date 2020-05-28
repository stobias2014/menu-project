package com.tobias.saul.processor;

import java.util.List;
import java.util.Scanner;

import com.tobias.saul.model.Animal;
import com.tobias.saul.repository.AnimalRepository;

public class OptionProcessor {
	
	private final Scanner in;
	private final AnimalRepository animalRepository;
	
	public OptionProcessor() {
		in = new Scanner(System.in);
		animalRepository = new AnimalRepository();
	}
	
	public int inputOptionProcess(int option) {
		
		Animal animal;
		
		switch(option) {
			case 1:
				animal = getAnimalDetails();
				animalRepository.save(animal);
				break;
			case 2:
				System.out.println("Enter Id: ");
				long animalId = in.nextLong();
				animal = animalRepository.get(animalId);
				System.out.println("\nRetrieved: " + animal);
				System.out.println();
				break;
			case 3:
				List<Animal> animals = animalRepository.getAll();
				System.out.println("Animals Available");
				System.out.println("--------");
				animals.forEach(System.out::println);
				System.out.println("--------");
				System.out.println();
				break;
			case 4:
				System.out.println("Exit program chosen");
				break;
			default:
				System.out.println("Option not valid");
			
		}
		
		return option;
		
	}
	
	public Animal getAnimalDetails() {
		System.out.println("Enter name");
		String name = in.nextLine();
		System.out.println();
		return new Animal(name);
	}

}
