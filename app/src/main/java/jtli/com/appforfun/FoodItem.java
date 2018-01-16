package jtli.com.appforfun;

import android.graphics.drawable.Drawable;

public class FoodItem {
	private String name;
	private double price;
	private Drawable icon;
	private boolean isChecked;
	
	
	public FoodItem(String name, double price, Drawable icon, boolean isChecked) {
		super();
		this.name = name;
		this.price = price;
		this.icon = icon;
		this.isChecked = isChecked;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Drawable getIcon() {
		return icon;
	}
	public void setIcon(Drawable icon) {
		this.icon = icon;
	}
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	
	
}
