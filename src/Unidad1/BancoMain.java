
public class BancoMain {
    public static void run() {
        double initialBalance = 1000.0;
        double weeklyWithdrawal = 200.0;
        int weeks = 4;

        double finalBalance = initialBalance - (weeklyWithdrawal * weeks);

        System.out.println("Semanas: " + weeks);
        System.out.println("Saldo final después de un mes: $" + finalBalance);
    }

    public static void main(String[] args) {
    run();
}
}
