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

public class EvenOddFragment extends Fragment
{
    EditText Number;
    TextView NumberisEvenorOdd;
    Button btnEvenorOdd;

    double number;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_even_odd, container, false);




        Number = (EditText) v.findViewById(R.id.txtNumber);
        NumberisEvenorOdd = (TextView) v.findViewById(R.id.txtEvenorOdd);
        btnEvenorOdd = (Button) v.findViewById(R.id.btnEvenorOdd);

        btnEvenorOdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if (number % 2 == 0)
                {
                    //Toast.makeText(MainActivity.this, "Number is even", Toast.LENGTH_LONG).show();
                }
                else
                {
                    // Toast.makeText(MainActivity.this, "Number is odd", Toast.LENGTH_LONG).show();
                }

                number = Double.parseDouble(Number.getText().toString());
                NumberisEvenorOdd.setText(Double.toString(number));
            }
        });

        return v;
    }
}



