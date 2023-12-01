package ma.enset.accountserviceaxon.query.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.accountserviceaxon.commonapi.events.AccountCreatedEvent;
import ma.enset.accountserviceaxon.query.entities.Account;
import ma.enset.accountserviceaxon.query.repositories.AccountRepository;
import ma.enset.accountserviceaxon.query.repositories.OperationRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Slf4j
public class AccountServiceHandler {
    AccountRepository accountRepository;
    OperationRepository operationRepository;

    @EventHandler
    public void on(AccountCreatedEvent event) {
        log.info("AccountCreatedEvent received...");
        Account account = new Account();
        account.setId(event.getId());
        account.setBalance(event.getBalance());
        account.setCurrency(event.getCurrency());
        account.setStatus(event.getStatus());
        accountRepository.save(account);
    }
}
