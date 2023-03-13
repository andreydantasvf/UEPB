package ExerciseJavaCourse;

import java.util.Scanner;

public class HoursGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour1, hour2, hourFinal;

        System.out.print("Digite a hora do ínicio do jogo e a hora do final do jogo: ");
        hour1 = sc.nextInt();
        hour2 = sc.nextInt();

        if (hour1 < hour2) {
            hourFinal = hour2 - hour1;
        }
        else if (hour2 < hour1) {
            hourFinal = (24 - hour1) + hour2;
        }
        else {
            hourFinal = 24;
        }

        System.out.printf("O jogo durou %d hora(s)\n", hourFinal);
    }
}
