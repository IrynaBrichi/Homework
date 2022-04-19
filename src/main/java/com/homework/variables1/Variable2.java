package com.homework.variables1;

/**
 * В переменной centimeters записано количество сантиметров.
 * В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
 * Для вычисления используй переменную centimeters и оператор деления.
 * Для объявления и инициализации meters используй одну команду.
 * Требования:
 * •	Не изменяй значение переменной centimeters.
 * •	Для вычисления meters должны использоваться centimeters и оператор деления.
 * •	Программа должна выводить на экран значение переменной meters.
 */

public class Variable2 {

  public static void main(String[] args) {
    int centimeters = 243;

    int meters = centimeters / 100;

    System.out.println(meters);
  }
}
