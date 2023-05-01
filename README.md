# Bulls and Cows

## 학습 내용

Bulls and Cows 게임을 구현함으로써 깃 협업에 대한 지식을 습득한다.

-----

## 로직
[Bulls and Cows 위키피디아](https://en.wikipedia.org/wiki/Bulls_and_Cows) <Br><Br>

Bulls and Cows의 로직은 다음과 같다.<br>

1. 게임 시작 시 0~9까지 무작위로 4개의 숫자를 중복되지 않게 생성한다.

2. 플레이어는 0~9까지 중복되지 않는 4개의 숫자를 선택한다.

3. 선택한 숫자는 다음과 같은 규칙으로 Bull과 Cow를 계산한다. <br>
    a. 선택한 각 숫자가 정답 숫자와 같은 위치, 같은 값을 지닌다면 Bull이다.<br>
    b. 선택한 각 숫자가 정답 숫자와 다른 위치, 같은 값을 지닌다면 Cow이다.

4. 해당 게임은 Bull이 4가 될 때까지 2~3 과정을 반복하며, 게임이 끝날 때 반복한 횟수를 출력해준다.

-----
## Environment
- Java: 17
