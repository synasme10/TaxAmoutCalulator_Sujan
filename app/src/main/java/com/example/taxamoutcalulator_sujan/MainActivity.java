package com.example.taxamoutcalulator_sujan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EtSalary;
    Button BtnCalc;
    TextView TvTax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtSalary= findViewById(R.id.EtSalary);
        TvTax= findViewById(R.id.TvTax);

        BtnCalc= findViewById(R.id.BtnCalc);

        BtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(EtSalary.getText().toString()))
                {
                    EtSalary.setError("Enter your Monthly Salary");
                }
                else if ((EtSalary.getText().toString()).length()>=9){
                    EtSalary.setError("Enter valid digit Monthly Salary");
                }
                float salary;



                salary = Integer.parseInt(EtSalary.getText().toString());
                salary=salary*12;

                Tax_Sujan tax=new Tax_Sujan(salary);

                TvTax.setText(Float.toString(tax.taxcalculation()));


                InputMethodManager i = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
               i.hideSoftInputFromWindow(BtnCalc.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
            }
        });
    }
}
