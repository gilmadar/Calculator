package com.example.yam.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Credit extends AppCompatActivity {
    String st;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        tv = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.btn);
        Intent credit = getIntent();
        st = credit.getStringExtra("scum");
        tv.setText("התוצאה האחרונה:" + st);
    }

    public void go(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);

    }
}
