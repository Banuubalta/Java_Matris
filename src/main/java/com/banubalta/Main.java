package com.banubalta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*Bir matrisin her satırının ve her sütununun toplamını bulan Java Programı yazin
         beklenilen output
         verilen matris
         1 2 3
         4 5 6
           8 9
          ise

        1. satırın toplamı: 6
        2. satırın toplamı: 15
        3. satırın toplamı: 24
        1. sütunun toplamı: 12
        2. sütunun toplamı: 15
        3. sütunun toplamı: 18

        seklinde olmalidir*/


                int matris[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

                int satirToplami = 0;
                int sutunToplami = 0;

                for (int i = 0; i < matris.length; i++) {


                    for (int j = 0; j < matris.length; j++) {

                        satirToplami+=matris[i][j];
                        sutunToplami+=matris[j][i];



                    }

                    System.out.println(i+1 +". satirin toplami --> "+satirToplami);
                    System.out.println(i+1+". sutunun toplami --> "+ sutunToplami);


                }






            }

    }
}