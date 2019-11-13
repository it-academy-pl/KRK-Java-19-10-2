package pl.itacademy.lesson11;

public class Bank {

    private String name;

    private Address address;

    private Account[] accounts;

    private int lastAccountIndex;

    public Bank(String name, Address address) {
        this.name = name;
        this.address = address;
        accounts = new Account[100];
        lastAccountIndex = 0;
    }

    protected String getName() {
        return name;
    }

    protected Address getAddress() {
        return address;
    }

    public void addAccount(Account account) {
        accounts[lastAccountIndex] = account;
        lastAccountIndex++;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
