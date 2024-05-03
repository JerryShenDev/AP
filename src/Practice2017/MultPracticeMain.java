package Practice2017;

public class MultPracticeMain {
    public static void main(String[] args) {
        // test 1
        StudyPractice p1 = new MultPractice(7, 3);
        System.out.println(p1.getProblem());

        p1.nextProblem();
        System.out.println(p1.getProblem());

        p1.nextProblem();
        System.out.println(p1.getProblem());

        p1.nextProblem();
        System.out.println(p1.getProblem());

        // test 2
        StudyPractice p2 = new MultPractice(4, 12);
        p2.nextProblem();
        System.out.println(p2.getProblem());
        System.out.println(p2.getProblem());

        p2.nextProblem();
        p2.nextProblem();
        System.out.println(p2.getProblem());

        p2.nextProblem();
        System.out.println(p2.getProblem());
    }
}
