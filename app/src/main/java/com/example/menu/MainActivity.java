package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuXemds:
                Toast.makeText(this,"Xem danh sách",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.mnuXemdssv:
                Toast.makeText(this,"Xem danh sách sinh viên",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.mnusuads:
                Toast.makeText(this,"Thao tác sửa được chọn",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.mnuXemdslh:
                Toast.makeText(this,"Xem danh sách lớp học",Toast.LENGTH_LONG).show();
                return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
