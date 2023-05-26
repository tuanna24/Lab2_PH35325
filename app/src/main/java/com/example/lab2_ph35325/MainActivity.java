package com.example.lab2_ph35325;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn_Click);

        EditText edtHoten = findViewById(R.id.edt_Name);
        EditText edtMsv = findViewById(R.id.edt_Msv);
        EditText edtTuoi = findViewById(R.id.edt_Tuoi);
        RadioButton rdoNam = findViewById(R.id.rdo_Nam);
        RadioButton rdoNu = findViewById(R.id.rdo_Nu);
        CheckBox chkDaBong = findViewById(R.id.chk_Da);
        CheckBox chkBongRo= findViewById(R.id.chk_Bong);
        TextView tvResult = findViewById(R.id.tv_result);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String hoTen = edtHoten.getText().toString();
                String Msv = edtMsv.getText().toString();
                String Tuoi = edtTuoi.getText().toString();
                String gioitinh = rdoNam.isChecked()
                        ? rdoNam.getText().toString()
                        : (rdoNu.isChecked()
                        ? rdoNu.getText().toString()
                        : "chu chon gioi tinh");
                String soThich = (chkDaBong.isChecked() && chkBongRo.isChecked())
                        ? "da bong va bong ro"
                        : (chkDaBong.isChecked()
                        ? chkDaBong.getText().toString()
                        : (chkBongRo.isChecked()
                        ? chkBongRo.getText().toString()
                        : "khong thich gi ca"));
                tvResult.setText("toi ten:" + hoTen + "\n"
                        + "MSV" + Msv + "\n"
                        + "Tuoi" + Tuoi + "\n"
                        + "Gioi tinh" + gioitinh + "\n"
                        + "So thich" + soThich);
            }
        });
    }
}