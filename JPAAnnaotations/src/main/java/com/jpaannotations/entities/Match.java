package com.jpaannotations.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="crmatch")
public class Match {
    @Id
    @Column(name="match_no")
    private int matchNo;
    @Column(name="tname")
    private String tname;
    @Column(name="match_dt")
    private LocalDate match_dt;
    @Column(name="player1")
    private String player1;
    @Column(name="player2")
    private String player2;
    @Column(name="location")
    private String location;

    public int getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(int matchNo) {
        this.matchNo = matchNo;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public LocalDate getMatch_dt() {
        return match_dt;
    }

    public void setMatch_dt(LocalDate match_dt) {
        this.match_dt = match_dt;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match match)) return false;
        return getMatchNo() == match.getMatchNo() && Objects.equals(getTname(), match.getTname()) && Objects.equals(getMatch_dt(), match.getMatch_dt()) && Objects.equals(getPlayer1(), match.getPlayer1()) && Objects.equals(getPlayer2(), match.getPlayer2()) && Objects.equals(getLocation(), match.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatchNo(), getTname(), getMatch_dt(), getPlayer1(), getPlayer2(), getLocation());
    }
}
