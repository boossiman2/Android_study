package com.example.bsh.ex53;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String str;
        //setContentView(R.layout.activity_main);
        // LinearLayout 부분
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout,params);
        // EditText 부분
        EditText editText = new EditText(this);
        baseLayout.addView(editText);
        //str = editText.getText().toString();
        // Button 부분
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.GREEN);
        baseLayout.addView(btn);
        // TextView 부분
        final TextView textVIew = new TextView(this);
        baseLayout.addView(textVIew);

        // Button Click 부분
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText -> TextView
                //textVIew.setText(str);
            }
        });
    }
}
