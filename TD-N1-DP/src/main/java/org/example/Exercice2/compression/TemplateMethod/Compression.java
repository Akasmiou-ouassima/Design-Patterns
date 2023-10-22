package org.example.Exercice2.compression.TemplateMethod;

public abstract class Compression {
    public int compresser(int[] data){
        int sum = 0;
        int res;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        if (sum % 2 == 0){
            res=compresser1(sum);
            System.out.println("Compression appliquée "+res);
        }else {
            res=compresser2(sum);
            System.out.println("Compression appliquée "+res);
        }

        return res;
    }
    protected abstract int compresser1(int d);
    protected abstract int compresser2(int d);
}
