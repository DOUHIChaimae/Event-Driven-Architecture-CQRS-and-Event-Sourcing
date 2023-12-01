package ma.enset.accountserviceaxon.commonapi.dtos;

import lombok.Data;

@Data
public class DebitAccountRequestDto {
    private String accountId;
    private double amount;
    private String currency;
}
