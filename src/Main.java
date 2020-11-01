public class Main {
    public static void main(String[] args) {
        int transferAmount = 1250;
        int bonus;
        int step = 100;
        if (transferAmount > 1000) {
            bonus = transferAmount / step
            ;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
