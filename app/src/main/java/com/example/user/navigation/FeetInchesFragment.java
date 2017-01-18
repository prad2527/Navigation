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

public class FeetInchesFragment extends Fragment
{
    EditText feet,inches;
    TextView Result;
    Button btnresult;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_feet_inches, container, false);


        feet = (EditText) v.findViewById(R.id.txtFeet);
        inches = (EditText) v.findViewById(R.id.txtInches);
        Result = (TextView) v.findViewById(R.id.txtResult);
        btnresult = (Button) v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int Feet,Inches;
                double Res;
                Feet=Integer.parseInt(feet.getText().toString());
                Inches=Integer.parseInt(inches.getText().toString());

                Res=(Feet*30.48)+(Inches*2.54);
                Result.setText(String.valueOf(Res));
            }
        });
  return v;
    }
}





