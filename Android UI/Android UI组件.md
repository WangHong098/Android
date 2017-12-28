# Android UI组件实验
## 1. Android ListView的用法
利用SimpleAdapter实现如下界面效果
- （1）注意列表项的布局
- （2）图片使用QQ群附件资源
- （3）使用Toast显示选中的列表项信息

### I. 工程名
ListView
### II. 主要源代码
#### item.xml
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <ImageView
        android:id="@+id/pic"
        android:layout_width="55dp"
        android:layout_height="55dp"
        android:layout_marginTop="5dp"
        android:layout_alignParentRight="true"
        android:layout_marginRight="10dp" />
    <TextView
        android:id="@+id/name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:textSize="20dp"
        android:textColor="#000" />
    <TextView
        android:layout_width="match_parent"
        android:layout_height="2dp"
        android:layout_marginTop="65dp"
        android:background="@color/colorAccent"/>
</RelativeLayout>
```
#### activity_main.xml

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ListView
        android:id="@+id/listView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:listSelector="@color/colorPrimaryDark">
    </ListView>
</LinearLayout>
```
#### MainActivity.java

```
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

```

### III. 实验结果
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/7CE57AAF984349799A58DEE44F8882D9/146)

## 2. 创建自定义布局的AlertDialog
- 请创建一个如图所示的布局，
- 调用 AlertDialog.Builder 对象上的 setView() 将布局添加到 AlertDialog。

### I. 工程名
AlertDialog
### II. 主要源代码
#### dialog.xml

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/dialog"
    android:layout_width="300dp"
    android:layout_height="250dp"
    android:layout_centerVertical="true"
    android:layout_centerHorizontal="true"
    android:orientation="vertical"
    android:background="@drawable/bord">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/app_name"
        android:textSize="25sp"
        android:textAlignment="center"
        android:padding="13dp"
        android:background="#FF9224"
        android:textColor="#FBFFFD"
        android:textStyle="bold" />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="52dp"
        android:text="@string/username"
        android:textColor="@color/colorGray"
        android:layout_marginTop="10dp"
        android:layout_marginLeft="7dp"
        android:layout_marginRight="7dp"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="52dp"
        android:text="@string/password"
        android:textColor="@color/colorGray"
        android:layout_marginTop="4dp"
        android:layout_marginLeft="7dp"
        android:layout_marginRight="7dp"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:orientation="horizontal"
        android:layout_marginTop="15dp">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/cancel"
            android:gravity="center"
            android:textColor="#000"
            android:layout_marginTop="7dp"
            android:background="@drawable/bord"/>
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="@string/sign"
            android:gravity="center"
            android:textColor="#000"
            android:layout_marginTop="7dp"
            android:background="@drawable/bord"/>
    </LinearLayout>

</LinearLayout>

```
#### activity_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/dialog"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:background="@drawable/bord">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="自定义对话框"
        android:textSize="25sp"
        android:textAlignment="center"
        android:padding="13dp"
        android:background="@drawable/bord" />
</LinearLayout>
```

#### MainActivity.java

```
package com.example.administrator.alertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        LinearLayout loginform=(LinearLayout) getLayoutInflater().inflate(R.layout.dialog, null);

        builder.setView(loginform);
        AlertDialog viewdialog=builder.create();
        viewdialog.show();
    }
}

```

### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/E5271C793BCF418D851F3F3DFE063768/168)

## 3. 使用XML定义菜单
- 字体大小（有小，中，大这3个选项；分别对应10号字，16号字和20号字）；点击之后设置测试文本的字体
- 普通菜单项，点击之后弹出Toast提示
- 字体颜色（有红色和黑色这2个选项），点击之后设置测试文本的字体


### I. 工程名
MenuXml
### II. 主要源代码
#### menu_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="@string/menu_Size">
        <menu>
            <item
                android:id="@+id/menu_size_small"
                android:title="@string/Size_ten"/>
            <item
                android:id="@+id/menu_size_middle"
                android:title="@string/Size_sixteen"/>
            <item
                android:id="@+id/menu_size_big"
                android:title="@string/Size_twenty"/>
        </menu>
    </item>
    <item
        android:id="@+id/menu_normal"
        android:title="@string/menu_Normal">
    </item>
    <item android:title="@string/menu_Color">
        <menu>
            <item
                android:id="@+id/menu_color_red"
                android:title="@string/Color_red" />
            <item
                android:id="@+id/menu_color_black"
                android:title="@string/Color_black"/>
        </menu>
    </item>
</menu>
```
#### MainActivity.java

```
package com.example.administrator.menuxml;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView=(TextView)findViewById(R.id.test);
        switch (item.getItemId()) {
            case R.id.menu_size_small:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.size_ten));
                break;
            case R.id.menu_size_middle:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.size_sixteen));
                break;
            case R.id.menu_size_big:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.size_twenty));
                break;
            case R.id.menu_normal:
                textView.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary));
                textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.size_sixteen));
                Toast.makeText(this,"普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_color_red:
                textView.setTextColor(ContextCompat.getColor(this,R.color.colorRed));
                break;
            case R.id.menu_color_black:
                textView.setTextColor(ContextCompat.getColor(this,R.color.colorBlack));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

```

### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/666989A28594412884B7D603E6D0717B/206)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/E547D9A41F624891AE4BCC5749B84EB7/209)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/E0BB3221343849D49ABB5CF7FFE02403/211)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/3D7545D3682E4E68A2448D138CE2906B/213)