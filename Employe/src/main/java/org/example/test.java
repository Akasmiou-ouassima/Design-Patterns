package org.example;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Employe employe = new Employe();
        employe.setCin("H365788");
        employe.setSalaireBrutMensuel(175000);
        System.out.println("Quel pays ? (Maroc, Algerie)");
        Scanner in = new Scanner(System.in);
        String pays = in.nextLine();
        if (pays.equals("Maroc")){
            ICalculeIGR calculerIGR = new ICalculerIGRMaroc();
            employe.setCalculeIGR(calculerIGR);
        }else if (pays.equals("Algerie")){
            ICalculeIGR calculerIGR = new ICalculerIGRAlgerie();
            employe.setCalculeIGR(calculerIGR);
        }else {
            System.out.println("choisir soit Maroc ou Algérie");
        }
        System.out.println("le salaire net mensuel de cet employe égale à = "+employe.getSalaireNetMensuel());
    }
}
