//
// This file was generated by the JPA Modeler
//
package com.github.braully.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class GenericValue extends AbstractEntity implements Serializable {

    @Basic
    private String stringValue;

    @Basic
    private Integer intValue;

    @Basic
    private Boolean booleanValue;

    @Basic
    private String attribute;

    @Basic
    private Double doubleValue;

    @Basic
    private String type;

    @Basic
    private String grouping;

    public GenericValue() {

    }

    public String getStringValue() {
        return this.stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return this.intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrouping() {
        return this.grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }
}
