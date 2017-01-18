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
 * Created by user on 17/12/2016.
 */
public class CompanyDriverFragment  extends Fragment
{
    EditText maritalstatus,gender,age;
    TextView result;
    Button btnresult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_company_driver, container, false);


        maritalstatus = (EditText)v.findViewById(R.id.txtStatus);
        gender = (EditText)v.findViewById(R.id.txtGender);
        age = (EditText)v.findViewById(R.id.txtAge);
        result = (TextView)v.findViewById(R.id.txtResult);
        btnresult = (Button)v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String MaritalSatus,Gender;
                int Age;

                MaritalSatus = maritalstatus.getText().toString();
                Gender = gender.getText().toString();
                Age = Integer.parseInt(age.getText().toString());

                if(MaritalSatus.equals("Married"))
                {
                    result.setText("Driver is insured");
                }
                else if( MaritalSatus.equals("Unmarried") && Gender.equals("Male"))
                {
                    if(Age>30)
                    {
                        result.setText("Driver is insured");
                    }
                    else
                    {
                        result.setText("Driver is NOT insured!!");
                    }
                }
                else if( MaritalSatus.equals("Unmarried") && Gender.equals("Female"))
                {

                    if(Age>25)
                    {
                        result.setText("Driver is insured");
                    }
                    else
                    {
                        result.setText("Driver is NOT insured!!!");
                    }
                }
            }
        });

        return  v;
    }
}





