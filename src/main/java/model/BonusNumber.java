package model;

import camp.nextstep.edu.missionutils.Console;
import view.InputView;

public class BonusNumber {
    InputView inputView = new InputView();
    private int bonusNumber;

    public void inputBonusNumber() {
        inputView.printGetBonusNumberMessage();
        String stringBonusNumber = Console.readLine();
        validate(stringBonusNumber);
        bonusNumber = Integer.parseInt(stringBonusNumber);
    }

    private void validate(String stringBonusNumber) {
        validateIsInteger(stringBonusNumber);
        validateNumberBound(stringBonusNumber);
    }

    private void validateIsInteger(String stringBonusNumber) {
        char[] charMoney = stringBonusNumber.toCharArray();
        for (char ch : charMoney) {
            if (!(Character.isDigit(ch))) {
                throw new IllegalArgumentException("\"[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }

    private void validateNumberBound(String number) {
        int bonusNumber = Integer.parseInt(number);
        if (bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호가 잘못 입력되었습니다");
        }
    }

}
