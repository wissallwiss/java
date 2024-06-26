package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entitees.*;



import tn.esprit.gestionzoo.entitees.Animal;
import tn.esprit.gestionzoo.entitees.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");





        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal();
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 10, true, "Ocean", 20.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Tux", 5, true, "Antarctica", 50.0f);

        System.out.println(dolphin);


        System.out.println(penguin);

        System.out.println(terrestrialAnimal);





        dolphin.swim();
        penguin.swim();}}


  Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        for (int i = 0; i < myZoo.getNbrAquaticAnimals(); i++) {
            myZoo.getAquaticAnimal(i).swim();
        }
     myZoo.displayAnimals();

        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
//        System.out.println(tn.esprit.gestionzoo.entitees.Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());
// Test Aquatic
        Aquatic aquatic = new Aquatic();
        aquatic.eatMeat(Food.MEAT); // Output: Aquatic is eating meat.
        aquatic.eatMeat(Food.PLANT); // Output: Aquatic cannot eat this.

        // Test Terrestrial
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.eatMeat(Food.MEAT); // Output: Terrestrial is eating meat.
        terrestrial.eatPlant(Food.PLANT); // Output: Terrestrial is eating plants.
        terrestrial.eatPlantAndMeat(Food.BOTH); // Output: Terrestrial is eating plants and meat.
    }

    }
}*/
