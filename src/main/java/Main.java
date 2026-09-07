public class Main {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount(15000, "Khang");

        client1.deposit(15000);
        client1.withdraw(50000);
        client1.withdraw(10000);
        System.out.println("So du cuoi: " + client1.getBalance());
    }
}
