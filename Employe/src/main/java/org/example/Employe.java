package org.example;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private ICalculeIGR calculeIGR;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
    public Employe() {
    }
  /*  public float calculerIGR(){
        float salaireBrutAnnuel=salaireBrutMensuel*12;
        float taux=42;
        return salaireBrutAnnuel*taux/100;
    }*/
    public float getSalaireNetMensuel(){
        float igr=calculeIGR.calculerIGR(salaireBrutMensuel);
        float salaireNetAnnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnnuel/12;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }
    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setCalculeIGR(ICalculeIGR calculeIGR) {
        this.calculeIGR = calculeIGR;
    }

    public ICalculeIGR getCalculeIGR() {
        return calculeIGR;
    }
}
