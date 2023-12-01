package ma.enset.accountserviceaxon.commonapi.events;

import lombok.Getter;
import ma.enset.accountserviceaxon.commonapi.enums.AccountStatus;

public class AccountActivatedEvent extends BaseEvent<String> {
    @Getter
    public AccountStatus status;

    public AccountActivatedEvent(String id, AccountStatus status) {
        super(id);
        this.status = status;
    }
}
