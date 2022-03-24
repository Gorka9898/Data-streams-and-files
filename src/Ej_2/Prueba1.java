package Ej_2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Prueba1 {
    int max;
    int min;


    public static void generate1num(int max, int min){

        double a = min + (Math.random() * max);

    System.out.print(a);

    }

    public static void generateNums(int max, int min, int amount){




    }

    public static void addNum(int num, String fileName){
        DataOutputStream foStream=null;
        try {
            foStream = new DataOutputStream(new FileOutputStream(fileName, append:true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void addNums(int num[], String name){



    }
    public static void findInFile(){



    }






    public static void main(String[] args) {

        Prueba1 n1=new Prueba1();

        n1.generate1num(3,6);

    }
}
