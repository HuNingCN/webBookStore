package com.hn.bean;

public class Product {
	
	/**
	 * 商品编号
	 */
	private String p_id;
	/**
	 * 商品名 标题
	 */
	private String name;
	/**
	 * 简介
	 */
	private String brief;
	/**
	 * 商品属性
	 */
	private String info;
	/**
	 * 商品描述
	 */
	private String describe;
	/**
	 * 原价
	 */
	private double costPrice;
	/**
	 * 单价
	 */
	private double unitPrice;
	/**
	 * 库存
	 */
	private int stock;
	/**
	 * 图片 以|分隔
	 */
	private String pic;
	/**
	 * 分类
	 */
	private String category;
	
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
