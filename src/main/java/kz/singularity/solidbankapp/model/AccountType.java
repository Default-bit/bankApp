package kz.singularity.solidbankapp.model;

public enum AccountType {
    FIXED("FIXED"),
    SAVING("SAVING"),
    CHECKING("CHECKING");

    private String type;
    public String getType(){
        return type;
    }
    AccountType(String type){
        this.type = type;
    }
}
