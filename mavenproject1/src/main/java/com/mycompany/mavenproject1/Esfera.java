package com.mycompany.mavenproject1;

public class Esfera extends Circulo {

    public Esfera(double raio) {
        super(raio);
    }

    public double getVolume() {
        return getRaio() * getRaio() * getRaio() * 3.14 * (4 / 3);
    }
}
