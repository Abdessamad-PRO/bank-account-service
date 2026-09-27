package org.sid.bank_account_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sid.bank_account_service.enums.AccountType;

import java.awt.dnd.DropTarget;
import java.util.Date;

@Entity
@Slf4j @AllArgsConstructor @NoArgsConstructor @Data @Builder
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountType type;

}
