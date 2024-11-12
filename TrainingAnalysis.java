package Boucles;
import java.util.Scanner;
public class TrainingAnalysis {
    public static void main(String[] args) {
        int compteur;
        float min_time = 100000000, max_time = 0, total_minutes, total_heures, max_minutes, max_heures, min_heures, min_minutes;
        float training_time [] = {60, 75, 80, 60, 120, 130, 50};
        float bpm [] = {135, 140, 138, 145, 125, 150, 133};
        float moyenne_bpm = 0, moyenne_training_time = 0, somme_training_time = 0;

        Scanner monScanner = new Scanner(System.in);

        for (compteur=0; compteur < training_time.length; compteur++){

            somme_training_time += training_time[compteur];

            if(max_time < training_time[compteur]){
                max_time = training_time[compteur];
            }

            if (min_time > training_time[compteur]){
                min_time = training_time[compteur];
            }

            moyenne_training_time += training_time[compteur] /training_time.length;

        }

        for (compteur=0; compteur < bpm.length; compteur++){
            moyenne_bpm += bpm[compteur] / bpm.length;
        }

        total_heures = (int) somme_training_time / 60;
        total_minutes = (int) somme_training_time % 60;

        max_heures= (int) max_time / 60;
        max_minutes = (int) max_time % 60;

        min_heures= (int) min_time / 60;
        min_minutes = (int) min_time % 60;

        System.out.printf("Temps d'entraînement total : " + Math.round(total_heures) + " heure(s) et " + Math.round(total_minutes) + " minute(s).\n");
        System.out.println("Temps d'entrainement maximal de la semaine : " + Math.round(max_heures) + " heure(s) et " + Math.round(max_minutes) + " minute(s).");
        System.out.println("Temps d'entrainement minimal de la semaine : " + Math.round(min_heures) + " heure(s) et " + Math.round(min_minutes) + " minute(s).");
        System.out.println("Moyenne du bpm : " + moyenne_bpm);
        System.out.println("Le temp d'entraînement moyen sur la semaine est de : " + Math.round(moyenne_training_time) + " minutes, soit " + moyenne_training_time / 60 + " heure(s)");
    }
}

