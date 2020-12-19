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

    private EditText edtBonusAttack2;
    private EditText edtBaseAttack2;
    private EditText edtTotalDamage2;
    private EditText edtCriticalRate2;
    private EditText edtCriticalDamage2;

    private TextView txtTotalAtk2;
    private TextView txtDmg2;
    private TextView txtCd2;

    private double bonusAttack2;
    private double baseAttack2;
    private double totalDamage2;
    private double criticalRate2;
    private double criticalDamage2;

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

        edtBonusAttack2 = findViewById(R.id.edtBonusAttack2);
        edtBaseAttack2 = findViewById(R.id.edtBaseAttack2);
        edtTotalDamage2 = findViewById(R.id.edtTotalDamage2);
        edtCriticalRate2 = findViewById(R.id.edtCriticalRate2);
        edtCriticalDamage2 = findViewById(R.id.edtCriticalDamage2);

        txtTotalAtk2 = findViewById(R.id.txtTotalAtk2);
        txtDmg2 = findViewById(R.id.txtDmg2);
        txtCd2 = findViewById(R.id.txtCd2);

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
                txtDmg.setText(getTwoDecimalFormat(computeTotalDmg(totalDamage)));
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

        edtBonusAttack2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bonusAttack2 = s.length() != 0 ? convertToDouble(edtBonusAttack2) : 0.0;
                displayTotalAtk2();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtBaseAttack2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                baseAttack2 = s.length() != 0 ? convertToDouble(edtBaseAttack2) : 0.0;
                displayTotalAtk2();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtTotalDamage2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                totalDamage2 = s.length() != 0 ? convertToDouble(edtTotalDamage2) : 0.0;
                txtDmg2.setText(getTwoDecimalFormat(computeTotalDmg(totalDamage2)));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtCriticalRate2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                criticalRate2 = s.length() != 0 ? convertToDouble(edtCriticalRate2) : 0.0;
                displayCd2();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtCriticalDamage2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                criticalDamage2 = s.length() != 0 ? convertToDouble(edtCriticalDamage2) : 0.0;
                displayCd2();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void displayCd() {
        txtCd.setText(getTwoDecimalFormat(computeCd(criticalRate, criticalDamage)));
    }

    private void displayTotalAtk() {
        txtTotalAtk.setText(getTwoDecimalFormat(computeTotalAttack(bonusAttack, baseAttack)));
    }

    private void displayCd2() {
        txtCd2.setText(getTwoDecimalFormat(computeCd(criticalRate2, criticalDamage2)));
    }

    private void displayTotalAtk2() {
        txtTotalAtk2.setText(getTwoDecimalFormat(computeTotalAttack(bonusAttack2, baseAttack2)));
    }

    private double computeCd(double criticalRate, double criticalDamage) {
        return (criticalRate/100) * (criticalDamage / 100);
    }

    private double computeTotalAttack(double bonusAttack, double baseAttack) {
        return bonusAttack / baseAttack;
    }

    private double computeTotalDmg(double totalDamage) {
        return totalDamage / 100;
    }

    private double convertToDouble(EditText editText) {
        return Double.parseDouble(editText.getText().toString());
    }

    private String getTwoDecimalFormat(double halaga) {
        return String.format(Locale.ENGLISH, "%.2f", halaga);
    }

}