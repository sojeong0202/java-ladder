package view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    // 참여할 사람 이름 입력받기
    public String getName() {
        return scanner.nextLine();
    }

    // 사다리 높이 입력받기
    public int ladderHeight() {
        return scanner.nextInt();
    }

}