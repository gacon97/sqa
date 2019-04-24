/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ngona
 */
public class Loan_asset {
    private int id, customer_id, asset_id;
    private float interest, amount;
    private String term, type, status;
    private Date start_date, end_date;

    public Loan_asset(int id, int customer_id, int asset_id, float interest, float amount, String term, String type, String status, Date start_date, Date end_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.asset_id = asset_id;
        this.interest = interest;
        this.amount = amount;
        this.term = term;
        this.type = type;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getAsset_id() {
        return asset_id;
    }

    public float getInterest() {
        return interest;
    }

    public float getAmount() {
        return amount;
    }

    public String getTerm() {
        return term;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setAsset_id(int asset_id) {
        this.asset_id = asset_id;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    
    
    
}
