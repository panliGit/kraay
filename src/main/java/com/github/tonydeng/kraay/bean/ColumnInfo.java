package com.github.tonydeng.kraay.bean;

/**
 * Created by tonydeng on 14-8-27.
 */
public class ColumnInfo {
    private String name;
    private String type;

    public ColumnInfo() {
    }

    public ColumnInfo(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
