package com.example.peoplediet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Button1Activity extends AppCompatActivity {
    Button btn_result;
    String rb_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button1_contents);

        btn_result = findViewById(R.id.btn_result);
        final RadioGroup rg = findViewById(R.id.radioGroup1);
        final RadioButton rb1 = findViewById(R.id.radioButton1);
        final RadioButton rb2 = findViewById(R.id.radioButton2);
        final EditText ed1 = findViewById(R.id.ed1);
        final EditText ed2 = findViewById(R.id.ed2);
        final EditText ed3 = findViewById(R.id.ed3);
        final TextView tv_bmi = findViewById(R.id.tv_bmi);
        final TextView tv_bmi_result = findViewById(R.id.tv_bmi_result);
        final ImageView iv_bmi = findViewById(R.id.iv_bmi);
        final TextView tv_rmr = findViewById(R.id.tv_rmr);
        final TextView tv_rmr_result = findViewById(R.id.tv_rmr_result);
        final ImageView iv_rmr = findViewById(R.id.iv_rmr);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    rb_result = rb1.getText().toString();
                } else if (checkedId == R.id.radioButton2) {
                    rb_result = rb2.getText().toString();
                }
            }
        });
        btn_result.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.toString().trim().getBytes().length > 0 && ed2.toString().trim().getBytes().length > 0 && ed3.toString().trim().getBytes().length > 0 &&
                        rb_result != null) {

                    double ed1_double1 = Double.parseDouble(ed1.getText().toString());
                    double ed1_double2 = Double.parseDouble(ed1.getText().toString()) * 0.01;
                    double ed2_double = Double.parseDouble(ed2.getText().toString());
                    double ed3_double = Double.parseDouble(ed3.getText().toString());
                    double rmr=0;
                    if (rb_result.equals("남")) {
                        rmr = 66.5 + (13.7 * ed2_double) + (5.0 * ed1_double1) - (6.8 * ed3_double);
                    } else if (rb_result.equals("여")) {
                        rmr = 665.1 + (9.56 * ed2_double) + (1.85 * ed1_double1) - (4.68 * ed3_double);
                    }
                    String rmr_result=String.format("%.1f", rmr);

                    double bmi = ed2_double / (ed1_double2 * ed1_double2);
                    String bmi_result = String.format("%.1f", bmi);

                    if (bmi > 30.0) {
                        tv_bmi_result.setText("나의 BMI 지수는 " + bmi_result + "(으)로 현재 [고도비만] 입니다.");
                    } else if (bmi > 25.0) {
                        tv_bmi_result.setText("나의 BMI 지수는 " + bmi_result + "(으)로 현재 [비만] 입니다.");
                    } else if (bmi > 23.0) {
                        tv_bmi_result.setText("나의 BMI 지수는 " + bmi_result + "(으)로 현재 [과체중] 입니다.");
                    } else if (bmi > 18.5) {
                        tv_bmi_result.setText("나의 BMI 지수는 " + bmi_result + "(으)로 현재 [정상] 입니다.");
                    } else if (bmi <= 18.5) {
                        tv_bmi_result.setText("나의 BMI 지수는 " + bmi_result + "(으)로 현재 [저체중] 입니다.");
                    } else {
                        Toast.makeText(getApplicationContext(), "올바른 값을 입력해주세요! ", Toast.LENGTH_SHORT).show();
                        tv_bmi_result.setText("올바른 값을 입력해주세요!");
                    }

                    String msg="BMI: "+bmi_result+"         RMR: "+rmr_result+"kcal";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                    tv_rmr_result.setText("나의 기초 대사량은 "+rmr_result+" kcal 입니다.");
                    tv_bmi.setVisibility(View.VISIBLE);
                    tv_bmi_result.setVisibility(View.VISIBLE);
                    iv_bmi.setVisibility(View.VISIBLE);
                    tv_rmr.setVisibility(View.VISIBLE);
                    tv_rmr_result.setVisibility(View.VISIBLE);
                    iv_rmr.setVisibility(View.VISIBLE);
                } else
                    Toast.makeText(getApplicationContext(), "올바른 값을 입력해주세요! ", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
