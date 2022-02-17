import java.util.Random;

public class Moto extends Vehicule{
    private String[] types={"HARLEY ","SUZUKI"};
    private Random r=new Random();
    private int randomNumber=r.nextInt(types.length);
    public String type = types[randomNumber];

    public Moto() {
    }
    public void Demande_entrance(Parking p){
        if (p.verify_entrance(this)){
            System.out.println("Moto : youpi ! ma couleur est "+this.couleur +" "+ this.type +" et je peux rentrer dans le parking !");
        }
        else System.out.println("Moto :hey ! je suis une "+ this.type +" vous allez regretter de ne pas m’avoir laissé entrer.");
    }
}
