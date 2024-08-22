package controller;

import model.*;

public class GameController {
    private Money money = new Money();
    LottoGenerator lottoNumberGenerator = new LottoGenerator();
    LottoRepository lottoRepository = new LottoRepository();
    WinningNumber winningNumber = new WinningNumber();
    BonusNumber bonusNumber = new BonusNumber();

    public void run() {
        purchaseLotto();
        generateLotto();
        getWinningNumber();
        getBonusNumber();
    }

    private void purchaseLotto() {
        money.inputMoney();
        System.out.println();
    }

    private void generateLotto() {
        int lottoRound = money.getMoney() / 1000;
        for (int i = 0; lottoRound > i; i++) {
            lottoRepository.getLottoList().add(lottoNumberGenerator.generateLottoNumber());
        }
    }

    private void getWinningNumber() {
        winningNumber.getWinningNumbers();
    }

    private void getBonusNumber() {
        bonusNumber.inputBonusNumber();
    }
}
