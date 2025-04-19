package com.micro.accounts.entity;

import com.micro.accounts.dto.AccountsDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Table(name = "accounts")
public class Accounts extends BaseEntity{

    @Id
    @Column(name = "account_number")
    private Long accountNumber;

    private Long customerId;

    private String accountType;

    private String branchAddress;
}
