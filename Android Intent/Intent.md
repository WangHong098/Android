# Intent实验
## I. 实验内容
### 本实验通过自定义WebView加载URL来验证隐式Intent的使用。
实验包含两个应用：
- 第一个应用：获取URL地址并启动隐式Intent的调用。
- 第二个应用：自定义WebView来加载URL。

### 第一个应用
新建一个工程用来获取URL地址并启动Intent。
输入URL网址，点击按钮，将发起浏览网页的行为。
### I. 工程名
IntentURL
### II. 主要源代码
#### activity_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="330dp"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_gravity="center">
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/url"
        android:text="@string/in"
        android:textSize="18sp"
        android:layout_marginTop="50dp"
        android:textColor="#BEBEBE"/>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/but"
        android:text="@string/search"
        android:layout_gravity="center"
        android:layout_marginTop="10dp"/>
</LinearLayout>
```
#### MainActivity.java

```
package com.example.administrator.intenturl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=(EditText)findViewById(R.id.url);
                String url=editText.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}

```

### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/53A2123AB71B42B19051AE342ED337F0/225)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/819D27C9347340B6BF5DE66348E12656/221)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/67D7C09314E045658005405CC77ED207/223)

### 第二个应用
新建一个工程使用WebView来加载URL。跳转之后，出现选择项，选择自定义的MyBrowser进行浏览。
### I. 工程名
MyBrowser
### II. 主要源代码
#### AndroidManifest.xml

```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.administrator.mybrowser" >

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme" >
        <activity android:name=".MainActivity" >
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <data android:scheme="http" />
            </intent-filter>
        </activity>
    </application>
    <uses-permission android:name="android.permission.INTERNET"></uses-permission>
</manifest>
```
#### activity_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.administrator.mybrowser.MainActivity">

    <WebView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/webView">
    </WebView>

</android.support.constraint.ConstraintLayout>
```
#### MainActivity.java

```
package com.example.administrator.mybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.Intent;
import android.net.Uri;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Uri data = intent.getData();
        URL url = null;
        try {
            url = new URL(data.getScheme(),data.getHost(),data.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebView webView = (WebView) findViewById(R.id.webView);
        //WebView加载web资源
        webView.loadUrl(url.toString());
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }
}

```

### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/3BCBA9C5E0B5439ABC465F1EAFFACE00/272)
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/A42CFA8D0F39410A93AA3B0C8F2F8B1E/275)
