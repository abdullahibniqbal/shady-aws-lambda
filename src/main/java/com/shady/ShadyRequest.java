package com.shady;

public class ShadyRequest {
    private String name;
    private String value;
    private Integer number;
    private Float testFloatValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getTestFloatValue() {
        return testFloatValue;
    }

    public void setTestFloatValue(Float testFloatValue) {
        this.testFloatValue = testFloatValue;
    }
}
