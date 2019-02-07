package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        String[]rice = {"White rice","brown rice","no rice"};
        String[]meat = {"chicken meat","steak","carnidas meat","chorizo meat","sofritas meat","veggies"};
        String[]Beans= {"pinto beans","black beans","no beans"};
        String[]Salsa= {"mild salsa","medium salsa","hot salsa","no salsa"};
        String[]veggies={"lettuce","fajita","veggies","no veggies"};

        for(int i=1;i<=10;i++){
            int ri = rand.nextInt(3);
            int me= rand.nextInt(6);
            int be= rand.nextInt(3);
            int sa= rand.nextInt(4);
            int ve=rand.nextInt(4);



            System.out.println("Borrito" +" " + ":"+ " "+ i + " " +  rice[ri]+ "," +" "+meat[me]+","+" "+Beans[be]+","+" "+Salsa[sa]+","+" "+veggies[ve]);


        }


    }
}
