package com.hwua.entity;

public class Goods {
    private  Integer goods_id;
    private  String goods_name;
    private  Double goods_price;
    private  String goods_info;
    private  Integer goods_count;
    private  Integer goods_number;
    private  String goods_img;
    private  Integer goods_type;

    public Goods() {
    }

    public Goods(Integer goods_id, String goods_name, Double goods_price, String goods_info, Integer goods_count, Integer goods_number, String goods_img, Integer goods_type) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_info = goods_info;
        this.goods_count = goods_count;
        this.goods_number = goods_number;
        this.goods_img = goods_img;
        this.goods_type = goods_type;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_info() {
        return goods_info;
    }

    public void setGoods_info(String goods_info) {
        this.goods_info = goods_info;
    }

    public Integer getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(Integer goods_count) {
        this.goods_count = goods_count;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public Integer getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(Integer goods_type) {
        this.goods_type = goods_type;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_info='" + goods_info + '\'' +
                ", goods_count=" + goods_count +
                ", goods_number=" + goods_number +
                ", goods_img='" + goods_img + '\'' +
                ", goods_type=" + goods_type +
                '}';
    }
}
