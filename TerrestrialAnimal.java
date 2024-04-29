package tn.esprit.gestionzoo.entitees;

public  class TerrestrialAnimal extends Animal  implements Omnivore<Food> {
    private int nbrLegs;
    public TerrestrialAnimal(){}
    public TerrestrialAnimal(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial is eating meat.");
        } else {
            System.out.println("Terrestrial cannot eat this.");
        }
    }
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial is eating plants.");
        } else {
            System.out.println("Terrestrial cannot eat this.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial is eating plants and meat.");
    }
}

}
