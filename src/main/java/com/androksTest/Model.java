package com.androksTest;


/**
 * Created by androks on 2/20/2017.
 */
public class Model {

    private String value;

    public Model() {
        value = "";
    }

    public Model(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue(String[] values) {
        StringBuilder builder = new StringBuilder();
        for (String value : values)
            builder.append(value + " ");
        this.value = builder.toString();
    }

    public String getValue() {
        return value;
    }


}
