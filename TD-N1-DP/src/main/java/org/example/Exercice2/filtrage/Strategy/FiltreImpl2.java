package org.example.Exercice2.filtrage.Strategy;

import org.example.Exercice2.filtrage.Strategy.Filtre;

import java.util.Arrays;

public class FiltreImpl2 implements Filtre {
    @Override
    public int[] filter(int[] data) {
        int[] filteredData = Arrays.stream(data)
                .filter(num -> num % 2 != 0)
                .toArray();
        System.out.println("filter 2 appliqué");
        for (int num : filteredData) {
            System.out.print(num+" ");
        }
        return filteredData;
    }
}
