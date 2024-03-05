
package tn.esprit.gestionzoo.entitees;

public class Animal {
    private String family; // L'attribut est maintenant privé
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur de la classe tn.esprit.gestionzoo.entitees.Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // Utilisation de la méthode setAge pour garantir un âge non négatif
        this.isMammal = isMammal;
    }
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    public Animal(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }
        this.age = age;
    }
}

    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mamal){
        isMammal=mamal;
    }

    public String getName() {
        return this.name;
    }
    // Méthode publique pour définir l'âge avec une vérification de non-négativité
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif. La valeur par défaut de 0 sera utilisée.");

        }
    }

    // Méthode publique pour obtenir l'âge
    public int getAge() {
        return age;
    }

    // Autres getters et setters pour les attributs name, family et isMammal

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entitees.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
