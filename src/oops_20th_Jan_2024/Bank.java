package src.oops_20th_Jan_2024;

public class Bank {
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add( Bank bankName) throws CustomException {
        if (!(bankName.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR NOT Supported");
        }
        Integer sun = this.amount + bankName.amount;
        return sun;
    }
}
