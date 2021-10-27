package com.example.firstactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReset;
    Button btnTest;
    Button btnPlay;
    TextView lblMessaggio;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = (Button)findViewById(R.id.reset);
        btnTest=(Button)findViewById(R.id.test);
        btnPlay=(Button)findViewById(R.id.play);
        lblMessaggio=(TextView)findViewById(R.id.lblMessaggio);
        name=(EditText)findViewById(R.id.name);

    }

    public void reset(View v)
    {
        lblMessaggio.setText("");
    }

    public void test(View v){
        Toast.makeText(getApplicationContext(), lblMessaggio.getText(), Toast.LENGTH_SHORT ).show();
    }

    public void play(View v){
        Intent i= new Intent(getApplicationContext(), secActivity.class);
        i.putExtra("messaggio", lblMessaggio.getText().toString());
        startActivityForResult(i,TEXT_REQUEST);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String s= data.getStringExtra(secActivity.reset);
                testo.setVisibility(View.VISIBLE);
                testo.setText(s);
            }
        }
    }

    public void secondaAc (View v){
        Intent i= new Intent(getApplicationContext(),secActivity.class);
        startActivity(i);
    }



}
