package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBuscarMediciones(View view){

        TextView mediciones = (TextView) findViewById(R.id.mediciones_paciente);
        Spinner enfermedad = (Spinner) findViewById(R.id.enfermedad);

        String tipoDeEnfermedad = String.valueOf(enfermedad.getSelectedItem());
        mediciones.setText(Diagnostico.getMediciones(tipoDeEnfermedad));
    }
}