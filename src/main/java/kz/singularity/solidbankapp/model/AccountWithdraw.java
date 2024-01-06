package kz.singularity.solidbankapp.model;

public class AccountWithdraw extends Account {
    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed){
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
