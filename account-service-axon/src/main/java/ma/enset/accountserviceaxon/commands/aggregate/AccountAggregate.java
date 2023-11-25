package ma.enset.accountserviceaxon.commands.aggregate;

import ma.enset.accountserviceaxon.communapi.commands.CreateAccountCommand;
import ma.enset.accountserviceaxon.communapi.enums.AccountStatus;
import ma.enset.accountserviceaxon.communapi.exceptions.NegativeBalanceException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class AccountAggregate {
    private String accountId;
    private double balance;
    private String currency;

    private AccountStatus status;

    public AccountAggregate() {
        // Required by Axon to build a default Aggregate prior to Event Sourcing
    }

    @CommandHandler
    public AccountAggregate(CreateAccountCommand command) {
        if(command.getInitialBalance() < 0) throw new NegativeBalanceException("Initial balance cannot be negative");
        apply(command);
    }


}
