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
