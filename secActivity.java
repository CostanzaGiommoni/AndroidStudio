package com.example.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class secActivity extends AppCompatActivity {

    EditText name1;
    public static final String reset="com.example.android.twoactivities.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        Intent i=getIntent();
        String mesric=i.getStringExtra("messaggio");
        Toast t= Toast.makeText(getApplicationContext(),mesric,Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        name1=(EditText)findViewById(R.id.name1);
        Intent i = getIntent();
        Toast.makeText(getApplicationContext(), i.getStringExtra("messaggio"), Toast.LENGTH_SHORT ).show();
    }
    public void reply(View v){
        Intent r=new Intent();
        r.putExtra(reset, name1.getText().toString());
        setResult(RESULT_OK, r );
        finish();
    }
}