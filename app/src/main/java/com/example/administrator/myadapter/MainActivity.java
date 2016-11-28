package com.example.administrator.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Bean> mList;
    private Madapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initview();
    }

    private void initDatas() {
        Bean bean;
        mList = new ArrayList<>();
        bean = new Bean("白菜豆腐1", "家常小炒，白吃不厌", "2016.11.11", "10086");
        mList.add(bean);
        bean = new Bean("白菜豆腐2", "家常小炒，白吃不厌", "2016.11.11", "10086");
        mList.add(bean);
        bean = new Bean("白菜豆腐3", "家常小炒，白吃不厌", "2016.11.11", "10086");
        mList.add(bean);
        bean = new Bean("白菜豆腐4", "家常小炒，白吃不厌", "2016.11.11", "10086");
        mList.add(bean);
        madapter = new Madapter(this,mList);
    }

    private void initview() {
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(madapter);
    }
}
