package model;

public class BonusNumber {
    private int bonusNumber;

    public BonusNumber(int bonusNumber) {

        this.bonusNumber = bonusNumber;
    }

    private void validate(int bonusNumber) {
        if (bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호가 잘못 입력되었습니다");
        }
    }
}
