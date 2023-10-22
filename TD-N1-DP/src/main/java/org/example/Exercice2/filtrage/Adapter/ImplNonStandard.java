package org.example.Exercice2.filtrage.Adapter;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        int[] filteredData = data;
        for (int i = 0; i < data.length; i++) {
            filteredData[i] = data[i] + 1;
        }
        System.out.println("Filtre 3 appliqué");
        for (int i = 0; i < filteredData.length; i++) {
            System.out.print(filteredData[i] + " ");
        }
        return filteredData;
    }
}
