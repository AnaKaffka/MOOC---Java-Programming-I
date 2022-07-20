public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account anasAccount = new Account("Ana's account", 100.00);

        System.out.println("Initial state");
        System.out.println(anasAccount);

        anasAccount.deposit(20);

        System.out.println("End state");
        System.out.println(anasAccount);
    }
}
