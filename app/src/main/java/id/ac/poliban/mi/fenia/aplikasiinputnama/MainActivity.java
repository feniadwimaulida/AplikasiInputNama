package id.ac.poliban.mi.fenia.aplikasiinputnama;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    TextView tvNama;
    TextView tvSalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tvNama);
        etNama = findViewById(R.id.etNama);
        Button btTampil = findViewById(R.id.btTampil);

        btTampil.setOnClickListener(v ->
                Toast.makeText(this, "Hallo", Toast.LENGTH_SHORT).show());



    }

    @SuppressLint("SetTextI18n")
    public void TampilNama(View view) {
        tvNama.setText("Nama Anda: " +tvNama.getText() );
        tvSalam.setText(String.format("Hi %s", etNama.getText().toString()));


    }
}
