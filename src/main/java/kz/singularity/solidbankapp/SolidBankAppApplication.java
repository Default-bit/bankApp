package kz.singularity.solidbankapp;

import kz.singularity.solidbankapp.model.AccountBasicCLI;
import kz.singularity.solidbankapp.service.MyCLI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SolidBankAppApplication {

    public static void main(String[] args) {
        boolean running = true;
        String clientID = "1";

        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        String helpMessage = "1 - show accounts\n2 - create account\n3 - deposit\n4 - withdraw\n5 - transfer\n6 - this message\n7 - exit\n";
        System.out.println("Welcome to CLI bank service");
        System.out.println("Enter operation number:");
        System.out.printf(helpMessage);
        while (running) {
            try {
                AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
                MyCLI myCLI = context.getBean(MyCLI.class);
                switch (myCLI.getScanner().nextLine()) {

                    case "1":
                        accountBasicCLI.getAccounts(clientID);
                        break;

                    case "2":
                        System.out.println("Choose account type: [ CHECKING, SAVING, FIXED ]");
                        accountBasicCLI.createAccountRequest(myCLI.requestAccountType(), clientID);
                        break;

                    case "6":
                        System.out.println(helpMessage);
                        break;

                    case "7":
                        System.out.println("Application Closed");
                        running = false;
                        break;

                    default:
                        System.out.println("Command not recognized!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input " + e.getMessage());
            }

        }
    }

}
