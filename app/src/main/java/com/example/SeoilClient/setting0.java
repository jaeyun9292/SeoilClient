package com.example.SeoilClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

public class setting0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting0);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        Intent intent = getIntent();
        setTitle(intent.getExtras().getString("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = (TextView)findViewById(R.id.setting_text0);
        textView.setText("1 조 (목적 및 정의)\n" +
                "\n" +
                "서일대학교가 제공하는 서비스를 이용해 주셔서 감사합니다. 학교는 여러분이 학교가 제공하는 다양한 서비스에 더 가깝고 편리하게 다가갈 수 있도록 '서비스약관’(이하 ‘본 약관’)을 마련하였습니다.본 약관은 여러분이 서비스를 이용하는 데 필요한 권리, 의무 및 책임사항, 이용조건 및 절차 등 기본적인 사항을 규정하고 있으므로 조금만 시간을 내서 주의 깊게 읽어주시기 바랍니다.\n" +
                "\n" +
                "제 2 조 (약관의 효력 및 변경)\n" +
                "\n" +
                "① 본 약관의 내용은 서비스의 화면에 게시하거나 기타의 방법으로 공지하고, 본 약관에 동의한 여러분 모두에게 그 효력이 발생합니다.\n" +
                "\n" +
                "② 학교는 필요한 경우 관련 법령을 위배하지 않는 범위 내에서 본 약관을 변경할 수 있습니다. 본 약관이 변경되는 경우 학교는 변경사항을 시행일자 15일 전부터 여러분에게 서비스 공지사항에서 공지 또는 통지하는 것을 원칙으로 하며, 피치 못하게 여러분에게 불리한 내용으로 변경할 경우에는 그 시행일자 30일 전부터 서일대학교에 등록된 이메일 주소로 이메일(이메일주소가 없는 경우 서비스 내 전자쪽지 발송, 서비스 내 알림 메시지를 띄우는 등의 별도의 전자적 수단) 발송 또는 문자메시지 발송하는 방법 등으로 개별적으로 알려 드리겠습니다.\n" +
                "\n" +
                "③ 학교가 전 항에 따라 공지 또는 통지를 하면서 공지 또는 통지일로부터 개정약관 시행일 7일 후까지 거부의사를 표시하지 아니하면 승인한 것으로 본다는 뜻을 명확하게 고지하였음에도 여러분의 의사표시가 없는 경우에는 변경된 약관을 승인한 것으로 봅니다.\n" +
                "\n" +
                "④ 본 약관은 여러분이 본 약관에 동의한 날로부터 본 약관 제13조에 따른 이용계약의 해지 시까지 적용하는 것을 원칙으로 합니다. 단, 본 약관의 일부 조항은 이용계약의 해지 후에도 유효하게 적용될 수 있습니다\n" +
                "\n" +
                "제 3 조 (약관 외 준칙)\n" +
                "\n" +
                "본 약관에 규정되지 않은 사항에 대해서는 관련 법령 또는 통합서비스를 구성하는 개별 서비스의 운영정책 및 규칙, 개별 서비스 내 세부 하위서비스의 이용약관, 서일대학교 운영정책 및 규칙 등(이하 총칭하여 ‘세부지침’)의 규정에 따릅니다. 또한 본 약관과 세부지침의 내용이 충돌할 경우 세부지침에 따릅니다.\n"
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