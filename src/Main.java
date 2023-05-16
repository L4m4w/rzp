/*
Лабораторная работа 1

Вводим координаты линии, круга, прямоугольника и точки
и рассчитываем положение точки относительно указанных фигур
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводимые значения могут быть только целочисленными.");

        System.out.print("Введите параметры точек через пробел (X, Y):");
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        System.out.print("Введите параметры точек для линии через пробел (X1 Y1 X2 Y2)");
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();

        System.out.print("Введите параметры круга через пробел (X, Y, R)");
        int X3 = scanner.nextInt();
        int Y3 = scanner.nextInt();
        float R = scanner.nextFloat();

        System.out.print("Введите параметры прямоугольника через пробел (X3, Y3, X4, Y4)");
        int X4 = scanner.nextInt();
        int Y4 = scanner.nextInt();
        int X5 = scanner.nextInt();
        int Y5 = scanner.nextInt();

        scanner.close();

        if ((X1 == X2) | (Y1 == Y2)) {
            if (X1 == X2)
                if (X > X1)
                    System.out.print("Точка над линии.");
                else System.out.print("Точка под линией.");
            if (Y1 == Y2)
                if (Y > Y1)
                    System.out.println("Точка правее прямой");
                else System.out.println("Точка левее прямой");
        }
        else {
            float Xp = (float) (X - X1) / (X2 - X1);
            float Yp = (float) (Y - Y1) / (Y2 - Y1);
            if (Xp == Yp)
                System.out.println("Точка принадлежит прямой");
            else if (Xp < Yp)
                System.out.println("Точка выше линии");
            else System.out.println("Точка ниже линии");
        }
    }

    }
