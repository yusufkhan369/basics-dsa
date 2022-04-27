package timB.constructors.c1;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",123.45,"Bob","er@er.com","123-456-7890");
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(51);
        bobsAccount.withdrawal(100);

    }
}
