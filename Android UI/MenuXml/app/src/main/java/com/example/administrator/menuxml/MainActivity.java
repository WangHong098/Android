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
