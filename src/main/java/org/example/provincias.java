package org.example;

import java.util.Arrays;

public class provincias {
    public static void main(String[] args) {
        String user = new String("oscar");
        String password ="123";
        String codigoPostal = new String("28017");
        String provincias [] = {"Aranjuez","guadarrama","san blas","Gracia","parq Güell"};
        for (int i = 0; i < provincias.length; i++) {
            System.out.println(provincias[i].toUpperCase());
        }
        for (int i = 0; i < provincias.length; i++) {
            System.out.println(provincias[i]);
        }
        for (int i = 0; i < provincias.length; i++) {
            provincias[i] = provincias[i].toUpperCase();
            System.out.println(provincias[i]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < provincias.length; i++) {
            if (provincias[i].equalsIgnoreCase("GUADARRAma"))
                System.out.println(provincias[i]);
        }
        for (int j = 0; j < provincias.length - 1; j++){
            for (int i = 0; i < provincias.length-1; i++) {
                if (provincias[i].compareTo(provincias[i + 1]) < 0) {
                    String aux = provincias[i];
                    provincias[i] = provincias[i + 1];
                    provincias[i + 1] = aux;
                }
            }
        }
        for (int i = 0; i < provincias.length; i++) {
            System.out.println(provincias[i]);

        }
        char[] provincia = provincias[provincias.length-1].toCharArray();
        for (int i = 0; i < provincia.length; i++) {
            if (provincia[i]=='a')
                provincia[i]='@';
        }
        System.out.println(Arrays.toString(provincia));


        //for (int i = 0; i < codigoPostales.length; i++) {
        //    if (codigoPostales[i].indexOf("08")!=-1)
        //        System.out.println(codigoPostales[i]);
        //}

        //System.out.println(user.charAt(0));
        //System.out.println(user.indexOf('c',2));//,3 apartir del que esta en esa posicion
    }
}

