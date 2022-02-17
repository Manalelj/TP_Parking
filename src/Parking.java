import java.util.ArrayList;

public class Parking {
    String nom="";
    private int place_voiture=10;
    private int place_moto=15;
    private int place_velo=10;
    private ArrayList<Vehicule> vehicule_parked = new ArrayList<Vehicule>();

    public Parking(String nom) {
        this.nom = nom;
    }

    public Parking(String nom, int place_voiture, int place_moto) {
        this.nom = nom;
        this.place_voiture = place_voiture;
        this.place_moto = place_moto;
    }

    public boolean verify_entrance(Vehicule vehicule) {
        if (vehicule instanceof Voiture){
            if(place_voiture>0){
                place_voiture--;
                System.out.println("Parking : je suis le parking "+ this.nom+" et je viens d'accepter une voiture. Il me reste maintenant "+place_voiture+" places pour ce les voitures en mon antre." );
                vehicule_parked.add(vehicule);
                return true;
            }else{
                System.out.println("Parking : je suis le parking "+ this.nom +" et je viens de refuser une voiture.");
            }
        }
        if (vehicule instanceof Moto) {
            if(place_moto>0){
                place_moto--;
                System.out.println("Parking : je suis le parking "+ this.nom+" et je viens d'accepter une moto. Il me reste maintenant "+place_moto+" places pour ce les motos en mon antre." );
                vehicule_parked.add(vehicule);
                return true;
            }else{
                System.out.println("Parking : je suis le parking "+ this.nom +" et je viens de refuser une moto.");
            }
        }
        if (vehicule instanceof Velo){
            if(place_velo>0){
                place_velo--;
                System.out.println("Parking : je suis le parking "+ this.nom+" et je viens d'accepter un velo. Il me reste maintenant "+place_velo+" places pour ce les velos en mon antre." );
                vehicule_parked.add(vehicule);
                return true;
            }else{
                System.out.println("Parking : je suis le parking "+ this.nom +" et je viens de refuser un velo.");
            }
        }
        return false;
    }

    public void parked_vehicules(String color){
        int count=0;
        for (Vehicule v: vehicule_parked) {
            if(v.couleur.equals(color)){
                count++;
            };
        }
        System.out.println("je suis le parking "+ this.nom +" et j’ai "+ count +" véhicule(s) "+ color +" en mon antre.");

    }

}
