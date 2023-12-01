package ma.enset.accountserviceaxon.commonapi.events;

import lombok.Getter;
import ma.enset.accountserviceaxon.commonapi.enums.AccountStatus;

public class AccountCreditedEvent extends BaseEvent<String> {
    @Getter
    public String currency;
    @Getter
    public double amount;


    public AccountCreditedEvent(String id, String currency, double amount) {
        super(id);
        this.currency = currency;
        this.amount = amount;
    }
}
