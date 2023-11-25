package minhnqph38692.fpoly.quanlykho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import minhnqph38692.fpoly.quanlykho.database.DbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHelper dbHelper = new DbHelper(this);
        dbHelper.getWritableDatabase();

    }
}