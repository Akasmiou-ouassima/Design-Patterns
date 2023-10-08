package org.example;

public class ICalculerIGRAlgerie implements ICalculeIGR {
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        System.out.println("En Algérie");
        float salaireBrutAnnuel=salaireBrutMensuel*12;
        float taux=35;
        return salaireBrutAnnuel*taux/100;
    }
}
