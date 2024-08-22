package model;

public class Result {
    private int matchNumberCount;
    private boolean matchBonusNumber;
    private Grade grade;

    public Result(int matchNumberCount, boolean matchBonusNumber) {
        this.matchNumberCount = matchNumberCount;
        this.matchBonusNumber = matchBonusNumber;
        grade = generateGrade(matchNumberCount, matchBonusNumber);
    }

    public Grade getGrade() {
        return grade;
    }

    private Grade generateGrade(int matchNumberCount, boolean matchBonusNumber) {
        if (matchNumberCount == 3) {
            return Grade.FIFTH;
        }
        if (matchNumberCount == 4) {
            return Grade.FOURTH;
        }
        if (matchNumberCount == 5 && matchBonusNumber) {
            return Grade.SECOND;
        }
        if (matchNumberCount == 5) {
            return Grade.THIRD;
        }
        if (matchNumberCount == 6 && matchBonusNumber) {
            return Grade.FIRST;
        }
        return Grade.NULL;
    }
}
