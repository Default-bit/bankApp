package kz.singularity.solidbankapp.service;

import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;
    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount(){
        return 0;
    }

    public String requestClientAccountNumber(){
        return null;
    }

    public Scanner getScanner() {
        return scanner;
    }

    @Override
    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }
}
