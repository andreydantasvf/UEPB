package classUepb;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;

        System.out.print("Digite o seu peso (KG): ");
        peso = sc.nextDouble();

        System.out.print("Digite a sua altura (M): ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        }
        else if (imc < 25) {
            System.out.println("Seu peso está normal.");
        }
        else if (imc < 30) {
            System.out.println("Você está acima do peso.");
        }
        else if (imc < 35) {
            System.out.println("Você está obeso.");
        }
        else {
            System.out.println("Você está MUITO obeso.");
        }
    }
}