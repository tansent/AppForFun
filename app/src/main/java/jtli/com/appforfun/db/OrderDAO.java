package jtli.com.appforfun.db;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import android.R.integer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import jtli.com.appforfun.OrderInfo;

public class OrderDAO {

	private OrderDBOpenHelper helper;
	private Context context;
	
	/**
	 * constructor - creates database and tables
	 * @param context
	 */
	public OrderDAO(Context context){
		helper = new OrderDBOpenHelper(context);
		this.context = context;
	}
	
	/**
	 * time will be added automatically
	 * @param ordered_names
	 * @param total_price
	 */
	public void addOrder(String ordered_names, double total_price){
		SQLiteDatabase db = helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("ordered_time", getCurrentTime());
		values.put("ordered_names", ordered_names);
		values.put("total_price", total_price);
		db.insert("orders", null, values);
		db.close();
	}
	
	public void deleteAll(){
		SQLiteDatabase db = helper.getWritableDatabase();
		db.delete("orders", null, null);
//		db.delete("orders", "id = ? and price = ? ", new String[]{"123","$33"});
		db.close();
	}
	
	public List<OrderInfo> searchAllOrders(){
		List<OrderInfo> resultList = new ArrayList<OrderInfo>();
		SQLiteDatabase db = helper.getReadableDatabase();
		Cursor cursor = db.rawQuery("select order_id,ordered_time,ordered_names,total_price from orders order by order_id desc",null);
		while (cursor.moveToNext()) {
			OrderInfo order = new OrderInfo();
			String order_id_String = cursor.getString(0);
			int order_id = Integer.parseInt(order_id_String);
			String ordered_time = cursor.getString(1);
			String ordered_names = cursor.getString(2);
			String total_price_string = cursor.getString(3);
			double total_price = Double.parseDouble(total_price_string);
			
			order.setOrder_id(order_id);
			order.setOrdered_time(ordered_time);
			order.setOrdered_names(ordered_names);
			order.setTotal_price(total_price);
			resultList.add(order);
		}
		cursor.close();
		db.close();
		return resultList;
	}
	
	
	/**
	 * obtain current time
	 */
	public String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	
}
