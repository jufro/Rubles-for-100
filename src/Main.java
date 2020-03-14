public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int transaction = 2000;
        int bonusTransaction = 1000;
        int bonus;
        if (transaction >= bonusTransaction) {
            bonus = transaction / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
