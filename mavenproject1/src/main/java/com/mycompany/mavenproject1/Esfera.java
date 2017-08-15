package com.mycompany.mavenproject1;

public class Esfera extends Circulo {

    public Esfera(double raio) {
        super(raio);
    }

    public double getVolume() {
        return getRaio() * getRaio() * getRaio() * Math.PI * (4 / 3);
    }
}
