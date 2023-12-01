package ma.enset.accountserviceaxon.commonapi.events;

import lombok.Getter;

public class AccountDebitedEvent extends BaseEvent<String> {
    @Getter
    public String currency;
    @Getter
    public double amount;


    public AccountDebitedEvent(String id, String currency, double amount) {
        super(id);
        this.currency = currency;
        this.amount = amount;
    }
}
