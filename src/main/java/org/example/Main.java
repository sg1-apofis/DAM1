package org.example;

public class Main {
    public static void main(String[] args){
        String user = new String("oscar");
        String password ="123";
        String codigoPostal = new String("28017");
        String codigoPostales [] = {"28300","28440","28041","28030","08001","08003"};
        for (int i = 0; i < codigoPostales.length; i++) {
            if (codigoPostales[i].charAt(0)=='2' && codigoPostales[i].charAt(1)=='8')
                System.out.println(codigoPostales[i]);
        }
        //for (int i = 0; i < codigoPostales.length; i++) {
        //    if (codigoPostales[i].indexOf("08")!=-1)
        //        System.out.println(codigoPostales[i]);
        //}
        for (int i = 0; i < codigoPostales.length; i++) {
            if (codigoPostales[i].substring(0,2).equals(""))
                System.out.println(codigoPostales[i]);
        }
        System.out.println(user.charAt(0));
        System.out.println(user.indexOf('c',3));//,3 apartir del que esta en esa posicion
    }
}
