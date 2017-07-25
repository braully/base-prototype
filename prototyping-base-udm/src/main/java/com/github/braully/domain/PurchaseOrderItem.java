//
// This file was generated by the JPA Modeler
//
package com.github.braully.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseOrderItem extends AbstractEntity implements Serializable {

    @Basic
    private BigDecimal priceUnit;

    @Basic
    private Double quantity;

    @Basic
    private String observation;

    @ManyToOne(targetEntity = PurchaseOrder.class)
    private PurchaseOrder purchaseOrder;

    @Basic
    private String attribute;

    public PurchaseOrderItem() {

    }

    public BigDecimal getPriceUnit() {
        return this.priceUnit;
    }

    public void setPriceUnit(BigDecimal priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getObservation() {
        return this.observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public PurchaseOrder getPurchaseOrder() {
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}