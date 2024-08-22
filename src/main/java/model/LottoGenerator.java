package model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {

    public Lotto generateLottoNumber() {
        return new Lotto(generateLottoNumberList());
    }

    private List<Integer> generateLottoNumberList() {
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
