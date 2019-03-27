package com.hwua.entity;

public class Type {
    private Integer type_id;
    private Integer type_big;
    private Integer type_small;
    private String type_name;

    public Type() {
    }

    public Type(Integer type_id, Integer type_big, Integer type_small, String type_name) {
        this.type_id = type_id;
        this.type_big = type_big;
        this.type_small = type_small;
        this.type_name = type_name;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getType_big() {
        return type_big;
    }

    public void setType_big(Integer type_big) {
        this.type_big = type_big;
    }

    public Integer getType_small() {
        return type_small;
    }

    public void setType_small(Integer type_small) {
        this.type_small = type_small;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type_id=" + type_id +
                ", type_big=" + type_big +
                ", type_small=" + type_small +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
