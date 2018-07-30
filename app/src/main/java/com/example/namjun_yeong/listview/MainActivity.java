package com.example.namjun_yeong.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> m_arr;
    private List_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
    }
    private void setList(){
        m_arr=new ArrayList<Item>();
        ListView lv=(ListView)findViewById(R.id.listview1);
        m_arr.add(new Item("@drawable/ic_launcher_background","여기 존맛탱이에요!!","여기 정말 너무너무너무 맛있어요 사장늼!!ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ"));
        m_arr.add(new Item("@drawable/ic_launcher_background","여기 추천!!","hit다 hit~~는 미리보기 방지입니다~~~"));
        m_arr.add(new Item("@drawable/ic_launcher_background","휘리릭7","히또다 히또!"));

        adapter=new List_Adapter(MainActivity.this,m_arr);
        lv.setAdapter(adapter);
    }
    public void listUpdate(){
        adapter.notifyDataSetChanged();
    }
}
