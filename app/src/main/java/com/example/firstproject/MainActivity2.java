package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    EditText input;
    ImageView iv;
    Button b;
    ToggleButton tb;
    RelativeLayout rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv.findViewById(R.id.textView2);
        input.findViewById(R.id.input);
        iv.findViewById(R.id.imageView);
        b.findViewById(R.id.button);
        tb.findViewById(R.id.tb);

        rv.setBackgroundResource(R.drawable.ic_launcher_background);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hi "+input.getText());
            }
        });

        tb.setOnClickListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (tb.isChecked()) {
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(MainActivity2.this, "Checked", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}