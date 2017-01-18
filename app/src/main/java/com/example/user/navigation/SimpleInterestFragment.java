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

public class SimpleInterestFragment extends Fragment
{
    EditText principal, rate, time;
    TextView SimpleInterest;
    Button btnSimpleinterest;

    double Principal, Rate, Time, Simpleinterest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_simple_interest, container, false);


        principal = (EditText) v.findViewById(R.id.txtPrincipal);
        rate = (EditText) v.findViewById(R.id.txtRate);
        time = (EditText) v.findViewById(R.id.txtTime);
        SimpleInterest = (TextView) v.findViewById(R.id.txtSimpleInterest);
        btnSimpleinterest = (Button) v.findViewById(R.id.btnSimpleInterest);

        btnSimpleinterest.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Principal = Double.parseDouble(principal.getText().toString());
                Rate = Double.parseDouble(rate.getText().toString());
                Time = Double.parseDouble(time.getText().toString());


                Simpleinterest = Principal * Rate * Time / 100;
                SimpleInterest.setText(Double.toString(Simpleinterest));

            }
        });

return v;

    }
}


