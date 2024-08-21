package model;

import camp.nextstep.edu.missionutils.Console;
import view.InputView;

public class Money {
    private int money;
    InputView inputView = new InputView();

    public Money(int money) {
        this.money = money;
    }

    public void inputMoney() {
        inputView.printBuyLottoMessage();
        this.money = validateMoney(Console.readLine());
    }

    private int validateMoney(String strMoney) {
        int money = Integer.parseInt(strMoney);
        if (! (money % 10000 == 0)) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
        return money;
    }
}
