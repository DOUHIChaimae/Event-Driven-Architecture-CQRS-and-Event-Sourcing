package ma.enset.accountserviceaxon.query.entities;

import ma.enset.accountserviceaxon.commonapi.enums.OperationType;

import java.util.Date;

public class Operation {
    private Long id;
    private Date date;
    private double amount;
    private OperationType operationType;

}
