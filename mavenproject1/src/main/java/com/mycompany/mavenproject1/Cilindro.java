package com.mycompany.mavenproject1;

public class Cilindro extends Circulo {

    private int altura;

    public Cilindro(int altura, double raio) {
        super(raio);
        this.altura = altura;
    }

    public double getVolume() {
        return getArea() * altura;
    }
}
