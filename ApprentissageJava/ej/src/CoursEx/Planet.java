package CoursEx;

public record Planet(String nom, double perimetre, int superficie) implements IPlanet {
    
    @Override
    public void afficher() {
        System.out.println("Je suis la planète " + this.nom);
    }
    
}
