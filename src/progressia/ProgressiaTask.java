package progressia;

public class ProgressiaTask {
    public static void main(String[] args) {
        float b1 = 99;
        float b2 = 33;
        float b3 = 11;
        float q = b2/b1;
        float Sn = b1/(1-q);
        System.out.println("Сумма прогрессии равна "+Sn );
    }
}
