package view;

import model.Grade;
import model.Result;

import java.util.List;
import java.util.Map;

public class OutputView {
    public void printLottoQuantity(int lottoQuantity) {
        System.out.println(lottoQuantity + "개를 구매했습니다.");
    }

    public void printLottoNumber(List<Integer> lottoNumberList) {
        System.out.println(lottoNumberList.toString());
    }

    public void printResultMessage(Map<Integer, Integer> gradeMap, int purchaseMoney, Long resultMoney) {
        StringBuilder resultMessage = new StringBuilder();

        resultMessage.append("당첨 통계").append("\n");
        resultMessage.append("---").append("\n");
        resultMessage.append("3개 일치 (5,000원) - ").append(gradeMap.get(4)).append("개").append("\n");
        resultMessage.append("4개 일치 (50,000원) - ").append(gradeMap.get(3)).append("개").append("\n");
        resultMessage.append("5개 일치 (1,500,000원) - ").append(gradeMap.get(2)).append("개").append("\n");
        resultMessage.append("5개 일치, 보너스 볼 일치 (30,000,000원) - ").append(gradeMap.get(1)).append("개").append("\n");
        resultMessage.append("6개 일치 (2,000,000,000원) - ").append(gradeMap.get(0)).append("개").append("\n");

        System.out.println(resultMessage.toString());
        System.out.println(String.format("%.2f", purchaseMoney/resultMoney) + "%");
    }
}
