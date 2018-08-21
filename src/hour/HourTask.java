package hour;

public class HourTask {
    public static void main(String[] args) {
        float A = 1865;
        float hour = A%24;
        float day = (A-hour)/24;

        System.out.println("Было дано 1865 часов Это" + " " + day + " " + "дней" + " " + "и" + " " + hour + " " + "часов");
    }
}
