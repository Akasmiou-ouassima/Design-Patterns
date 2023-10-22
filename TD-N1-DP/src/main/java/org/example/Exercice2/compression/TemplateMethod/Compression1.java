package org.example.Exercice2.compression.TemplateMethod;

import org.example.Exercice2.compression.TemplateMethod.Compression;

import java.util.Random;

public class Compression1 extends Compression {
    @Override
    protected int compresser1(int d) {
        return (int) Math.pow(d, 2);
    }

    @Override
    protected int compresser2(int d) {
        return d * new Random().nextInt(100);
    }
}
