package tn.esprit.gestionzoo.entitees;

public  class AquaticAnimal extends Animal {
    private String habitat;
    public AquaticAnimal() {

    }
    public AquaticAnimal(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}
