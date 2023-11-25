package minhnqph38692.fpoly.quanlykho.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// trong 1 du an chi nen co 1 file db
//1 file DbHelper
public class DbHelper extends SQLiteOpenHelper {

    //tạo bang bill
    //tạo bảng user
    //tạo bảng product
    //tạo bảng billproduct


    public  DbHelper(Context context){
        super(context,"file.db",null,3);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String table_Bill = "Create table Bill(id integer primary key autoincrement , quantity integer,productID integer , createdByuser text ,createdDate text, note text)";
        db.execSQL(table_Bill);
        String table_Product =  "Create table Product (id integer primary key autoincrement , ten text,quantity integer,price text,photo text,user text);\n";
        db.execSQL(table_Product);
        String insert_product = "insert into Product values(1,'helo',2,30000,'hloe','minh')" ;
        db.execSQL(insert_product);
        String table_BillDatail = "    Create table BillDetail(id integer primary key autoincrement , billID integer,quantity integer,createDate text);\n";
        db.execSQL(table_BillDatail);
        String table_User = "  Create table User(username text,name text , password text , position integer , avartar text,profile text,lastLogin text,createDate text,lastAction text);\n";
        db.execSQL(table_User);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP Table Bill");
        db.execSQL("DROP Table Product");
        db.execSQL("DROP Table BillDetail");
        db.execSQL("DROP Table User");
        onCreate(db);





    }
}
