package com.example.peoplediet;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class Button2Activity extends TabActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button2_contents);

        tabHost = getTabHost();
        TabHost.TabSpec tabSpecFood = tabHost.newTabSpec("FOOD").setIndicator("음식");
        tabSpecFood.setContent(R.id.tabfood);
        ListView list1 = findViewById(R.id.list1);

        ArrayList<ListItem> items1 = new ArrayList<>();
        items1.add(new ListItem("만둣국", "480kcal(1그릇)"));
        items1.add(new ListItem("불고기", "471kcal(300g)"));
        items1.add(new ListItem("배", "160kcal(1개)"));
        items1.add(new ListItem("사과", "140kcal(1개)"));
        items1.add(new ListItem("단감", "75kcal(1개)"));
        items1.add(new ListItem("밤", "16kcal(1개)"));
        items1.add(new ListItem("포도", "182kcal(1송이)"));
        items1.add(new ListItem("쇠고기무국", "266kcal(1그릇)"));
        items1.add(new ListItem("잡채", "191kcal(1접시)"));
        items1.add(new ListItem("조기구이", "305kcal(1마리)"));
        items1.add(new ListItem("갈비찜", "531kcal(300g)"));
        ListAdapter listAdapter = new ListAdapter(this, items1);

        list1.setAdapter(listAdapter);
        tabHost.addTab(tabSpecFood);

        TabHost.TabSpec tabSpecExercise = tabHost.newTabSpec("EXERCISE").setIndicator("운동");
        tabSpecExercise.setContent(R.id.tabexercise);
        ListView list2 = findViewById(R.id.list2);

        ArrayList<ListItem> items2 = new ArrayList<>();
        items2.add(new ListItem("산책", "63kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("수영", "285kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("볼링", "95kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("요가", "79kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("스트레칭", "125kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("자전거", "250cal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("줄넘기", "310kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("조깅", "220kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("스키", "190kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("계단\n오르기", "220kcal(운동30분,\n체중60kg 기준)"));
        items2.add(new ListItem("계단\n내려가기", "95kcal(운동30분,\n체중60kg 기준)"));
        listAdapter = new ListAdapter(this, items2);

        list2.setAdapter(listAdapter);
        tabHost.addTab(tabSpecExercise);

        tabHost.setCurrentTab(0);

    }
}
