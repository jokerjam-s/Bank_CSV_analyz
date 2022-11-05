package org.bank.analyzer.paysdata;

import java.time.LocalDate;


public class PaysData {
    private LocalDate date;
    private Double summa;
    private String account;

    /**
     * Конструктор без параметров
     */
    public PaysData(){
        date = LocalDate.now();
        summa = 0.;
        account = "";
    }

    /**
     * Конструктор с параметрами
     * @param date
     * @param summa
     * @param account
     */
    public PaysData(final LocalDate date, final Double summa, final String account){
        this.date = date;
        this.summa = summa;
        this.account = account;
    }

    /**
     * Конструктор копирования
     * @param paysData
     */
    public PaysData(final PaysData paysData){
        this.date = paysData.date;
        this.summa = paysData.summa;
        this.account = paysData.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSumma(Double summa) {
        this.summa = summa;
    }

    public Double getSumma() {
        return summa;
    }

    public String getAccount() {
        return account;
    }

    public LocalDate getDate() {
        return date;
    }
}
