package Lesson2;

import java.util.Scanner;

public class AverageofLessons {
    public static void main(String[] args) {
      int math,physic,chemistry,turkish,history,music;

      Scanner input = new Scanner(System.in);

        System.out.print("Your Math Grade : ");
        math = input.nextInt();

        System.out.print("Your Physic Grade : ");
        physic = input.nextInt();

        System.out.print("Your Chemistry Grade : ");
        chemistry = input.nextInt();

        System.out.print("Your Turkish Grade : ");
        turkish = input.nextInt();

        System.out.print("Your History Grade : ");
        history = input.nextInt();

        System.out.print("Your Music Grade : ");
        music = input.nextInt();

        int total = (math+physic+chemistry+turkish+history+music);
        double average = total / 6.0;
        System.out.println("Your Average : " + average);

        String condition;
        condition = (average < 60) ? "Failed to Pass" : "Passed";
        System.out.print(condition);
    }
}
