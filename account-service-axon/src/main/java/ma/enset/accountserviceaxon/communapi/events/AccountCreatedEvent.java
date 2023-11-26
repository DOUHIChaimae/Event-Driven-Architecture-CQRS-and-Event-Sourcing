package ma.enset.accountserviceaxon.communapi.events;

import lombok.Getter;
import ma.enset.accountserviceaxon.communapi.enums.AccountStatus;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;

public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter
    public String currency;
    @Getter
    public double balance;
    @Getter

    private AccountStatus status;

    public AccountCreatedEvent(String id, String currency, double balance, AccountStatus status) {
        super(id);
        this.currency = currency;
        this.balance = balance;
        this.status = status;
    }
}
