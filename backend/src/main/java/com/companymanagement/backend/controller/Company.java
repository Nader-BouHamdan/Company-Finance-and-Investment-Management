package com.companymanagement.backend.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( 
        name = "tbl_Company",
        uniqueConstraints = @UniqueConstraint(
            name = "email_id_unique",
            columnNames = "email_address"
        )
)
public class Company {

    @Id
    @SequenceGenerator(
        name = "company_sequence",
        sequenceName = "company_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "company_sequence"
    )
    private Long companyID;

    @Column(
            name = "email_address",
            nullable = false
    )
    private String emailID;

    private String companyName;
    private String password;
    private String role;

}
