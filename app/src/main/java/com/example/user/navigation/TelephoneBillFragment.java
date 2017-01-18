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

public class TelephoneBillFragment extends Fragment
{
    EditText call;
    TextView result;
    Button btnbill;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_telephone_bill, container, false);



        call = (EditText) v.findViewById(R.id.txtCall);
        result = (TextView)v.findViewById(R.id.txtResult);
        btnbill = (Button)v.findViewById(R.id.btnBill);

        btnbill.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int Calls;
                double Bill;
                Calls = Integer.parseInt(call.getText().toString());
                if(200<=100)
                {

                    Bill=200*Calls;
                    result.setText(String.valueOf(Bill));
                }
                else if(Calls>100 && Calls<=150)
                {
                    Calls=Calls-100;
                    Bill=200+(0.60*Calls);
                    result.setText(String.valueOf(Bill));
                }
                else if(Calls>150 && Calls<=200)
                {
                    Calls=Calls-100;
                    Bill=200+(0.50*Calls);
                    result.setText(String.valueOf(Bill));
                }
                else if(Calls>200)
                {




                    Calls=Calls-100;
                    Bill=200+(0.40*Calls);
                    result.setText(String.valueOf(Bill));
                }
            }
        });

        return v;
    }
}


