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
        System.out.print("Введите параметры точек (X, Y):");
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        System.out.print(Y);
    }
}