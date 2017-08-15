package com.mycompany.mavenproject1;

public class Cilindro {

    private int altura;
    private Circulo base;

    public Cilindro(int altura, Circulo base) {
        this.altura = altura;
        this.base = base;
    }

    public double getVolume() {
        return base.getArea() * altura;
    }

    public double getArea() {
        return (base.getArea() * 2) + (base.getCircunferencia() * altura);
    }
}
