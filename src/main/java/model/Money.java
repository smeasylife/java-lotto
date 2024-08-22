package model;

import camp.nextstep.edu.missionutils.Console;
import view.InputView;

public class Money {
    private int money;
    InputView inputView = new InputView();

    public void inputMoney() {
        inputView.printBuyLottoMessage();
        this.money = validate(Console.readLine());
    }

    public int getMoney() {
        return money;
    }
    
    private int validate(String strMoney) {
        validateCorrectMoney(strMoney);
        validateIsInteger(strMoney);
        return Integer.parseInt(strMoney);
    }

    private void validateCorrectMoney(String strMoney) {
        int money = Integer.parseInt(strMoney);
        if (! (money % 1000 == 0)) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }
    
    private void validateIsInteger(String strMoney) {
        char[] charMoney = strMoney.toCharArray();
        for (char ch : charMoney) {
            if (!(Character.isDigit(ch))) {
                throw new IllegalArgumentException("\"[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }
}
