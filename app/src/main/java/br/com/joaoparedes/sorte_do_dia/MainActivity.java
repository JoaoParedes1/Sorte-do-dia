package br.com.joaoparedes.sorte_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button btn_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewTitle = findViewById(R.id.text_title);
        btn_action = findViewById(R.id.btn_action);

        ArrayList<String> list = new ArrayList<>();
        list.add("Encontrara dinheiro");
        list.add("Comida de graça");
        list.add("Pizza de graça");
        list.add("Dia tranquilo pela frente");
        list.add("Comida vai ser boa hoje");
        list.add("aplicativo nota 10");

        btn_action.setOnClickListener(v -> {
            Random random = new Random();
            textViewTitle.setText(list.get(random.nextInt(list.size())));
        });








    }
}