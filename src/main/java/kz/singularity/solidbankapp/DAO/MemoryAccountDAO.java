package kz.singularity.solidbankapp.DAO;

import kz.singularity.solidbankapp.model.Account;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.AccountWithdraw;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO {

    List<Account> accountList = new ArrayList<>();
    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList = accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Bank account created successfully");

    }

    @Override
    public void updateAccount(Account account) {
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }
}
