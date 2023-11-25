package minhnqph38692.fpoly.quanlykho.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import minhnqph38692.fpoly.quanlykho.database.DbHelper;
import minhnqph38692.fpoly.quanlykho.model.Product;

public class Product_DAO {
    SQLiteDatabase db;
    DbHelper dbHelper;
    public Product_DAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long Insert_Product(Product product){
        ContentValues values = new ContentValues();
        values.put("ten",product.getTen());
        values.put("quantity",product.getQuantity());
        values.put("price",product.getPrice());
        values.put("photo",product.getPhoto());
        values.put("user",product.getUserID());

        return db.insert("Product",null,values);

    }
    public  int Update_Product(Product product){
        ContentValues values = new ContentValues();
        values.put("ten",product.getTen());
        values.put("quantity",product.getQuantity());
        values.put("price",product.getPrice());
        values.put("photo",product.getPhoto());
        values.put("user",product.getUserID());

        String[] dk = new String[]{String.valueOf(product.getId())};

        return db.update("Product",values,"id=?",dk);
    }
    public int Delete_Product(Product product){
        String[] dk = new String[]{String.valueOf(product.getId())};

        return db.delete("Product","id=?",dk);
    }
    public List<Product> getData(String sql, String...seletionArgs){
        List<Product> list = new ArrayList<>();
        Cursor c = db.rawQuery(sql,seletionArgs);
        while (c.moveToNext()){
            Product product = new Product();
            product.setId(c.getInt(0));
            product.setTen(c.getString(1));
            product.setQuantity(c.getInt(2));
            product.setPrice(c.getString(3));
            product.setPhoto(c.getString(4));
            product.setUserID(c.getString(5));
            list.add(product);
        }
        return list;
    }
}
