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
import android.widget.Toast;

/**
 * Created by user on 16/12/2016.
 */
public class AmstrongNoFragment extends Fragment
{

    EditText number1;
    EditText number2;
    EditText number3;
    TextView amstrongnumberis;
    Button btnamstrongno;

    double Number=001,temp,digit1,digit2,digit3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_amstrong_no, container, false);

        number1 = (EditText)v.findViewById(R.id.txtNumber1);
        number2 = (EditText)v.findViewById(R.id.txtNumber2);
        number3 = (EditText)v.findViewById(R.id.txtNumber3);

        amstrongnumberis =(TextView)v.findViewById(R.id.txtamstrongno);
        btnamstrongno = (Button)v.findViewById(R.id.btnamstrongnois);

        btnamstrongno.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                digit1 = Double.parseDouble(number1.getText().toString());
                digit2 = Double.parseDouble(number2.getText().toString());
                digit3 = Double.parseDouble(number3.getText().toString());
                while (Number <= 500)

                {
                    digit1 = Number%10;
                    digit2 = (Number%100) - ((Number/100)*10);
                    digit3 = Number%1000;

                    temp = (digit1*digit1*digit1) + (digit2*digit2*digit2)+ (digit3*digit3*digit3);

                    if (temp == Number)

                    {
                        Toast.makeText(getActivity(), "Amstrong no is", Toast.LENGTH_LONG).show();
                    }
                    Number++;
                }

                amstrongnumberis.setText(Double.toString(temp));
                amstrongnumberis.setText(Double.toString(digit1));
                amstrongnumberis.setText(Double.toString(digit2));
                amstrongnumberis.setText(Double.toString(digit3));
            }
        });

        return v;
    }
}






