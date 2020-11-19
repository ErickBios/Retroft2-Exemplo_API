package br.com.example.meuprimeiroexemplo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.example.meuprimeiroexemplo.R;
import br.com.example.meuprimeiroexemplo.debug.DebugActivity;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {
        //
        int opcao = view.getId();
        Intent intent;

        switch (opcao) {

            case R.id.btnIniciar:
                intent = new Intent(getApplicationContext(), PeopleActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Opção Invalida.", Toast.LENGTH_LONG).show();
                break;
        }
    }
}