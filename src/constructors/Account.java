package constructors;

public class Account {

    long accountId;
    String accountHolderName;
    int routingNumber;
    String emailId;

    // default constructor
    public Account() {
        //System.out.println("Constructor chaining");
    }

    public Account(long accountId) {
        this();
        this.accountId = accountId;
    }

    public Account(long accountId, String accountHolderName) {
        this(accountId);
        this.accountHolderName = accountHolderName;
    }

    public Account(long accountId, String accountHolderName, int routingNumber) {
        this(accountId, accountHolderName);
        this.routingNumber = routingNumber;
    }

    public Account(long accountId, String accountHolderName, int routingNumber, String emailId) {
        this(accountId, accountHolderName, routingNumber);
        this.emailId = emailId;
    }

    // copy constructor
    public Account(Account e) {
        this.accountId = e.accountId;
        this.accountHolderName = e.accountHolderName;
        this.routingNumber = e.routingNumber;
        this.emailId = e.emailId;
    }

    public void display() {
        System.out.println(" Account ID: " + this.accountId + " Account Holder Name: " + this.accountHolderName
                + " Routing Number: " + this.routingNumber + " Email Id: " + this.emailId);
    }

    public static void main(String[] args) {
        // Default constructor
        Account ac1 = new Account();
        ac1.display();

        Account ac2 = new Account(1253433290);
        ac2.display();

        Account ac3 = new Account(1243211124, "Rakesh");
        ac3.display();

        Account ac4 = new Account(1109323274, "Mahesh", 123121149);
        ac4.display();

        // using copy constructor to clone object
        Account ac5 = new Account(ac4);
        ac5.display();

        Account ac6 = new Account(1934302147, "Ramesh", 214545629, "ramesh@yahoo.com" );
        ac6.display();
    }


}
