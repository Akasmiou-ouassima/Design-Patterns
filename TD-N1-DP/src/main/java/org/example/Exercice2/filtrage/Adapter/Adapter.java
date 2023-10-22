package org.example.Exercice2.filtrage.Adapter;

import org.example.Exercice2.filtrage.Strategy.Filtre;

public class Adapter implements Filtre {
    private ImplNonStandard implNonStandard = new ImplNonStandard();

    @Override
    public int[] filter(int[] data) {
        int[] data1 = implNonStandard.appliquerFiltre("Adapter", data);
        return data1;
    }
}
