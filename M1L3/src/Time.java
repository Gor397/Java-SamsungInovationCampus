public class Time {
    int hour, min, sec;
    Time(int secs){
        this.hour = secs / 3600;
        secs -= hour * 3600;
        this.min = secs / 60;
        secs -= min * 60;
        this.sec = secs;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

    public static void main(String[] args) {
        Time time = new Time(3661);
        System.out.println(time);
    }
}