package org.example.Exercice2;


import org.example.Exercice2.compression.TemplateMethod.Compression;
import org.example.Exercice2.compression.TemplateMethod.Compression1;
import org.example.Exercice2.compression.TemplateMethod.Compression2;
import org.example.Exercice2.filtrage.Adapter.Adapter;
import org.example.Exercice2.filtrage.Strategy.Filtre;
import org.example.Exercice2.filtrage.Strategy.FiltreImpl1;
import org.example.Exercice2.filtrage.Strategy.FiltreImpl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
        public static void main(String[] args) throws IOException, IOException {
            int[] image = {2,3,7,8,12,20,69,90,4,78};
            FrameworkImage data = new FrameworkImage(image);

            System.out.println("******** Traitement d'une image ********");
            System.out.print("L'image d'origine est représentée par le tableau suivant : [");
            for (int i = 0; i < data.getImage().length; i++) {
                System.out.print(" " + data.getImage()[i]);
            }
            System.out.println("]");

            int choixFiltre;
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nMenu 1 : (Filtre)");
            System.out.println("1- Appliquer le filtre 1 ");
            System.out.println("2- Appliquer le filtre 2 ");
            System.out.println("3- Appliquer l'ancienne version du filtre ");
            System.out.println("4- Ne pas appliquer de filtre");

            do {
                System.out.println("\nChoisissez une option du menu 1 :");
                choixFiltre = Integer.parseInt(lecteur.readLine());

                switch (choixFiltre) {
                    case 1:
                        data.setFiltre(new FiltreImpl1());
                        data.getFiltre().filter(data.getImage());
                        break;
                    case 2:
                        data.setFiltre(new FiltreImpl2());
                        data.getFiltre().filter(data.getImage());
                        break;
                    case 3:
                        data.setFiltre(new Adapter());
                        data.getFiltre().filter(data.getImage());
                        break;
                }
            } while (choixFiltre != 4);

            System.out.println("\nMenu 2 : (Compression)");
            int choixCompression;

            System.out.println("1- Appliquer la Compression 1");
            System.out.println("2- Appliquer la Compression 2");
            System.out.println("3- Quitter");

            do {
                System.out.println("\nChoisissez une option du menu 2 :");
                choixCompression = Integer.parseInt(lecteur.readLine());

                switch (choixCompression) {
                    case 1:
                        data.setCompresser(new Compression1());
                        data.getCompresser().compresser(data.getImage());
                        break;
                    case 2:
                        data.setCompresser(new Compression2());
                        data.getCompresser().compresser(data.getImage());
                        break;
                }
            } while (choixCompression != 3);

            System.out.println("Le traitement de l'image est terminé. Merci !");
        }
    }


