package com.company;

import java.util.Random;


public class Week2ChallengeJr {
    public  static void main(String[]args){
        Random rand = new Random();
        String userword="";
        String[]rice = {"White rice","brown rice","none"};
        String[]meat = {"chicken meat","steak","carnidas meat","chorizo meat","sofritas meat","veggies"};
        String[]Beans= {"pinto beans","black beans",};
        String[]Salsa= {"mild salsa","medium salsa","hot salsa","none", "all"};
        String[]veggies={"lettuce","fajita","veggies","none", "all"};
        String[]cheese={"yes","no"};
        String[]Guac= {"yes","no"};
        String[]Queso={"yes","no"};
        String[]Sourcream={"yes","no"};

        for(int i=1;i<=25;i++){


            int ri = rand.nextInt(2);
            int me= rand.nextInt(6);
            int be= rand.nextInt(2);
            int sa= rand.nextInt(3);
            int ve=rand.nextInt(3);

            if(rice[ri].equalsIgnoreCase("none")) {
                rice[ri] = "no rice";
            }
            else if (Salsa[sa].equalsIgnoreCase("none")){
                Salsa[sa]= "no salsa";
            }else if (Salsa[sa].equalsIgnoreCase("all")){
                Salsa[sa]=" ";

            }

            System.out.println("Borrito" +" " + ":"+ " "+ i + " " +  rice[ri]+ "," +" "+meat[me]+","+" "+Beans[be]+","+" "+Salsa[sa]+","+" "+veggies[ve]);}




        }


    }

