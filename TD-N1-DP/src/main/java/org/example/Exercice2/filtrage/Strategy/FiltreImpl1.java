package org.example.Exercice2.filtrage.Strategy;

import org.example.Exercice2.filtrage.Strategy.Filtre;

public class FiltreImpl1 implements Filtre {
    @Override
    public int[] filter(int[] data) {
        int count = 0;
        for (int num : data) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] filteredData = new int[count];
        int index = 0;
        for (int num : data) {
            if (num % 2 == 0) {
                filteredData[index] = num;
                index++;
            }
        }
        System.out.println("filter 1 appliqué");
        for (int num : filteredData) {
            System.out.print(num+" ");
        }
        return filteredData;
    }
}
