package br.com.projeto.projeto;

import android.content.Intent;
import android.view.View;

/**
 * Created by SirKarsh on 13/09/2016.
 */
public class Teste {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

        btn_relatorio.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RelatorioActivity.class);
                startActivity(intent);

            }
}
