package com.example.SeoilClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

public class setting2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        Intent intent = getIntent();
        setTitle(intent.getExtras().getString("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView = (TextView)findViewById(R.id.setting_text2);
        textView.setText("1. 개인정보 처리방침이란?\n" +
                "\n" +
                "서일대학교는 이용자의 ‘동의를 기반으로 개인정보를 수집·이용 및 제공’하고 있으며, ‘이용자의 권리 (개인정보 자기결정권)를 적극적으로 보장’합니다.\n" +
                "\n" +
                "학교는 정보통신서비스제공자가 준수하여야 하는 대한민국의 관계 법령 및 개인정보보호 규정, 가이드라인을 준수하고 있습니다.\n" +
                "\n" +
                "“개인정보처리방침”이란 이용자의 소중한 개인정보를 보호함으로써 이용자가 안심하고 서비스를 이용할 수 있도록 학교가 준수해야 할 지침을 의미합니다.\n" +
                "\n" +
                "2. 개인정보 수집\n" +
                "\n" +
                "서비스 제공을 위한 필요 최소한의 개인정보를 수집하고 있습니다.\n" +
                "\n" +
                "서비스 이용 과정에서 홈페이지 또는 개별 어플리케이션이나 프로그램 등을 통해 서비스 제공을 위해 필요한 최소한의 개인정보를 수집하고 있습니다.\n" +
                "3. 개인정보 제공\n" +
                "\n" +
                "학교는 이용자의 별도 동의가 있는 경우나 법령에 규정된 경우를 제외하고는 이용자의 개인정보를 제3자에게 제공하지 않습니다.제3자 서비스와의 연결을 위해 아래와 같이 개인정보를 제공하고 있습니다.\n" +
                "\n" +
                "학교는 이용자의 사전 동의 없이 개인정보를 제3자에게 제공하지 않습니다. 다만, 이용자가 외부 제휴사 등의 서비스를 이용하기 위하여 필요한 범위 내에서 이용자의 동의를 얻은 후에 개인정보를 제3자에게 제공하고 있습니다.\n" +
                "\n" +
                "개인정보 제3자 제공 현황 자세히 보기서비스 제공을 위해 아래와 같은 업무를 위탁하고 있습니다.\n" +
                "\n" +
                "서비스 제공에 있어 필요한 업무 중 일부를 외부 업체로 하여금 수행하도록 개인정보를 위탁하고 있습니다. 그리고 위탁 받은 업체가 관계 법령을 준수하도록 관리·감독하고 있습니다.\n" +
                "\n" +
                "개인정보 처리위탁 중 국외에서 처리하는 위탁업무는 아래와 같습니다.\n" +
                "\n" +
                "4. 개인정보 파기\n" +
                "\n" +
                "개인정보는 수집 및 이용목적이 달성되면 지체없이 파기하며, 절차 및 방법은 아래와 같습니다.\n" +
                "\n" +
                "전자적 파일 형태인 경우 복구 및 재생되지 않도록 안전하게 삭제하고, 그 밖에 기록물, 인쇄물, 서면 등의 경우 분쇄하거나 소각하여 파기합니다.\n" +
                "\n" +
                "다만, 내부 방침에 따라 일정 기간 보관 후 파기하는 정보는 아래와 같습니다.\u000B\n" +
                "\n" +
                "5. 기타\n" +
                "\n" +
                "학교는 여러분의 권리를 보호합니다.\n" +
                "\n" +
                "개인정보의 오류에 대한 정정을 요청하신 경우 정정을 완료하기 전까지 해당 개인정보를 이용 또는 제공하지 않습니다.\n" +
                "학교는 유럽연합 일반 개인정보보호법(General Data Protection Regulation) 및 각 회원국의 법률을 준수합니다.\n" +
                "\n" +
                "[개인정보 처리의 목적 및 처리근거]\n" +
                "\n" +
                "학교는 수집한 개인정보를 \"3. 개인정보의 이용\"에 기재된 목적으로만 이용하며, 사전에 이용자에게 해당 사실을 알리고 동의를 구하고 있습니다.\u000B\n" +
                "그리고 GDPR 등 적용되는 법률에 따라, 카카오는 아래 하나에 해당하는 경우에 이용자의 개인정보를 처리할 수 있습니다.\n" +
                "\n" +
                "정보주체의 동의\n" +
                "\n" +
                "정보주체와의 계약의 체결 및 이행을 위한 경우\n" +
                "\n" +
                "법적 의무사항 준수를 위한 경우\n" +
                "\n" +
                "정보주체의 중대한 이익을 위해 처리가 필요한 경우\n" +
                "\n" +
                "회사의 적법한 이익 추구를 위한 경우(정보주체의 이익과 권리 또는 자유가 그 이익보다 중요한 경우는 제외)\n" +
                "\n" +
                "[유럽연합 내 이용자의 권리 보장]\n" +
                "\n" +
                "학교는 \"여러분의 권리를 보호합니다\"에서 알린 바와 같이, 이용자의 개인정보를 소중하게 보호합니다. GDPR 등 적용되는 법률에 따라, 이용자는 자신의 개인정보를 다른 관리자에게 이전해 달라고 요청할 수 있고, 자신의 정보 처리 거부를 요청 할 수 있습니다. 그리고 이용자는 개인정보보호 권한 당국에 불만을 제기할 권리가 있습니다.\n" +
                "\n" +
                "개인정보의 오류에 대한 정정을 요청하신 경우 정정을 완료하기 전까지 해당 개인정보를 이용 또는 제공하지 않습니다.\n"
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