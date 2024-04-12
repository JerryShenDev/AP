package Unit5_Writing_Classes;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void addSeconds(int seconds) {
        second += seconds;
        if (seconds >= 60) {
            minute += seconds / 60;
            second %= 60;
        }
        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }
    }

    public void subtractSeconds(int seconds) {
        second -= seconds;
        while (second < 0) {
            second += 60;
            minute--;
        }
        while (minute < 0) {
            minute += 60;
            hour--;
        }
    }

    public static Time difference(Time time1, Time time2) {
        int hourDiff = time2.hour - time1.hour;
        int minuteDiff = time2.minute - time1.minute;
        int secondDiff = time2.second - time1.second;
        if (secondDiff < 0) {
            secondDiff += 60;
            minuteDiff--;
        }
        if (minuteDiff < 0) {
            minuteDiff += 60;
            hourDiff--;
        }
        return new Time(hourDiff, minuteDiff, secondDiff);
    }
}
