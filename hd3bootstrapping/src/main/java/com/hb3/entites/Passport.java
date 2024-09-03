package com.hb3.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Passport implements Serializable {
    private int passPortNo;
    private String passportHolderName;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String issuedAuthority;

    public int getPassPortNo() {
        return passPortNo;
    }

    public void setPassPortNo(int passPortNo) {
        this.passPortNo = passPortNo;
    }

    public String getPassportHolderName() {
        return passportHolderName;
    }

    public void setPassportHolderName(String passportHolderName) {
        this.passportHolderName = passportHolderName;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getIssuedAuthority() {
        return issuedAuthority;
    }

    public void setIssuedAuthority(String issuedAuthority) {
        this.issuedAuthority = issuedAuthority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return getPassPortNo() == passport.getPassPortNo() && Objects.equals(getPassportHolderName(), passport.getPassportHolderName()) && Objects.equals(getIssueDate(), passport.getIssueDate()) && Objects.equals(getExpiryDate(), passport.getExpiryDate()) && Objects.equals(getIssuedAuthority(), passport.getIssuedAuthority());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassPortNo(), getPassportHolderName(), getIssueDate(), getExpiryDate(), getIssuedAuthority());
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passPortNo=" + passPortNo +
                ", passportHolderName='" + passportHolderName + '\'' +
                ", issueDate=" + issueDate +
                ", expiryDate=" + expiryDate +
                ", issuedAuthority='" + issuedAuthority + '\'' +
                '}';
    }
}
