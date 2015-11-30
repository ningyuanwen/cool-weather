package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	/*
	 * ����������䶨��ɳ���,Ȼ����onCreate()������ִ�н���ÿ�ű���model���¶�Ӧһ��ʵ���࣬�����������
	 */
	
	/*
	 * Province�������,ʡ
	 */
	public static final String CREATE_PROVINCE = "create table Provice("+"id integer primary key autoincrement,"+"provice_name text,"+"provice_code text)";	

	/*
	 * City������䣬��
	 */
	public static final String CREATE_CITY = "create table City("+"id integer primary key autoincrement,"+"city_name text,"+"city_code text,"+"provice_id integer)";
	
	/*
	 * County������䣬��
	 */
	public static final String CREATE_COUNTY = "create table County ("+"id integer primary key autoincrement,"+"county_name text,"+"county_code text,"+"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version)
	{
		super(context,name,factory,version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);	//����Province��
		db.execSQL(CREATE_CITY);	//����City��
		db.execSQL(CREATE_PROVINCE);	//����County��
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
}
