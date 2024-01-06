package kz.singularity.solidbankapp.service;

import kz.singularity.solidbankapp.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
