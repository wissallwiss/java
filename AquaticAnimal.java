package tn.esprit.gestionzoo.entitees;

public abstract class AquaticAnimal extends Animal {
    private String habitat;

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

    // Méthode swim() déclarée comme abstraite
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AquaticAnimal other = (AquaticAnimal) obj;
        return getName().equals(other.getName()) &&
                getAge() == other.getAge() &&
                habitat.equals(other.getHabitat());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + habitat.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}
