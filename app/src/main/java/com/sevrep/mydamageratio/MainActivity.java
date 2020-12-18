package com.sevrep.mydamageratio;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText edtBonusAttack;
    private EditText edtBaseAttack;
    private EditText edtTotalDamage;
    private EditText edtCriticalRate;
    private EditText edtCriticalDamage;

    private TextView txtTotalAtk;
    private TextView txtDmg;
    private TextView txtCd;

    private double bonusAttack;
    private double baseAttack;
    private double totalDamage;
    private double criticalRate;
    private double criticalDamage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtBonusAttack = findViewById(R.id.edtBonusAttack);
        edtBaseAttack = findViewById(R.id.edtBaseAttack);
        edtTotalDamage = findViewById(R.id.edtTotalDamage);
        edtCriticalRate = findViewById(R.id.edtCriticalRate);
        edtCriticalDamage = findViewById(R.id.edtCriticalDamage);

        txtTotalAtk = findViewById(R.id.txtTotalAtk);
        txtDmg = findViewById(R.id.txtDmg);
        txtCd = findViewById(R.id.txtCd);

        edtBonusAttack.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bonusAttack = s.length() != 0 ? convertToDouble(edtBonusAttack) : 0.0;
                displayTotalAtk();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtBaseAttack.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                baseAttack = s.length() != 0 ? convertToDouble(edtBaseAttack) : 0.0;
                displayTotalAtk();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtTotalDamage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                totalDamage = s.length() != 0 ? convertToDouble(edtTotalDamage) : 0.0;
                txtDmg.setText(getTwoDecimalFormat(totalDamage));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtCriticalRate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                criticalRate = s.length() != 0 ? convertToDouble(edtCriticalRate) : 0.0;
                displayCd();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtCriticalDamage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                criticalDamage = s.length() != 0 ? convertToDouble(edtCriticalDamage) : 0.0;
                displayCd();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void displayCd() {
        txtCd.setText(getTwoDecimalFormat(computeCd()));
    }

    private double computeCd() {
        return (criticalRate * criticalDamage) / 100;
    }

    private double convertToDouble(EditText editText) {
        return Double.parseDouble(editText.getText().toString());
    }

    private String getTwoDecimalFormat(double halaga) {
        return String.format(Locale.ENGLISH, "%.2f", halaga);
    }

    private void displayTotalAtk() {
        txtTotalAtk.setText(getTwoDecimalFormat(computeTotalAttack()));
    }

    private double computeTotalAttack() {
        return (bonusAttack / baseAttack) * 100;
    }
}