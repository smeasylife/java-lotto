package model;


import camp.nextstep.edu.missionutils.Console;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinningNumber {
    InputView inputView = new InputView();
    private List<Object> winningNumbers = new ArrayList<>();

    public void getNumberList() {
        inputView.printGetWinningMessage();
        String stringWinningNumber = Console.readLine();
        generateWinningNumbers(stringWinningNumber);
    }

    private void generateWinningNumbers(String stringWinningNumber) {
        validate(stringWinningNumber);
        String[] numbers = stringWinningNumber.split(",");
        Arrays.stream(numbers)
                .map(Integer::parseInt)
                .forEach(num -> winningNumbers.add(num));
    }

    private void validate(String stringWinningNumber) {
        isCorrectChar(stringWinningNumber);
        isCorrectNumber(stringWinningNumber);
        isCorrectLength(stringWinningNumber);
    }

    private void isCorrectChar(String stringWinningNumber) {
        char[] characters = stringWinningNumber.toCharArray();
        for (char character : characters) {
            if (!Character.isDigit(character) || character != ',') {
                throw new IllegalArgumentException("[ERROR] 당첨 번호가 잘못 입력되었습니다");
            }
        }
    }

    private void isCorrectNumber(String stringWinningNumber) {
        String[] numbers = stringWinningNumber.split(",");
        for (String number : numbers) {
            if (Integer.parseInt(number) < 1 || Integer.parseInt(number) > 45) {
                throw new IllegalArgumentException("[ERROR] 당첨 번호가 잘못 입력되었습니다");
            }
        }
    }

    private void isCorrectLength(String stringWinningNumber) {
        String[] numbers = stringWinningNumber.split(",");
        if (numbers.length != 6) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호가 잘못 입력되었습니다");
        }
    }

}
