package com.example.SeoilClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

public class setting3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting3);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        Intent intent = getIntent();
        setTitle(intent.getExtras().getString("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = (TextView)findViewById(R.id.setting_text3);
        textView.setText("① GOOGLE MAP\n" +
                        "\n" +" 구글에서 제공하는 지도 서비스이다. 구글 지도는, 실시간 교통 상황, 그리고 도보, 셔틀버스의 경로를 제공.\n" +
                        "\n" + "② ORACLE DATABASE\n" +
                        "\n" + "미국 오라클(Oracle)사의 관계형 데이터베이스 관리 시스템의 이름이다. 검색이나 업데이트용 언어로는 국제표준화기구의 표준 구조화 조회 언어와 PL/SQL을 지원"
                );
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}