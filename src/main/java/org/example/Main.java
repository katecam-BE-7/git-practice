package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();

    BaseBallGame game = new BaseBallGame();

    int num1, num2, num3;
    num1 = random.nextInt(100) % 9;
    num2 = random.nextInt(100) % 9;
    num3 = random.nextInt(100) % 9;
    List<Integer> numbers = new ArrayList<>();

    numbers.add(num1);
    numbers.add(num2);
    numbers.add(num3);
    game.compareCode(numbers);

    System.out.println(game.getBulls());
    System.out.println(" ");
    System.out.println(game.getCows());
  }
}
