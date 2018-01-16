package jtli.com.appforfun.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OrderDBOpenHelper extends SQLiteOpenHelper {

	/**
	 * Database named "order.db" starting with version 1
	 * @param context
	 */
	public OrderDBOpenHelper(Context context) {
		super(context, "order.db", null, 1); 
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {//datetime DEFAULT CURRENT_TIMESTAMP
		//table name and database name cannot be the same
		db.execSQL("create table orders (order_id integer primary key autoincrement, ordered_time varchar(100), ordered_names varchar(100), total_price double(30))");
//		db.execSQL("create table person(_id integer primary key autoincrement, name char(20), salary char(20), phone integer(20))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
