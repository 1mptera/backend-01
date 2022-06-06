//방향을 회전시킨다?
//배열에 값을 넣는 것 자체는 반복문을 통해 이루어짐
// [0][0] [0][1] [0][2] [0][3] [0][4]
// [1][4] [2][4] [3][4] [4][4]
// [4][3] [4][2] [4][1] [4][0]
// 이런 식으로 행과 열 둘 중 하나는 고정되고,
// 나머지 하나가 1씩 증가하거나 감소하면서 배열의 위치를 찾아 값을 채우는 구조임
// - 프로세스 method:
//     - 초기화 method: 배열에 값을 채우기 위해 우선 전체 배열에 0을 채우고,
//     - 값 넣기 method: 반복문을 통해 배열에 값을 넣는데,
//     - 방향 전환 method: 배열 길이 -1 위치에 당도했거나, 반복 기준 다음 요소 값이 0이 아니면 반복문을 멈추고 회전시킨 뒤 다시 반복 시작
//                       조건문을 통해 행과 열 중 고정시킬 쪽을 정하고, 나머지 한 쪽은 1씩 더해줄지 빼줄지 변수를 통해 결정
// - 프로세스 method 종료 조건: 마지막으로 넣어준 수가 (한 변의 길이로 입력한 값)^2 - 1일 때

import java.util.Scanner;

public class SpiralMatrix {
    private int[][] spiralMatrix;

    private int puttingNumber = 0;
    private int rowIndex = 0;
    private int columnIndex = 0;
    private String choseDirection = "RIGHT";

    public static void main(String[] args) {
        SpiralMatrix question = new SpiralMatrix();
        question.run();
    }

    public void run() {
        int length = input();

        process(length);

        print();
    }

    public int input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 한 변의 길이: ");

        return scanner.nextInt();
    }

    public void process(int length) {
        spiralMatrix = new int[length][length];

        initSpiralMatrix();

        putIncrementalNumber();
        changeDirection();
    }

    public void initSpiralMatrix() {
        for (int i = 0; i < spiralMatrix.length; i += 1) {
            for (int j = 0; j < spiralMatrix.length; j += 1) {
                spiralMatrix[i][j] = 0;
            }
        }
    }

    public void putIncrementalNumber() {
        boolean condition = setIterationCondition();

        while (condition) {
            spiralMatrix[rowIndex][columnIndex] = puttingNumber;
            puttingNumber += 1;

            // 현재 배열 index 위치가 배열 길이 -1 or 0을 벗어나기 전까지 putIncrementalNumber()를 수행하도록 하는 데까지 작성하였음
            // 이제 값을 넣을 다음 위치의 값이 0이 아닌지 확인해서 0이 아니면 중단하도록 하는 조건을 추가해줘야 함

            switch (choseDirection) {
                case "RIGHT" -> columnIndex += 1;
                case "DOWN" -> rowIndex += 1;
                case "LEFT" -> columnIndex -= 1;
                case "UP" -> rowIndex -= 1;
            }

            condition = setIterationCondition();
        }
    }

    private boolean setIterationCondition() {
        return rowIndex > spiralMatrix.length - 1
                || columnIndex > spiralMatrix.length - 1
                || rowIndex < 0
                || columnIndex < 0;
    }

    public void changeDirection() {
        switch (choseDirection) {
            case "RIGHT" -> {
                choseDirection = "DOWN";
                columnIndex += 1;
            }
            case "DOWN" -> {
                choseDirection = "LEFT";
                rowIndex += 1;
            }
            case "LEFT" -> {
                choseDirection = "UP";
                columnIndex -= 1;
            }
            case "UP" -> {
                choseDirection = "RIGHT";
                rowIndex -= 1;
            }
        }
    }

    private void print() {
        for (int i = 0; i < spiralMatrix.length; i += 1) {
            for (int j = 0; j < spiralMatrix.length; j += 1) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
