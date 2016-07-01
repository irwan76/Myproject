package com.dilobpn.user.hitungluassegitiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText alas, tinggi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alas = (EditText) findViewById(R.id.txtAlas);
        tinggi = (EditText) findViewById(R.id.txtTinggi);
        hitung = (Button) findViewById(R.id.btnHitung);
        hasil = (TextView) findViewById(R.id.txtHasil);

        hitung.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //pengkondisian apabila editext alas dan tinggi kosong
                if (alas.length() == 0 && tinggi.length() ==0 ) {
                    Toast.makeText(getApplication(),"Alas dan Tinggi Tidak Boleh Kosong ",Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext alas kosong
                else if (alas.length() == 0){
                    Toast.makeText(getApplication(),"Alas Tidak Boleh Kosong ",Toast.LENGTH_SHORT).show();
                }
                //pengkondisian apabila editext tinggi kosong
                else if (tinggi.length() ==0 ){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong ",Toast.LENGTH_SHORT).show();
                }



                else {
                    //ambil nilai dari txtAlas dan txtTinggi
                    String isiAlas = alas.getText().toString();
                    String isiTinggi = tinggi.getText().toString();

                    //parsing isiAlas dan isiTinggi menjadi double
                    double pj = Double.parseDouble(isiAlas);
                    double lb = Double.parseDouble(isiTinggi);

                    //panggil method LuasSegitiga
                    double hs = LuasSegitiga(pj, lb);

                    //parsing hasil menjadi string
                    String output = String.valueOf(hs);

                    //set txtHasil dengan output (string hasil parsing)
                    hasil.setText(output.toString());

                }
            }
        });
    }
    public double LuasSegitiga(double p, double l){
        return p*l;

    }
}