package ma.enset.accountserviceaxon.communapi.events;

import ma.enset.accountserviceaxon.communapi.enums.AccountStatus;

public class AccountCreatedEvent extends BaseEvent<String> {

    public String currency;
    public double balance;

    private AccountStatus status;

    public AccountCreatedEvent(String id, String currency, double balance, AccountStatus status) {
        super(id);
        this.currency = currency;
        this.balance = balance;
        this.status = status;
    }
}
