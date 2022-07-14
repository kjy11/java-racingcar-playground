package racingcar.view;

import java.util.Scanner;

public class InputView {
    private static final String emptyMessage = "입력값은 빈값일 수 없습니다.";

    public static String[] namesInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        nameValidation(input);
        return input;
    }

    public static int raceCountInput() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void nameValidation(String[] names) {
        for (String name : names) {
            nameValidation(name);
        }
    }

    public static void nameValidation(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(emptyMessage);
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

}
