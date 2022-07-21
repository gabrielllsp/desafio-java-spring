package br.com.dio.desafios.spring;
import java.util.*;

/*Sabemos que você adora passar horas jogando jogos como Liga of Legendas (LOL) e Contra-Strike (CS). LOL pode ser o seu queridinho, mas você também gosta de usar todas suas grandes habilidades no Contra-Strike!

Com tanto treinamento, você começpu a fazer vídeos das suas jogadas, e eles estão sempre sendo exibidos na JC - Jogadores Viciados, uma página na internet que publica gameplays dos alunos da universidade.

Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar na hora de tentar encontrar algum vídeo específico. Entretanto, como você é programador e domina a artes de conseguir
o que quer por meio do código, você decidiu escrever um programa para encontrar os seus vídeos na página. Dada a lista de gameplays publicados na página, determine quantos
 gameplays seus de Contra-Strike foram publicados.*/

public class Jogadores_Viciados {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);


        int number,id;

        number=sc.nextInt();
        id=sc.nextInt();

        int count=0;
        while(number>0){

            int id1,num;
            id1=sc.nextInt();
            num=sc.nextInt();

            if(id==id1 && num==0) {

                count++;
            }
            number--;
        }
        System.out.println(count);

    }
}

