package com.example.Sortilegios.Weasley.Domain.Dto;


import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private Integer billId;
    private String paymentMethod;
    private LocalDateTime date;
    private String witcherId;
    private List<PurchaseItem> items;


    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getWitcherId() {
        return witcherId;
    }

    public void setWitcherId(String witcherId) {
        this.witcherId = witcherId;
    }

    public List<PurchaseItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseItem> items) {
        this.items = items;
    }
}
