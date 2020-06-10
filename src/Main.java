public class Main {
    public static void main(String[] args) {
        int current = 100;
        int charge = 5000;
        int bonus;
        if (charge > 1000) {
            bonus = charge / 100 + current + charge;
        } else {
            bonus = current + charge;
        }
        System.out.println(bonus);
    }
}
