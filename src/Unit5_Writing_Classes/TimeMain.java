package Unit5_Writing_Classes;

public class TimeMain {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(11, 22, 33);
        System.out.println(time1);
        System.out.println(time2);

        Time difference = Time.difference(time2, time1);
        System.out.println(difference);

//        time1.setHour(6);
//        time1.setMinute(20);
        time1.addSeconds(22800);
        System.out.println(time1);
        Time diff1 = Time.difference(difference, time2);
        Time diff2 = Time.difference(time1, time2);
    }
}
