package br.com.usp.willianerodrigues.course.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.usp.willianerodrigues.course.R;

public class ExerciceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice);

        View view = findViewById(R.id.close_exercice);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciceActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        View view1 = findViewById(R.id.iten_1);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ExerciceActivity.this)
                        .setTitle("Resposta Incorreta")
                        .setView(R.layout.fragment_alert)
                        .setPositiveButton("CONTINUAR", null)
                        .create().show();
            }
        });

        View view2 = findViewById(R.id.iten_2);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ExerciceActivity.this)
                        .setTitle("Resposta Incorreta")
                        .setView(R.layout.fragment_alert)
                        .setPositiveButton("CONTINUAR", null)
                        .create().show();
            }
        });

        View view3 = findViewById(R.id.iten_3);
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ExerciceActivity.this)
                        .setTitle("Resposta Ccorreta")
                        .setView(R.layout.fragment_alert)
                        .setPositiveButton("CONTINUAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(ExerciceActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .create().show();
            }
        });

        View view4 = findViewById(R.id.iten_4);
        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(ExerciceActivity.this)
                        .setTitle("Resposta Incorreta")
                        .setView(R.layout.fragment_alert)
                        .setPositiveButton("CONTINUAR", null)
                        .create().show();
            }
        });

        View view5 = findViewById(R.id.nao_sei);
        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Em breve esta função estará disponível", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
