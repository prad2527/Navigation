package com.example.user.navigation;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 16/12/2016.
 */

public class CompanyInsuranceFragment extends Fragment
{
    EditText gender,age,health,live;
    TextView result;
    Button btnresult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {


        View v = inflater.inflate
                (R.layout.fragment_company_insurance, container, false);


        gender = (EditText)v.findViewById(R.id.txtGender);
        age = (EditText)v.findViewById(R.id.txtAge);
        health = (EditText)v.findViewById(R.id.txtHealth);
        live = (EditText)v.findViewById(R.id.txtlive);
        result = (TextView)v.findViewById(R.id.txtResult);
        btnresult = (Button)v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Health, Lives_In, Gender;
                int Age;
                Gender = gender.getText().toString();
                Age = Integer.parseInt(age.getText().toString());
                Health = health.getText().toString();
                Lives_In = live.getText().toString();



                if(Health.equals("excellent") && (Age>=25 && Age<=35))
                {
                    if(Lives_In.equals("city") && Gender.equals("male"))
                    {
                        result.setText("Person is insured" + " " + "Maximum Amount is Rs.2 Lakhs");
                    }
                    else if(Lives_In.equals("city") && Gender.equals("female"))
                    {
                        result.setText("Person is insured" + " " + "Maximum Amount is Rs.1 Lakh");
                    }
                }
                else if(Health.equals("poor") && (Age>=25 && Age<=35))
                {
                    if(Lives_In.equals("village") && Gender.equals("male"))
                    {
                        result.setText("Person is insured" + " " + "Maximum Amount is Rs.10,000");
                    }
                    else
                    {
                        result.setText("Person is not insured");
                    }
                }
                else
                {
                    result.setText("Person is not insured");
                }
            }
        });
return  v;

    }
}


