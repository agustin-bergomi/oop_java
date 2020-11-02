package com.agustinbergomi.practicas;

public class Apartamento extends Casa{
    private short numeroInterno;

    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion, float impuestos, double metrosCubicos, boolean hipotecada, short numeroInterno) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuestos, metrosCubicos, hipotecada);
        this.numeroInterno = numeroInterno;
    }
}
