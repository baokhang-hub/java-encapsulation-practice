public class Main {
    public static void main(String[] args) {
//      bt1
        BankAccount client1 = new BankAccount(15000, "Khang");

        client1.deposit(15000);
        client1.withdraw(50000);
        client1.withdraw(10000);
        System.out.println("So du cuoi: " + client1.getBalance());

        //bt2
        Student sv1 = new Student("Khang", 9);

        sv1.setScore(15);
        sv1.setScore(10);
        System.out.println("Diem cuoi cung: " + sv1.getScore());
    }
}
