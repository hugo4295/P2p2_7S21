package mx.edu.isc.tesoem.hugo4295.p2p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity{

    Spinner splista;
    List<String> MiLista = new ArrayList<>(Arrays.asList("Durango","Chihuahua","Jalisco","Nayarit","Zacatecas","Puebla"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(PrincipalActivity.this, "Se selecciono: " + valor, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MiLista);
        splista.setAdapter(adaptador);

    }
}