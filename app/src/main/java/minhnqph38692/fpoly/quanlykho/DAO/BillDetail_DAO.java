package minhnqph38692.fpoly.quanlykho.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import minhnqph38692.fpoly.quanlykho.database.DbHelper;
import minhnqph38692.fpoly.quanlykho.model.BillDetail;

public class BillDetail_DAO {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public BillDetail_DAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();

    }
    public long Insert_BillDetail(BillDetail billDetail){
        ContentValues values = new ContentValues();
        values.put("billID",billDetail.getBillID());
        values.put("quantity",billDetail.getQuantity());
        values.put("createDate",billDetail.getCreatedDate());

        return db.insert("BillDetail",null,values);
    }
    public  int Update_BillDetail(BillDetail billDetail){
        ContentValues values = new ContentValues();
        values.put("billID",billDetail.getBillID());
        values.put("quantity",billDetail.getQuantity());
        values.put("createDate",billDetail.getCreatedDate());

        String[] dk = new String[]{String.valueOf(billDetail.getId())};

        return db.update("BillDetail",values,"id=?",dk);
    }
    public int Delete_BillDetail(BillDetail billDetail){
        String[] dk = new String[]{String.valueOf(billDetail.getId())};

        return db.delete("BillDetail","id=?",dk);
    }

    public List<BillDetail> getAll(){
        String sql = "SELECT * FROM BillDetail ";
        return getData(sql);
    }
    public BillDetail getID(String id){
        String sql = "SELECT * FROM BillDetail WHERE id=?";
        List<BillDetail> list = getData(sql,id);
        return list.get(0);
    }

    public List<BillDetail> getData(String sql,String...SeletionArgs){
        List<BillDetail> list = new ArrayList<>();
        Cursor c = db.rawQuery(sql,SeletionArgs);
        while (c.moveToNext()){
            BillDetail billDetail = new BillDetail();
            billDetail.setId(c.getInt(0));
            billDetail.setBillID(c.getInt(1));
            billDetail.setQuantity(c.getInt(2));
            billDetail.setCreatedDate(c.getString(3));
            list.add(billDetail);
        }
        return list;
    }
}
