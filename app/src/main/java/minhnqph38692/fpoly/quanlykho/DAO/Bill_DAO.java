package minhnqph38692.fpoly.quanlykho.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import minhnqph38692.fpoly.quanlykho.database.DbHelper;
import minhnqph38692.fpoly.quanlykho.model.Bill;

public class Bill_DAO {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public Bill_DAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();

    }
    public long Insert_Bill(Bill bill){
        ContentValues values = new ContentValues();
        values.put("quantity",bill.getQuanity());
        values.put("productID",bill.getProductID());
        values.put("createdByuser",bill.getCreatedByuser());
        values.put("createdDate",bill.getCreatedDate());
        values.put("note",bill.getNote());

        return db.insert("Bill",null,values);
    }
    public int Update_Bill(Bill bill){
        ContentValues values = new ContentValues();
        values.put("quantity",bill.getQuanity());
        values.put("productID",bill.getProductID());
        values.put("createdByuser",bill.getCreatedByuser());
        values.put("createdDate",bill.getCreatedDate());
        values.put("note",bill.getNote());
        String[] dk = new String[]{String.valueOf(bill.getId())};

        return db.update("Bill",values,"id=?",dk);
    }
    public int Delete_Bill(Bill bill){
        String[] dk = new String[]{String.valueOf(bill.getId())};

        return db.delete("Bill","id=?",dk);
    }
    public List<Bill> getAll(){
        String sql = "SELECT * FROM Bill";
        return getData(sql);
    }
    public Bill getID(String id){
        String sql = "SELECT * FROM Bill WHERE id = ?";
        List<Bill> list = getData(sql,id);
        return list.get(0);
    }
    public List<Bill> getData(String sql , String...selectionArgs){
        List<Bill> listbill = new ArrayList<>();
        Cursor c = db.rawQuery(sql,selectionArgs);
        while (c.moveToNext()){
            int id = c.getInt(0);
            int trangthai = c.getInt(1);
            int productID = c.getInt(2);
            String user = c.getString(3);
            String ngay = c.getString(4);
            String note = c.getString(5);

            Bill bill = new Bill();
            bill.setId(id);
            bill.setQuanity(trangthai);
            bill.setProductID(productID);
            bill.setCreatedByuser(user);
            bill.setCreatedDate(ngay);
            bill.setNote(note);

            listbill.add(bill);

        }
        return listbill;
    }
    public int getDoanhThu(String tungay,String denngay){
        String sqlDoanhthu = "SELECT SUM(price) as Doanhthu FROM Product INNER JOIN Bill ON Bill.productID = Product.id WHERE createDate BETWEEN ? AND ?";
        List<Integer> list = new ArrayList<>();
        Cursor c = db.rawQuery(sqlDoanhthu,new String[]{tungay,denngay});
        while (c.moveToNext()){
            try {
                list.add(c.getInt(0));
            }catch (Exception e ){
                list.add(0);
            }
        }
        return list.get(0);

    }
}
