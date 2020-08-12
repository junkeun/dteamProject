package com.example.project_p5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActionBar abar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();  //제목줄 객체 얻어오기
        actionBar.setTitle("대여하고 싶은 상품을 검색해보세요");  //액션바 제목설정

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();

        switch (curId){

            case R.id.menu_search:
                Toast.makeText(this,"검색 메뉴 눌림...", Toast.LENGTH_SHORT).show();
                break;

            case android.R.id.home:
                Toast.makeText(this,"홈 메뉴가 눌림...", Toast.LENGTH_SHORT).show();
                this.finish();

                break;
        }


        return true;
    }
}