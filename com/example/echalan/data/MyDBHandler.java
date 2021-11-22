package com.example.echalan.data;



import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.util.Log;

import com.example.echalan.model.Login;
import com.example.echalan.model.VehicleInfo;
import com.example.echalan.params.Params;

public class MyDBHandler extends SQLiteOpenHelper {

    public MyDBHandler(Context context) {
        super(context,Params.DB_NAME,null,Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//       String create = "CREATE TABLE "+ Params.LOGIN_TABLE + "(" + Params.KEY_ID + " INTEGER PRIMARY KEY, " + Params.KEY_USERNAME + " TEXT, "
//               + Params.KEY_PASSWORD + " TEXT" +")";
//        Log.d("ECHALLAN APP DB" , "Query Executed by "+create);
//        db.execSQL(create);


        String create = "CREATE TABLE " + Params.VEHICLE_TABLE + "(" + Params.VKEY_ID + Params.KEY_FULLNAME + "TEXT, " + Params.KEY_VEHICLENAME + "TEXT, "
        + Params.KEY_VEHICLENUMBER + "TEXT, " + Params.KEY_MOBILE_NO + "TEXT, " + Params.KEY_ADDRESS + "TEXT, " + Params.KEY_MAILID + "TEXT" + ")";
        Log.d("ECHALLAN APP DB" , "Query Execute Successfully");
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addLogin(Login login){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Params.KEY_USERNAME,login.getUsername());
        values.put(Params.KEY_PASSWORD,login.getPassword());
        db.insert(Params.LOGIN_TABLE,null,values);
        Log.d("ECHALLAN APP DB" , "Query Executed Successfully (Insert Operation) ");
        db.close();
    }

    public void addVehicleInfo(VehicleInfo vehicleInfo){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Params.KEY_FULLNAME, vehicleInfo.getFullname());
        values.put(Params.KEY_VEHICLENAME, vehicleInfo.getVechicleName());
        values.put(Params.KEY_VEHICLENUMBER, vehicleInfo.getVechicleNo());
        values.put(Params.KEY_MOBILE_NO, vehicleInfo.getMobileNo());
        values.put(Params.KEY_ADDRESS, vehicleInfo.getAddress());
        values.put(Params.KEY_MAILID, vehicleInfo.getMailId());
        Log.d("ECHALLAN APP DB" , "Query Executed Successfully (Vehicle Insert Operation is success) ");
        db.close();

    }
}
