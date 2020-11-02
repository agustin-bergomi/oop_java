package com.agustinbergomi.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Independencia", 'd',(short)34,2000000,1104537600000L, 2.5f, 230.39472837942,false);

        System.out.println(miCasa);

        Casa maryCasa = new Casa("Reforma",(short)543, 3500000, true);
        Casa claudiaCasa = new Casa("Roma",(short)12, 1200000,false);

        System.out.println(maryCasa);

        Main.nuevoTema("listas");
        List<Casa> casasList = new ArrayList<>();
        casasList.add(miCasa);
        casasList.add(maryCasa);
        casasList.add(claudiaCasa);

        casasList.remove(1);
        casasList.set(1,miCasa);

        for (Casa currentCasa : casasList){
            System.out.println(currentCasa);
        }

        Main.nuevoTema("Diccionarios");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("alain",miCasa);
        casaMap.put("mary",maryCasa);
        casaMap.put("claudia",claudiaCasa);

        System.out.println(casaMap.size());
        casaMap.remove("alain");
        System.out.println(casaMap.size());

        casaMap.put("mary", claudiaCasa);
        System.out.println(casaMap.get("mary"));

        Main.nuevoTema("Herencia");
        Apartamento apartamentoPlaya = new Apartamento("Malecon",'B', (short) 101,2600000,901993210313L, 6.3f, 180.18273888, true, (short)5);
        System.out.println(apartamentoPlaya);

        Main.nuevoTema("Polimorfismo");
        venderPropiedad(miCasa);
        venderPropiedad(apartamentoPlaya);
        Casa apartamentoCiudad = new Apartamento("Principal",'F',(short)913, 1950000,90128381023L,4.35f,145.634,false,(short)2);
        venderPropiedad(apartamentoCiudad);
        Casa casaNueva = new Casa();
        casaNueva.setCalle("Cortez");
        casaNueva.setHipotecada(true);
        casaNueva.setImpuestos(2.1f);
        System.out.println(casaNueva);
        venderPropiedad(casaNueva);

        Main.nuevoTema("Equals y Hashcode");
        Casa miSegundaCasa = new Casa("Independencia", 'd',(short)34,2000000,1104537600000L, 2.5f, 230.39472837942,false);
        System.out.println(miCasa.equals(miSegundaCasa));
        Casa miTerceraCasa = new Casa();
        System.out.println(casaMap.containsValue(claudiaCasa));
    }

    private static void venderPropiedad(Casa casa) {
        if (casa.isHipotecada()){
            System.out.println("Imposible vender!");
        }else{
            System.out.println("En venta.");
        }
    }
}
