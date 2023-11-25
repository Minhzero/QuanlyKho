package minhnqph38692.fpoly.quanlykho.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import minhnqph38692.fpoly.quanlykho.database.DbHelper;
import minhnqph38692.fpoly.quanlykho.model.User;

public class User_DAO {
    SQLiteDatabase db;
    DbHelper dbHelper;
    public User_DAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long Insert_User(User user){
        ContentValues values = new ContentValues();
        values.put("username",user.getUsername());
        values.put("name",user.getName());
        values.put("password",user.getPassword());
        values.put("position",user.getPosition());
        values.put("avartar",user.getAvatar());
        values.put("profile",user.getProfile());
        values.put("lastLogin",user.getLastLogin());
        values.put("createDate",user.getCreatedDate());
        values.put("lastAction",user.getLastAction());

        return db.insert("User",null,values);

    }
    public int Update_User(User user){
        ContentValues values = new ContentValues();
        values.put("username",user.getUsername());
        values.put("name",user.getName());
        values.put("password",user.getPassword());
        values.put("position",user.getPosition());
        values.put("avartar",user.getAvatar());
        values.put("profile",user.getProfile());
        values.put("lastLogin",user.getLastLogin());
        values.put("createDate",user.getCreatedDate());
        values.put("lastAction",user.getLastAction());

        String[] dk = new String[]{String.valueOf(user.getUsername())};

        return db.update("User",values,"username=?",dk);
    }
    public int Delete_User(User user){
        String[] dk = new String[]{String.valueOf(user.getUsername())};

        return db.delete("User","username=?",dk);
    }

    public List<User> getAll(){
        String sql = "SELECT * FROM User ";
        return  getData(sql);
    }
    public  User getId(String id){
        String sql = "SELECT * FROM User WHERE username=? ";
        List<User> list = getData(sql,id);
        return list.get(0);
    }

    public List<User> getData(String sql,String...selection){
        List<User> list = new ArrayList<>();
        Cursor c = db.rawQuery(sql,selection);
        while (c.moveToNext()){
            User user = new User();
            user.setUsername(c.getString(0));
            user.setName(c.getString(1));
            user.setPassword(c.getString(2));
            user.setPosition(c.getInt(3));
            user.setAvatar(c.getString(4));
            user.setProfile(c.getString(5));
            user.setLastLogin(c.getString(6));
            user.setCreatedDate(c.getString(7));
            user.setLastAction(c.getString(8));
            list.add(user);
        }
        return list;
    }

}
