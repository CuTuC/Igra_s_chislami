package ru.geekbrains.tretij_urok;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        igra();
    }

    public static void igra(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Угадай число от 0 до 9. У тебя три попытки.");
        int x = random.nextInt(10);
        for (int popitki = 3; popitki > 0; --popitki) {
            int polz = scanner.nextInt();
            if (x < polz) {
                System.out.println("Поменьше");
            } else if (x > polz) {
                System.out.println("Побольше");
            } else if (x == polz) {
                System.out.println("поздравляю, ты победил");
                break;
            }
            if (popitki == 1) {
                System.out.println("Ты проиграл, дружище ;(");
            }
        }
                System.out.println("Хочешь сыграть еще? 1 - да/ 0 - нет");
                int gameagain = scanner.nextInt();
                if (gameagain == 1) {
                    igra();
                } else {
                    System.out.println("Спасибо за игру");
                }
                }
            }



