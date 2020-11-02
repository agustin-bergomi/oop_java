package com.agustinbergomi.practicas;

import java.util.Objects;

public class Casa {
    private String calle;
    private char seccion;
    private short numero;
    private int precio;
    private long fechaConstruccion;
    private float impuestos;
    private double metrosCubicos;
    private boolean hipotecada;


    public Casa(String calle, char seccion, short numero, int precio, long fechaConstruccion, float impuestos, double metrosCubicos, boolean hipotecada) {
        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.impuestos = impuestos;
        this.metrosCubicos = metrosCubicos;
        this.hipotecada = hipotecada;
    }

    public Casa(String calle, short numero, int precio, boolean hipo) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.hipotecada = hipo;
    }
    public Casa(){

    }

    public String getCalle() {
        return calle;
    }

    public char getSeccion() {
        return seccion;
    }

    public short getNumero() {
        return numero;
    }

    public int getPrecio() {
        return precio;
    }

    public long getFechaConstruccion() {
        return fechaConstruccion;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public double getMetrosCubicos() {
        return metrosCubicos;
    }

    public boolean isHipotecada() {
        return hipotecada;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFechaConstruccion(long fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public void setMetrosCubicos(double metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public void setHipotecada(boolean hipotecada) {
        this.hipotecada = hipotecada;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", impuestos=" + impuestos +
                ", metrosCubicos=" + metrosCubicos +
                ", hipotecada=" + hipotecada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return seccion == casa.seccion &&
                numero == casa.numero &&
                precio == casa.precio &&
                fechaConstruccion == casa.fechaConstruccion &&
                Float.compare(casa.impuestos, impuestos) == 0 &&
                Double.compare(casa.metrosCubicos, metrosCubicos) == 0 &&
                hipotecada == casa.hipotecada &&
                Objects.equals(calle, casa.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, seccion, numero, precio, fechaConstruccion, impuestos, metrosCubicos, hipotecada);
    }
}
