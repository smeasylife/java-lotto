package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultRepository {
    List<Result> resultList = new ArrayList<>();
    Long resultMoney = 0L;
    Map<Integer,Integer> gradeMap = new HashMap<>();

    public List<Result> getResultList() {
        return resultList;
    }

    public Long getResultMoney() {
        return resultMoney;
    }

    public Map<Integer,Integer> getGradeMap() {
        return gradeMap;
    }

    public void addResult(Result result) {
        resultList.add(result);
        generateResultMoney(result);
    }

    private void generateResultMoney(Result result) {
        int grade = result.getGrade().ordinal();
        initMap();
        for (int i = 0; 5 > i; i++) {
            if (grade == i) {
                putGradeMap(i);
            }
        }
    }

    private void initMap() {
        for (int i = 0; 5 > i; i++) {
            gradeMap.put(i,0);
        }
    }

    private void putGradeMap(int grade) {
        gradeMap.put(grade, gradeMap.get(grade) + 1);
    }
}
