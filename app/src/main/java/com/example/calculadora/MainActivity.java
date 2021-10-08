package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num_1;
    private EditText num_2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        resultado = findViewById(R.id.resultado);
    }

    public void suma(View view){

        if(!num_1.getText().toString().equals("") && !num_2.getText().toString().equals("")){
            int a = Integer.parseInt(num_1.getText().toString());
            int b = Integer.parseInt(num_2.getText().toString());
            int res = a + b;
            resultado.setText(String.valueOf(res));
        }else{
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
            Log.d("ERROR_SUMA", "Algún campo está vacío");
        }

    }

    public void resta(View view){

        if(!num_1.getText().toString().equals("") && !num_2.getText().toString().equals("")) {
            int a = Integer.parseInt(num_1.getText().toString());
            int b = Integer.parseInt(num_2.getText().toString());
            int res = a - b;
            resultado.setText(String.valueOf(res));
        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
            Log.d("ERROR_RESTA", "Algún campo está vacío");
        }

    }
    public void multiplicacion(View view){
        if(!num_1.getText().toString().equals("") && !num_2.getText().toString().equals("")) {
            int a = Integer.parseInt(num_1.getText().toString());
            int b = Integer.parseInt(num_2.getText().toString());
            int res = a * b;
            resultado.setText(String.valueOf(res));
        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
            Log.d("ERROR_MULTIPLICA", "Algún campo está vacío");
        }
    }
    public void division(View view){
        if(!num_1.getText().toString().equals("") && !num_2.getText().toString().equals("")) {

            float a = Integer.parseInt(num_1.getText().toString());
            float b = Integer.parseInt(num_2.getText().toString());

            if(b > 0){
                float res = a / b;
                resultado.setText(String.valueOf(res));
            }else {
                Toast.makeText(this, "No es posible dividir por 0", Toast.LENGTH_SHORT).show();
                Log.d("ERROR_DIVIDE", "división por cero");
            }

        }else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
            Log.d("ERROR_DIVIDE", "Algún campo está vacío");
        }
    }

    private void muestraToast(String mens){
        Toast.makeText(this, mens, Toast.LENGTH_LONG).show();
    }
}