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

public class CompoundInterrestFragment extends Fragment
{
    EditText principal, anualrate, numberofyear, numberoftime, amount;
    Button btnResult;
    TextView txtResult;

    double p, r, n, t, Amount;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_compound_interest, container, false);




        principal = (EditText) v.findViewById(R.id.txtprincipal);
        anualrate = (EditText) v.findViewById(R.id.txtannualrate);
        numberofyear = (EditText) v.findViewById(R.id.txtnumberofyear);
        numberoftime = (EditText) v.findViewById(R.id.txtnumberoftime);
        amount =(EditText)v.findViewById(R.id.txtAmount);
        txtResult = (TextView) v.findViewById(R.id.textResult);
        btnResult = (Button) v.findViewById(R.id.btnResult);


        btnResult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                p = Double.parseDouble(principal.getText().toString());
                r = Double.parseDouble(anualrate.getText().toString());
                n = Double.parseDouble(numberofyear.getText().toString());
                t = Double.parseDouble(numberoftime.getText().toString());

                Amount = p*(1+r/n)*t;
                txtResult.setText(Double.toString(Amount));


            }
        });

        return v;
    }
}







