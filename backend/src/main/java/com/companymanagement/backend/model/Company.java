package com.companymanagement.backend.model;

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
@Table(name = "tbl_Company", uniqueConstraints = @UniqueConstraint(name = "email_id_unique", columnNames = "email_address"))
public class Company {

        @Id
        @SequenceGenerator(name = "company_sequence", sequenceName = "company_sequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_sequence")
        @Column(name = "company_id", nullable = false)
        private Long companyID;

        @Column(name = "company_name", nullable = false)
        private String companyName;

        @Column(name = "email_address", nullable = false)
        private String emailID;

        @Column(name = "company_password", nullable = false)
        private String password;

        public Company(String companyName, String emailID, String password) {
                this.companyName = companyName;
                this.emailID = emailID;
                this.password = password;
        }

        public Long getCompanyID() {
                return companyID;
        }

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }

        public String getEmailID() {
                return emailID;
        }

        public void setEmailID(String emailID) {
                this.emailID = emailID;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        

        

}
