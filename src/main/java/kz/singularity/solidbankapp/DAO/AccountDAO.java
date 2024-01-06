package kz.singularity.solidbankapp.DAO;

import kz.singularity.solidbankapp.model.Account;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.AccountWithdraw;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);
}
