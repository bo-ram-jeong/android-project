package com.example.peoplediet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private ArrayList<ListItem> items;
    Context context;
    public ListAdapter(Context c, ArrayList<ListItem> items){
        context=c;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView tv_name=convertView.findViewById(R.id.tv_name);
        TextView tv_detail=convertView.findViewById(R.id.tv_detail);
        final ListItem listItem=items.get(position);
        tv_name.setText(listItem.getText1());
        tv_detail.setText(listItem.getText2());

        LinearLayout ll_listView=(LinearLayout)convertView.findViewById(R.id.ll_listView);
        ll_listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=listItem.getText1()+"의 칼로리는 "+listItem.getText2()+" 입니다.";
                Toast.makeText(v.getContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
