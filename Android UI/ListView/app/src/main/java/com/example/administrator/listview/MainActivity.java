package com.example.administrator.listview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.*;


public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String[] names={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private  int[] images={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    private List<Map<String,Object>> listMap= new ArrayList<Map<String,Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView); /*定义一个动态数组*/
        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("name",names[i]);
            item.put("pic",images[i]);
            listMap.add(item);
        }

        SimpleAdapter sa = new SimpleAdapter(this,listMap,R.layout.item,new String[]{"name","pic"},new int []{R.id.name,R.id.pic});

        lv.setAdapter(sa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int i,long l) {
                TextView text=(TextView)v.findViewById(R.id.name);
                Toast.makeText(getApplicationContext(),text.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
