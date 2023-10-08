package org.example;

public class ICalculerIGRMaroc implements ICalculeIGR {
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        System.out.println("Au Maroc");
        float salaireBrutAnnuel=salaireBrutMensuel*12;
        if (salaireBrutAnnuel<40000){
            float taux=5;
            return salaireBrutAnnuel*taux/100;
        } else if (salaireBrutAnnuel > 40000 && salaireBrutAnnuel <120000) {
            float taux=20;
            return salaireBrutAnnuel*taux/100;
        }else {
            float taux=42;
            return salaireBrutAnnuel*taux/100;
        }
    }
}
