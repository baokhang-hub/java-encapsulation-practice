public class BankAccount {
    private double balance;
    private String owner;

    BankAccount(double balance, String owner) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        this.owner = owner;

    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Ban da nap tien thanh cong!!");
        } else {
            System.out.println("Vui long nhap lon hon 0!!!");
        }
    }

    public void withdraw(double amount) {
        if (this.balance > amount && amount > 0) {
            this.balance -= amount;
            System.out.println("Rut tien thanh cong!!!");
        } else {
            System.out.println("Rut tien khong hop le!");
        }
    }
}
