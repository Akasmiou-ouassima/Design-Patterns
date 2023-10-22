package org.example.Exercice2;

import org.example.Exercice2.compression.TemplateMethod.Compression;
import org.example.Exercice2.filtrage.Strategy.Filtre;

public class FrameworkImage {
    private int[] image;
    private Filtre filtre;
    private Compression compresser;
    public FrameworkImage(int[] data, Filtre filtre, Compression compresser) {
        this.image = data;
        this.compresser= compresser;
        this.filtre = filtre;
    }

    public FrameworkImage(int[] image) {
        this.image = image;
    }

    public Filtre getFiltre() {
        return filtre;
    }

    public Compression getCompresser() {
        return compresser;
    }

    public int[] getImage() {
        return image;
    }

    public void setCompresser(Compression compresser) {
        this.compresser = compresser;
    }

    public void setFiltre(Filtre filtre) {
        this.filtre = filtre;
    }

    public void setImage(int[] image) {
        this.image = image;
    }
}
