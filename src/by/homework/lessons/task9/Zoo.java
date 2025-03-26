package by.homework.lessons.task9;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = Arrays.copyOf(animals, animals.length + 1);
        newAnimals[animals.length] = animal;
        this.animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void removeAnimal(int id) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        int index = 0;
        for (Animal animal : animals) {
            if (animal.getId() != id) {
                newAnimals[index++] = animal;
            }
        }
        this.animals = newAnimals;
    }

    public void displayAllAnimalInfo() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
