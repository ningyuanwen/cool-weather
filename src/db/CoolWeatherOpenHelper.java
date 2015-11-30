package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	/*
	 * 三条建表语句定义成常量,然后在onCreate()方法中执行建表，每张表在model包下对应一个实体类，方便后续开发
	 */
	
	/*
	 * Province表建表语句,省
	 */
	public static final String CREATE_PROVINCE = "create table Provice("+"id integer primary key autoincrement,"+"provice_name text,"+"provice_code text)";	

	/*
	 * City表建表语句，市
	 */
	public static final String CREATE_CITY = "create table City("+"id integer primary key autoincrement,"+"city_name text,"+"city_code text,"+"provice_id integer)";
	
	/*
	 * County表建表语句，县
	 */
	public static final String CREATE_COUNTY = "create table County ("+"id integer primary key autoincrement,"+"county_name text,"+"county_code text,"+"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version)
	{
		super(context,name,factory,version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);	//创建Province表
		db.execSQL(CREATE_CITY);	//创建City表
		db.execSQL(CREATE_PROVINCE);	//创建County表
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
}
