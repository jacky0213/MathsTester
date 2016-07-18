package com.example.jackykwong.mathstester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numEt;
    EditText percentageEt;
    Button calBtn;
    TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numEt = (EditText) findViewById(R.id.numEt);
        percentageEt = (EditText) findViewById(R.id.percentageEt);
        calBtn = (Button) findViewById(R.id.calBtn);
        resultTv = (TextView) findViewById(R.id.resultTv);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(percentageEt.getText().toString());
                float number =  Float.parseFloat(numEt.getText().toString());

                Calculation cal = new Calculation();
                float result = cal.calculation(percentage, number);
                resultTv.setText(Float.toString(result));
            }
        });

    }


}
