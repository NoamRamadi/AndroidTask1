package com.example.myfirstprogramhit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result ;
    float num1 , num2 ;
    char operator ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);

    }

    public void buttonFunctionNumber(View view) {
        if(view instanceof Button){
            Button b = (Button) view;

            String str = b.getText().toString();

            result.append(str);
        }
    }

    public void buttonFunctionOperator(View view) {
        if(view instanceof Button){
            Button b = (Button) view;
            num1 = Float .parseFloat( result.getText().toString());
            operator = b.getText().toString().charAt(0);
            result.setText("");
        }

    }

    public void buttonFunctionEqual(View view) {
        float res ;
        if(view instanceof Button) {
            if(!result.getText().toString().equals("")) {
                num2 = Float.parseFloat(result.getText().toString());
            }

            switch(operator) {
                case '/':
                    res = num1 / num2;
                    break;
                case 'X':
                    res = num1 * num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '+':
                    res = num1 + num2;
                    break;
                default:
                    res = 0;
            }

            result.setText(String.valueOf(res));
        }
    }

    public void buttonFunctionClr(View view) {
        if(view instanceof Button){
            result.setText("");
            num1 = 0;
            num2 = 0;
        }
    }
}