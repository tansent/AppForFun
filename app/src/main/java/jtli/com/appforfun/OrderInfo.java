package jtli.com.appforfun;

import android.R.string;

public class OrderInfo {

	private int order_id;
	private String ordered_time;
	private String ordered_names;
	private double total_price;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public String getOrdered_time() {
		return ordered_time;
	}
	public void setOrdered_time(String ordered_time) {
		this.ordered_time = ordered_time;
	}
	public String getOrdered_names() {
		return ordered_names;
	}
	public void setOrdered_names(String ordered_names) {
		this.ordered_names = ordered_names;
	}
	
	
}
