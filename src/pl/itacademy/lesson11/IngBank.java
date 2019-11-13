package pl.itacademy.lesson11;

public class IngBank extends Bank {

    private String name;

    private Address address;

    private Account[] accounts;

    private int lastAccountIndex;

    public IngBank(String name, Address address) {
        this.name = name;
        this.address = address;
        accounts = new Account[100];
        lastAccountIndex = 0;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected Address getAddress() {
        return address;
    }

    public void addAccount(Account account) {
        accounts[lastAccountIndex] = account;
        lastAccountIndex++;
    }

    public Account getAccountByNumber(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}
