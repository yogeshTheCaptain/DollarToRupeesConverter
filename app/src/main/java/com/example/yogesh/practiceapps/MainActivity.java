package com.example.yogesh.practiceapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText editText =(EditText)findViewById(R.id.editText);
        Double dollarAmount= Double.parseDouble(editText.getText().toString());

        Double ruppeeAmount = dollarAmount*60;
        Toast.makeText(MainActivity.this,"Rs."+ String.format("%.2f",ruppeeAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount",editText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
