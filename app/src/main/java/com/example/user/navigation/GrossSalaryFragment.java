package com.example.user.navigation;


import android.os.Bundle;
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

public class GrossSalaryFragment extends Fragment
{
    EditText salary;
    TextView grosssalary;
    Button btngrosssalary;

    double hra,da,pf,tax;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_gross_salary, container, false);


        salary = (EditText)v.findViewById(R.id.txtSalary);
        grosssalary =(TextView)v.findViewById(R.id.txtGrossSalary);
        btngrosssalary =(Button)v.findViewById(R.id.btnGrossSalary);

        btngrosssalary.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int sal;
                sal=Integer.parseInt(salary.getText().toString());
                double GrossSalary;
                if(sal>1 && sal<4000)
                {

                    double hra=0.1,da=0.5,pf=0.15,tax=0.02;
                    GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
                    grosssalary.setText(String.valueOf(GrossSalary));

                }
                else if (sal>=4001 && sal<=8000)
                {
                    double hra=0.2,da=0.6,pf=0.1,tax=0.05;
                    GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
                    grosssalary.setText(String.valueOf(GrossSalary));
                }
                else if (sal>=8001 && sal<=12000)
                {
                    double hra=0.25,da=0.7,pf=0.1,tax=0.08;
                    GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
                    grosssalary.setText(String.valueOf(GrossSalary));
                }
                else if (sal>12000)
                {
                    double hra=0.3,da=0.8,pf=0.15,tax=0.1;
                    GrossSalary=(sal+(sal*hra)+(sal*da))-((pf*sal)+(sal*tax));
                    grosssalary.setText(String.valueOf(GrossSalary));
                }
            }
        });
  return v;

    }


}
