package com.example.SeoilClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

public class setting1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting1);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        Intent intent = getIntent();
        setTitle(intent.getExtras().getString("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = (TextView)findViewById(R.id.setting_text1);
        textView.setText("제 1 조 (목적)\n" +
                "\n" +
                "본 약관은 서일대학교가 제공하는 위치기반서비스에 대해 학교와 위치기반서비스를 이용하는 개인위치정보주체(이하 \"이용자\")간의 권리·의무 및 책임사항, 기타 필요한 사항 규정을 목적으로 합니다.\n" +
                "\n" +
                "제 2 조 (이용약관의 효력 및 변경)\n" +
                "\n" +
                "① 본 약관은 이용자가 본 약관에 동의하고 학교가 정한 절차에 따라 위치기반서비스의 이용자로 등록됨으로써 효력이 발생합니다.\n" +
                "\n" +
                "② 학교는 법률이나 위치기반서비스의 변경사항을 반영하기 위한 목적 등으로 약관을 수정할 수 있습니다.\n" +
                "\n" +
                "③ 약관이 변경되는 경우 학교는 변경사항을 최소 7일 전에 학교의 홈페이지 등 기타 공지사항 페이지를 통해 게시합니다.\n" +
                "\n" +
                "④ 단, 개정되는 내용이 이용자 권리의 중대한 변경이 발생하는 경우에는 30일 전에 게시하도록 하겠습니다.\n" +
                "\n" +
                "제 3 조 (약관 외 준칙)\n" +
                "\n" +
                "이 약관에 명시되지 않은 사항에 대해서는 위치 정보의 보호 및 이용 등에 관한 법률, 전기통신사업법, 정보통신망 이용 촉진및 보호 등에 관한 법률 등 관계법령 및 학교가 정한 지침 등의 규정에 따릅니다.\n" +
                "\n" +
                "제 4 조 (서비스의 내용)\n" +
                "\n" +
                "학교는 직접 수집하거나 위치정보사업자로부터 수집한 이용자의 현재 위치 또는 현재 위치가 포함된 지역을 이용하여 아래와 같은 위치기반서비스를 제공합니다.\n" +
                "\n" +
                "① 위치정보를 활용한 정보 검색결과 및 콘텐츠를 제공하거나 추천\n" +
                "\n" +
                "② 생활편의를 위한 위치 공유, 위치/지역에 따른 알림, 경로 안내\n" +
                "\n" +
                "제 5 조 (서비스 이용요금)\n" +
                "\n" +
                "학교가 제공하는 위치기반서비스는 무료입니다.\n" +
                "단, 무선 서비스 이용 시 발생하는 데이터 통신료는 별도이며, 이용자가 가입한 각 이동통신사의 정책에 따릅니다.\n" +
                "\n" +
                "제 6 조 (서비스 이용의 제한·중지)\n" +
                "\n" +
                "① 학교는 위치기반서비스사업자의 정책변경 등과 같이 학교의 제반사정 또는 법률상의 이유로 위치기반서비스를 유지할 수 없는 경우 위치기반서비스의 전부 또는 일부를 제한·변경·중지할 수 있습니다.<\n" +
                "\n" +
                "② 단, 위 항에 의한 위치기반서비스 중단의 경우 학교는 사전에 학교 홈페이지 등 기타 공지사항 페이지를 통해 공지하거나 이용자에게 통지합니다.\n" +
                "\n" +
                "제 7 조 (개인위치정보주체의 권리)\n" +
                "\n" +
                "① 이용자는 언제든지 개인위치정보의 수집·이용·제공에 대한 동의 전부 또는 일부를 유보할 수 있습니다.\n" +
                "\n" +
                "② 이용자는 언제든지 개인위치정보의 수집·이용·제공에 대한 동의 전부 또는 일부를 철회할 수 있습니다. 이 경우 학교는 지체 없이 철회된 범위의 개인위치정보 및 위치정보 수집·이용·제공사실 확인자료를 파기합니다.\n" +
                "\n" +
                "③ 이용자는 개인위치정보의 수집·이용·제공의 일시적인 중지를 요구할 수 있으며, 이 경우 학교는 이를 거절할 수 없고 이를 충족하는 기술적 수단을 마련합니다.\n" +
                "\n" +
                "④ 이용자는 학교에 대하여 아래 자료에 대한 열람 또는 고지를 요구할 수 있으며, 해당 자료에 오류가 있는 경우에는 정정을 요구할 수 있습니다. 이 경우 정당한 사유 없이 요구를 거절하지 않습니다.\n" +
                "\n" +
                "1. 이용자에 대한 위치정보 수집·이용·제공사실 확인자료\n" +
                "\n" +
                "2. 이용자의 개인위치정보가 위치정보의 보호 및 이용 등에 관한 법률 또는 다른 법령의 규정에 의하여 제3자에게 제공된 이유 및 내용\n" +
                "\n" +
                "⑤ 이용자는 권리행사를 위해 본 약관 제14조의 연락처를 이용하여 학교에 요청할 수 있습니다.\n" +
                "\n" +
                "제 8 조 (개인위치정보의 이용 또는 제공)\n" +
                "\n" +
                "① 학교는 개인위치정보를 이용하여 위치기반서비스를 제공하는 경우 본 약관에 고지하고 동의를 받습니다.\n" +
                "\n" +
                "② 학교는 이용자의 동의 없이 개인위치정보를 제3자에게 제공하지 않으며, 제3자에게 제공하는 경우에는 제공받는 자 및 제공목적을 사전에 이용자에게 고지하고 동의를 받습니다.\n" +
                "\n" +
                "③ 학교는 개인위치정보를 이용자가 지정하는 제3자에게 제공하는 경우 개인위치정보를 수집한 통신단말장치로 매회 이용자에게 제공받는 자, 제공일시 및 제공목적을 즉시 통지합니다.\n" +
                "\n"
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