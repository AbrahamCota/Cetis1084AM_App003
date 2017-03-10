package mx.edu.cetis108.cetis1084am_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText r1, r2;
    TextView valor;
    Button btn;
    Integer resultado;
    Integer uno,dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (EditText) findViewById(R.id.edit1);
        r2 = (EditText) findViewById(R.id.edit2);
        valor = (TextView) findViewById(R.id.TvResultado);
        btn = (Button) findViewById(R.id.calcular);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
         uno = Integer.parseInt(r1.getText().toString());
         dos = Integer.parseInt(r2.getText().toString());
        if (uno > dos) {

            resultado= uno - dos;
            valor.setText("resultado =" + resultado);
        }
        else if(dos>uno)
        {
            resultado= uno - dos;
            valor.setText("resultado =" + resultado);
        }
    }
}