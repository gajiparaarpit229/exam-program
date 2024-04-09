class Time {
    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void addTime(Time t) {
        int totalMinutes = this.hour * 60 + this.minute + t.hour * 60 + t.minute;
        this.hour = totalMinutes / 60;
        this.minute = totalMinutes % 60;
    }

    public void displayTime() {
        System.out.println("Time: " + this.hour + " hours " + this.minute + " minutes");
    }
}

public class Time1 {
    public static void main(String[] args) {
        Time t1 = new Time(12, 30);
        Time t2 = new Time(3, 45);

        t1.addTime(t2);
        t1.displayTime();
    }
}
