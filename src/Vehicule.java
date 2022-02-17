import java.util.Random;

public class Vehicule {
    private String[] couleurs = {"bleu","blanc","rose","noir"};
    private Random r=new Random();
    private int randomNumber=r.nextInt(couleurs.length);
    String couleur = couleurs[randomNumber];

    public Vehicule() {
    }
    public void Demande_entrance(Parking p){
        if (p.verify_entrance(this)){
            System.out.println("Vehicule : chouette, ma couleur est "+ this.couleur +" et je peux rentrer dans le parking !");
        }
        else System.out.println("Vehicule : zut je ne peux pas rentrer dans le parking.");
    }
}
