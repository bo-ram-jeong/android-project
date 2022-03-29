package com.example.peoplediet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Button3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button3_contents);

        Button btn_irregular = findViewById(R.id.btn_irregular);
        Button btn_stress = findViewById(R.id.btn_stress);
        Button btn_sleep = findViewById(R.id.btn_sleep);
        Button btn_nutrition = findViewById(R.id.btn_nutrition);
        Button btn_lazy = findViewById(R.id.btn_lazy);

        btn_irregular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Button3Activity.this, R.style.MyDialogTheme);
                dialog.setTitle("식사 불규칙형");
                dialog.setIcon(R.drawable.irregular);
                dialog.setMessage(" 식사가 불규칙적인 경우에는 한 끼 식사를 간단히라도 대체할 수 있는 선식, 단백질 셰이크, 주스 등이 도움이 될 수 있다." +
                        " \n\n단, 과일로만 된 주스나 곡물로만 된 선식보다는 야채와 과일 계란, 닭가슴살 등 여러 영양소가 모두 섞인 한 잔의 식사가 좋다." +
                        " \n\n영양소를 제대로 갖춘 건강한 유동식이라도 식사 때에 맞춰 규칙적으로 먹어준다면! 뒤에 폭식을 할 가능성을 줄일 수 있다.");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Button3Activity.this, R.style.MyDialogTheme);
                dialog.setTitle("스트레스 과다형");
                dialog.setIcon(R.drawable.stress);
                dialog.setMessage(" 스트레스를 음식으로 푸는 경우, 특히 자극적이고 단 음식, 또는 술을 찾게 된다. 적당한 운동과 취미생활 등 스트레스를 건강하게 관리하려는 " +
                        "노력이 필요하다. \n\n스트레스를 받기만 해도 몸에 지방이 쌓이게 되기 때문에 스트레스를 잘 관리하는 것은 매우 중요하다." +
                        " \n\n간식을 물이나 몸에 좋은 차로 대체하여 여러 다이어트 차 혹은 디톡스 음료 등이 도움이 될 수 있다.");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Button3Activity.this, R.style.MyDialogTheme);
                dialog.setTitle("수면 부족형");
                dialog.setIcon(R.drawable.sleep);
                dialog.setMessage(" 수면이 부족하면 코르티솔 수치가 높아지고 그로 인해 근육 단백을 분해해서 아미노산을 포도당으로 변환하기 때문에" +
                        " 근육이 빠지기도 한다. \n\n이러한 경우에는 다이어트 제품을 구입하는 것이 아닌 수면의 질을 높이기 위해 노력해야 한다." +
                        " 가능한 밤 12시부터 오전 4시 정도까지는 수면상태에 있기 위해 노력하거나 그렇게 할 수 없다면 7시간 30분 정도는 충분히 숙면을 취하도록 노력해야 한다. " +
                        "\n\n필요하다면 숙면을 위한 제품, 예를 들어 베개, 침구, 조명, 아로마 등을 활용하는 것도 방법이다!");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Button3Activity.this, R.style.MyDialogTheme);
                dialog.setTitle("영양 부족형");
                dialog.setIcon(R.drawable.nutrition);
                dialog.setMessage(" 영양이 부족한 경우에도 반대로 체중이 늘기 쉽다. 영양제만 복용해도 체중이 감량된다는 연구 결과가 있을 정도로 균형 잡힌 영양소 섭취" +
                        "가 중요하다. 영양소가 골고루 들어간 건강한 식단으로 식사의 균형을 맞추도록 해야 한다. \n\n필요한 경우, 비타민제나 유산균과 같은 영양제를 섭취하는 것도 " +
                        "도움이 되지만 영양제만으로 채워지지 않는 영양소도 있기 때문에 식사의 내용물에 신경을 쓰는 것이 필요하다." +
                        " \n\n예를 들어 생선이나 아보카도, 견과류 등으로 지방산을 섭취해주고 소고기, 버서, 달걀 등으로 크롬이나 아연 등의 미량 영양소를" +
                        " 섭취해주는 것이 좋다!");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
        btn_lazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(Button3Activity.this, R.style.MyDialogTheme);
                dialog.setTitle("과식 & 게으른형");
                dialog.setIcon(R.drawable.lazy);
                dialog.setMessage(" 식사 양을 조절하거나 밥에 곤약, 현미, 콩 등을 섞어서 먹고 탄수화물보다는 단백질과 야채 위주로 섭취하는 것이 좋다." +
                        " 그리고 운동 양을 조금 늘려준다면 체지방량을 감량할 수 있다. \n\n가장 단순하고 쉬운 방법이자 달리 지름길이 없기 떄문에" +
                        " 이들에게 필요한 것은 오직 적절한 동기부여 그리고 인내력이다. \n\n처음은 힘들지만 천천히, 꾸준히 노력하면 살을 빼는 즐거움 또한 느낄 수 있을 것이다!");
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });
    }
}
