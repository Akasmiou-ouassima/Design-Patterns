package org.example.Exercice2.compression.TemplateMethod;

import org.example.Exercice2.compression.TemplateMethod.Compression;

public class Compression2 extends Compression {
    @Override
    protected int compresser1(int d) {
        return d/2;
    }

    @Override
    protected int compresser2(int d) {
        return d * 2;
    }

}
