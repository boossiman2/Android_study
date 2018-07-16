package com.example.bsh.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnFin, btnRef;
    ImageView imgePet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좋아하는 안드로이드 버전은?");

        text1 = (TextView) findViewById(R.id.Text1);
        switchAgree = (Switch) findViewById(R.id.SwitchAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoRabbit = (RadioButton) findViewById(R.id.RdoRab);

        imgePet = (ImageView) findViewById(R.id.ImgPet);
        btnFin = (Button) findViewById(R.id.BtnFin);
        btnRef = (Button) findViewById(R.id.BtnRefresh);
        // Switch on -> text etc appear
        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switchAgree.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnFin.setVisibility(View.VISIBLE);
                    btnRef.setVisibility(View.VISIBLE);
                    imgePet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnFin.setVisibility(View.INVISIBLE);
                    btnRef.setVisibility(View.INVISIBLE);
                    imgePet.setVisibility(View.INVISIBLE);
                }
            }
        });
        // Check RadioBtn => Image appears
        rdoDog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rdoDog.isChecked())
                    imgePet.setImageResource(R.drawable.dog);
            }
        });
        rdoCat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rdoCat.isChecked())
                    imgePet.setImageResource(R.drawable.cat);
            }
        });
        rdoRabbit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rdoRabbit.isChecked())
                    imgePet.setImageResource(R.drawable.usagi);
            }
        });
        // when u click 종료 Btn
        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        // when u click 처음부터 Btn
    }
}
