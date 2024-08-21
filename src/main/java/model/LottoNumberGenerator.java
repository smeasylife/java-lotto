package model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoNumberGenerator {
    private List<Lotto> lottoList = new ArrayList<>();

    public void generateLottoNumber(int money) {
        int quantity = money / 1000;
        for (int i = 0; i < quantity; i++) {
            lottoList.add(new Lotto(generateLottoList()));
        }
    }

    public List<Integer> generateLottoList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(Randoms.pickNumberInRange(1,45));
        while (integerList.size() < 6) {
            int num = Randoms.pickNumberInRange(1,45);
            if (!integerList.contains(num)) {
                integerList.add(num);
            }
        }
        return integerList;
    }
}
