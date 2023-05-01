package org.example;

import java.util.List;

public class BaseBallGame {

  private int[] code;
  private int bulls;
  private int cows;

  BaseBallGame() {
    code = new int[4];
    for (int i = 0; i < 4; i++) {
      code[i] = (int) ((Math.random() * 10000) % 10);
    }
  }

  public int[] getCode() {
    return code;
  }

  public void compareCode(List<Integer> inputCode) {
    bulls = 0;
    cows = 0;

    for (int i = 0; i < 4; i++) {
      if (code[i] == inputCode.get(i)) {
        cows++;
      }

      for (int num : code) {
        if (num == inputCode.get(i)) bulls++;
        break;
      }
    }
  }

  public int getBulls() {
    return bulls;
  }

  public int getCows() {
    return cows;
  }
}
