package controller;

import model.*;
import view.OutputView;

import java.util.List;

public class GameController {
    private Money money = new Money();
    LottoGenerator lottoNumberGenerator = new LottoGenerator();
    LottoRepository lottoRepository = new LottoRepository();
    WinningNumber winningNumber = new WinningNumber();
    BonusNumber bonusNumber = new BonusNumber();
    ResultRepository resultRepository = new ResultRepository();
    OutputView outputView = new OutputView();

    public void run() {
        purchaseLotto();
        generateLotto();
        getWinningNumber();
        getBonusNumber();
        generateResultList();
        getDetailResult();
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
        winningNumber.inputWinningNumbers();
        System.out.println();
    }

    private void getBonusNumber() {
        bonusNumber.inputBonusNumber(winningNumber.getWinningNumbers());
        System.out.println();
    }

    private void generateResultList() {
        List<Lotto> lottoList = lottoRepository.getLottoList();
        for (Lotto lotto : lottoList) {
            Long matchNumberCount = winningNumber.getWinningNumbers().stream()
                    .filter(num -> lotto.getNumbers().contains(num))
                    .count();

            boolean matchBonusNumber = winningNumber.getWinningNumbers().contains(bonusNumber.getBonusNumber());

            generateResult(Integer.parseInt(String.valueOf(matchNumberCount)), matchBonusNumber);
        }
    }

    private void generateResult(int matchNumberCount, boolean matchBonusNumber) {
        resultRepository.addResult(new Result(matchNumberCount, matchBonusNumber));
    }

    private void getDetailResult() {
        outputView.printResultMessage(resultRepository.getGradeMap(), money.getMoney(), resultRepository.getResultMoney());
    }
}
