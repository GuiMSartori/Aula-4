package com.mycompany.mavenproject1;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getCircunferencia() {
        return 2 * raio * Math.PI;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return raio * raio * Math.PI;
    }
}
