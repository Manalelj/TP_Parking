import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //Entrer les données du Parking
        Scanner in = new Scanner(System.in);
        System.out.println("Entrer les données du Parking ");

        System.out.println("Nom : ");
        String name =  in.nextLine();

        System.out.println("Nombre de places pour voitures : ");
        int  place_voiture = in.nextInt();
        while (place_voiture < 10 ) {
            System.out.println("Le parking doit disposer de plus de 10 places pour les voitures");
            place_voiture = in.nextInt();
        }


        System.out.println("Nombre de places pour Motos : ");
        int place_moto = in.nextInt();
        while(place_moto < 1 ) {
            System.out.println("Le parking doit disposer au moins d'une place pour les motos");
            place_moto = in.nextInt();
        }



        //Créer 2 Parkings
        Parking P=new Parking(name,place_voiture,place_moto);
        Parking P1=new Parking("Gare sud");

        //Créer 3 motos
        Vehicule moto=new Moto();
        Vehicule moto2=new Moto();
        Vehicule moto3=new Moto();

        //Créer une voiture
        Vehicule voiture=new Voiture();

        //Créer 11 velos
        Vehicule velo=new Velo();
        Vehicule velo1=new Velo();
        Vehicule velo2=new Velo();
        Vehicule velo3=new Velo();
        Vehicule velo4=new Velo();
        Vehicule velo5=new Velo();
        Vehicule velo6=new Velo();
        Vehicule velo7=new Velo();
        Vehicule velo8=new Velo();
        Vehicule velo9=new Velo();
        Vehicule velo0=new Velo();




        //3 motos demandent d'entrer en parking
        moto.Demande_entrance(P);
        moto2.Demande_entrance(P);
        moto3.Demande_entrance(P);
        System.out.println();

        //11 velos demande d'entrer en parking
        velo.Demande_entrance(P);
        velo1.Demande_entrance(P);
        velo2.Demande_entrance(P);
        velo3.Demande_entrance(P);
        velo4.Demande_entrance(P);
        velo5.Demande_entrance(P);
        velo6.Demande_entrance(P);
        velo7.Demande_entrance(P);
        velo8.Demande_entrance(P);
        velo9.Demande_entrance(P);
        velo0.Demande_entrance(P);
        System.out.println();

        //Une voiture demande d'entrer en parking
        voiture.Demande_entrance(P);
        System.out.println();

        //Demander le nombre de vehicule stationné dans un parking
        Scanner inn = new Scanner(System.in);
        System.out.println("Coleur : ");
        String color =  inn.nextLine();
        P.parked_vehicules(color.toLowerCase(Locale.ROOT));
    }
}
