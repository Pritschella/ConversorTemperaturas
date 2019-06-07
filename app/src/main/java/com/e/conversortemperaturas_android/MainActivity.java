package com.e.conversortemperaturas_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.e.conversortemperaturas.R;
 
public class MainActivity extends AppCompatActivity implements AdapterView.OnClickListener {
    EditText cajaNumAConvertir,cajaC,cajaF,cajaR,cajaK;
    RadioButton radioF,radioC,radioR,radioK;
    CheckBox chkF,chkC,chkR,chkK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaNumAConvertir=findViewById(R.id.editText_convertir);
        cajaC=findViewById(R.id.editText_C);
        cajaF=findViewById(R.id.editText_F);
        cajaR=findViewById(R.id.editText_R);
        cajaK=findViewById(R.id.editText_K);

        radioC=findViewById(R.id.radioButtonC);
        radioF=findViewById(R.id.radioButtonF);
        radioR=findViewById(R.id.radioButtonR);
        radioK=findViewById(R.id.radioButtonK);

        chkF=findViewById(R.id.checkBox_F);
        chkF.setOnClickListener(this);
        chkC=findViewById(R.id.checkBox_C);
        chkC.setOnClickListener(this);
        chkK=findViewById(R.id.checkBox_K);
        chkK.setOnClickListener(this);
        chkR=findViewById(R.id.checkBox_R);
        chkR.setOnClickListener(this);
    }
    public void onClick(View v) {
        int click = v.getId();
        double grados = Double.parseDouble(cajaNumAConvertir.getText().toString());

        if (radioC.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.checkBox_C) {
                cajaC.setText(grados + "");
                chkC.setChecked(true);
            }
            if (click == R.id.checkBox_F) {
                double res = grados * 1.8 + 32;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.checkBox_R) {
                double res = (grados * 1.8 )+ 491.67;
                cajaR.setText(res + "");
                chkR.setChecked(true);
            }
            if (click == R.id.checkBox_K) {
                double res = grados + 273.15;
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioF.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.checkBox_C) {
                double res=(grados-32)/1.8;
                cajaC.setText(String.valueOf(res));
                chkC.setChecked(true);
            }
            if (click == R.id.checkBox_F) {
                cajaF.setText(grados + "");
                chkF.setChecked(true);
            }
            if (click == R.id.checkBox_R) {
                double res = grados + 459.67;
                cajaR.setText(res + "");
                chkR.setChecked(true);
            }
            if (click == R.id.checkBox_K) {
                double res =((grados-32)/1.8)+273.15;
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioR.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.checkBox_C) {
                double res= (grados-491.67)/1.8;
                cajaC.setText(res + "");
                chkC.setChecked(true);
            }
            if (click == R.id.checkBox_F) {
                double res=grados-459.67;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.checkBox_R) {
                cajaR.setText(grados+ "");
                chkR.setChecked(true);
            }
            if (click == R.id.checkBox_K) {
                double res =grados*(5/9.);
                cajaK.setText(res + "");
                chkK.setChecked(true);
            }
        }

        if (radioK.isChecked()) {
            cajaC.setText("");
            cajaF.setText("");
            cajaR.setText("");
            cajaK.setText("");
            chkC.setChecked(false);
            chkF.setChecked(false);
            chkR.setChecked(false);
            chkK.setChecked(false);

            if (click == R.id.checkBox_C) {
                double res=grados-273.15;
                cajaC.setText(res + "");
                chkC.setChecked(true);
            }
            if (click == R.id.checkBox_F) {
                double res=((grados-273.15)*1.8 )+ 32;
                cajaF.setText(res + "");
                chkF.setChecked(true);
            }
            if (click == R.id.checkBox_R) {
                double res=grados*1.8;
                cajaR.setText(res+ "");
                chkR.setChecked(true);
            }
            if (click == R.id.checkBox_K) {
                cajaK.setText(grados+ "");
                chkK.setChecked(true);
            }
        }

    }

}//clasee
