public class Voiture extends Vehicule{
    public Voiture() {
    }
    public void Demande_entrance(Parking p){
        if (p.verify_entrance(this)){
            System.out.println("Voiture : vroum ! vroum ! ma couleur est "+this.couleur +" et je peux rentrer dans le parking");
        }
    }
}
