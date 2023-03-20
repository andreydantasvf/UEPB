package lista01;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width1, width2, width3;

        System.out.print("Digite tres comprimentos de madeiras: ");
        width1 = sc.nextDouble();
        width2 = sc.nextDouble();
        width3 = sc.nextDouble();

        if((width1 < width2 + width3) && (width2 < width1 + width3) && width3 < width1 + width2) {
            System.out.println("Os pedacos de madeira formam um triangulo");
        } else {
            System.out.println("Os pedacos de madeira NAO formam um triangulo");
        }

        sc.close();
    }
}
