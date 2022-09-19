public class Main {
    public static void main(String[] args) {

        double balance = 5000;
        double interestRate = .17;
        double month1;
        double month2;

        month1 = (balance * interestRate) + balance;
        month2 = (month1 * interestRate) + month1;

        System.out.println("The balance after one month is $" + month1 + ", and the balance after 2 months is $" + month2);
    }
}