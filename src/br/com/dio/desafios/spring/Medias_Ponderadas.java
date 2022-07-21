package br.com.dio.desafios.spring;

import java.util.*;

public class Medias_Ponderadas {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        double result;
        while (cont < casos){


            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            result = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f %n",result);


            cont++;
        }

    }
}

