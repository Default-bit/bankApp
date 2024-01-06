package kz.singularity.solidbankapp.model;

import kz.singularity.solidbankapp.service.AccountListingService;
import kz.singularity.solidbankapp.service.BankCore;

import java.util.Collection;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(AccountType accountType, String clientID){
        bankCore.createNewAccount(accountType, clientID);
    }

    public void getAccounts(String clientID){
        System.out.println(accountListing.getClientAccounts(clientID));
    }
}
