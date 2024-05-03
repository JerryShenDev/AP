package Practice2017;

public class MultPractice implements StudyPractice {
    private final int first;

    private int second;

    public MultPractice(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String getProblem() {
        return first + " TIMES " + second;
    }

    public void nextProblem() {
        second++;
    }
}
