package mx.edu.ittepic.aldairarriola.tpdm_u1_practica1_aldairarriola;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button b1;
    RadioGroup radio;
    RadioButton r;
    RadioButton a;
    RadioButton v;
    Switch sw;
    Spinner sp;
    EditText var1;
    EditText var2;
    TextView opera;
    TextView res;
    Button doit;
    RelativeLayout fond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.texto);
        b1 = findViewById(R.id.boton);
        radio = findViewById(R.id.colores);
        r = findViewById(R.id.rojo);
        a = findViewById(R.id.azul);
        v = findViewById(R.id.verde);
        sw = findViewById(R.id.ocultar);
        sp = findViewById(R.id.operacion);
        var1 = findViewById(R.id.a);
        var2 = findViewById(R.id.b);
        opera = findViewById(R.id.operador);
        res = findViewById(R.id.resultado);
        doit = findViewById(R.id.realizar);
        fond = findViewById(R.id.fondo);


    }

    public void mensajeHola (View v){
        String mensaje = "Hola "+name.getText().toString()+" bienvenido a mi practica 1";
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }

    public void red (View x){
        fond.setBackgroundColor(Color.RED);
    }

    public void green (View y){
        fond.setBackgroundColor(Color.GREEN);
    }

    public void blue (View z){
        fond.setBackgroundColor(Color.BLUE);
    }

    public void hide (View w){
        if(sw.isChecked()){
            radio.setVisibility(View.GONE);
        }
        if(sw.isChecked()==false){
            radio.setVisibility(View.VISIBLE);
        }
    }

    public void calcular (View e){
        int a = Integer.parseInt(var1.getText().toString());
        int b = Integer.parseInt(var2.getText().toString());
        int c;
        String x = sp.getSelectedItem().toString();

        if(x.equals("Suma")){
            opera.setText("+");
            c = a + b;
            res.setText(Integer.toString(c));
        }

        if(x.equals("Resta")){
            opera.setText("-");
            c = a - b;
            res.setText(Integer.toString(c));
        }

        if(x.equals("Multiplicacion")){
            opera.setText("X");
            c = a * b;
            res.setText(Integer.toString(c));
        }

        if(x.equals("Division")){
            opera.setText("/");
            c = a / b;
            res.setText(Integer.toString(c));
        }

    }
}
