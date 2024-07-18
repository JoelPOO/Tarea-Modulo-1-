

package com.mycompany.condicional;


public class Condicional {

    public static void main(String[] args) {
     int M=6, T=1,K=-10;
     int div=T/K;
     int suma=M+T;
     int resta=M-T;
     if(M>T){
        System.out.println("Esto es verdadera \n" + M +" \n es mayor que \n "+T); 
        
     }
     if (div==-5){
          System.out.println("Esto es verdadera  \n" +div+ " \n es igual a -5 ");
    } 
    else {
    System.out.println("Esto es falso \n" +div+" \n no es igual a -5");
}
      if (suma==7){
          System.out.println("Esto es verdadera  \n" +suma+ " \n es igual a 7 ");
    } 
    else {
    System.out.println("Esto es falso \n" +suma+" \n no es igual a 7");
}
       if (resta==5){
          System.out.println("Esto es verdadera  \n" +resta+ " \n es igual a 5 ");
    } 
    else {
    System.out.println("Esto es falso \n" +resta+" \n no es igual a 5");
}
    }
}

//Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como resultado verdadero o falso:
//M > T
//T / K == -5
//(M+T == 7) || (M-T == 5)