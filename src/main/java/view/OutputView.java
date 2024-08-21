package view;

import java.util.List;

public class OutputView {
    public void printLottoQuantity(int lottoQuantity) {
        System.out.println(lottoQuantity + "개를 구매했습니다.");
    }

    public void printLottoNumber(List<Integer> lottoNumberList) {
        System.out.println(lottoNumberList.toString());
    }
}
