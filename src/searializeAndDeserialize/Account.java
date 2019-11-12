package searializeAndDeserialize;

import java.io.Serializable;

public class Account implements Serializable {
    long accountId;
    String accountHolderName;
    int routingNumber;
    String emailId;

    public Account(long accountId, String accountHolderName, int routingNumber, String emailId) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.routingNumber = routingNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return ("Account Id:" + accountId + " Account Name:" + accountHolderName + " Routing Number:" + routingNumber +
         " Email Id:" + emailId);
    }
}
