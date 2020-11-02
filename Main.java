package com.agustinbergomi.practicas;

public class Main {
    public static void main(String[] args) {
        final short enteroCorto = 120; //32767
        int enteroNormal = 2023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo= 23.8732492;
        char caracter = 'a';
        boolean esValido = true;

        enteroLargo = 2506L;
        enteroNormal = 14 % 3;

        nuevoTema("Variables y constantes");
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        System.out.println(enteroCorto);
        System.out.println(caracter);
        System.out.println(esValido);

        String[] nombres = new String[]{"Alain","Mary","Ricardo","Claudia"};

        nuevoTema("Arreglos");
//        System.out.println();
//        System.out.println("Arreglos");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        nuevoTema("Ciclos y condiciones");
//        System.out.println();
//        System.out.println("Ciclos y condiciones");
        if(enteroLargo > 500){
            System.out.println("Es mayor");
        }else if(enteroLargo == 500){
            System.out.println("Es igual");
        }else{
            System.out.println("Es menor");
        }

        System.out.println(enteroLargo > 1000 ? "Es mayor" : "No es mayor");

        for(int i = 0; i<3; i++){
            System.out.println("Posicion: " + i);
        }

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        nuevoTema("Switch");
//        System.out.println();
//        System.out.println("Switch");
        int index = (int) (Math.random() * 5);
        String nombreAleatorio = index < 4 ? nombres[index] : "Anonimo";//"Anonimo";
        System.out.println("El valor de index: " + index);
        switch (nombreAleatorio){
            case "Alain":
                System.out.println("Soy yo!");
                break;
            case "Mary":
            case "Ricardo":
            case "Claudia":
                System.out.println("Es " + nombreAleatorio);
                break;
            default:
                System.out.println("Esta persona no existe en nuestro listado.");
        }
    }

    public static void nuevoTema(String title){
        System.out.println("\n===============================>" + title + ":");
    }


}