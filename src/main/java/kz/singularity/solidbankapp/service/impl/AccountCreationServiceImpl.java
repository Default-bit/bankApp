package kz.singularity.solidbankapp.service.impl;

import kz.singularity.solidbankapp.DAO.AccountDAO;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.CheckingAccount;
import kz.singularity.solidbankapp.model.FixedAccount;
import kz.singularity.solidbankapp.model.SavingAccount;
import kz.singularity.solidbankapp.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDAO accountDAO;
    public AccountCreationServiceImpl(AccountDAO accountDao) {
        this.accountDAO = accountDao;
    }
    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String accountNumber = String.format("%03d%06d", 1, accountID);
        switch(accountType){
            case FIXED -> accountDAO.createNewAccount(new FixedAccount(accountType, accountNumber, clientID, 0.0, false));
            case CHECKING -> accountDAO.createNewAccount(new CheckingAccount(accountType, accountNumber, clientID, 0.0, true));
            case SAVING -> accountDAO.createNewAccount(new SavingAccount(accountType, accountNumber, clientID, 0.0, true));
            default -> System.out.println("Wrong account type input!");
        }
    }
}
