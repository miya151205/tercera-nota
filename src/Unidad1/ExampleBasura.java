package Unidad1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();       
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        int numMax;
        for (int i=0; i<5; i++){
           if (num1 > num2 && num1 > num3){
               numMax=num1;
           } else if (num2 > num1 && num2 > num3){
               numMax=num2;
           } else {
               numMax=num3;
           }

       }
       System.out.println("El número máximo es: " + numMax);
       scanner.close();
    }
}
