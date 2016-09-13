package br.com.projeto.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageButton btn_perfil = (ImageButton)findViewById(R.id.btn_perfil);
        final ImageButton btn_alarme = (ImageButton)findViewById(R.id.btn_alarme);
        final ImageButton btn_remedio = (ImageButton)findViewById(R.id.btn_remedio);
        final ImageButton btn_relatorio = (ImageButton)findViewById(R.id.btn_relatorio);

        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                    startActivity(intent);
            }
        });
        btn_alarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CadastroAlarme.class);
                startActivity(intent);
            }
        });
        btn_remedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CadastroRemedio.class);
                startActivity(intent);
            }
        });
        btn_relatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RelatorioActivity.class);
                startActivity(intent);
            }
        });
    }
}
