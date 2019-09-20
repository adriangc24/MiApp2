package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        tv1 = (TextView)findViewById(R.id.textView1);
    }

    public void calcular (View view){
        int valor1 = Integer.parseInt(String.valueOf(et1.getText()));
        int valor2 = Integer.parseInt(String.valueOf(et2.getText()));
        int valor3 = Integer.parseInt(String.valueOf(et3.getText()));

        int result = (valor1+valor2+valor3)/3;

        if(result<5){
            tv1.setText("Alumno suspendido: "+result);
        }
        else if(result>=5){
            tv1.setText("Alumno aprobado: "+result);
        }

        else {
            System.out.println("ERROR");
        }

    }
}
