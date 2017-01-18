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
 * Created by user on 17/12/2016.
 */

public class ArithmaticOprationFragment extends Fragment
{


    EditText number1;
    EditText number2;
    Button btnAdd;
    Button btnSub;
    Button btnDiv;
    Button btnMul;
    TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_array_opration, container, false);

        number1 = (EditText) v.findViewById(R.id.txtNumber1);
        number2 = (EditText) v.findViewById(R.id.txtNumber2);
        btnAdd = (Button) v.findViewById(R.id.btnAdd);
        btnSub = (Button) v.findViewById(R.id.btnSub);
        btnMul = (Button) v.findViewById(R.id.btnMul);
        btnDiv = (Button) v.findViewById(R.id.btnDiv);

        txtResult = (TextView) v.findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if((number1.getText().length()>0) && (number2.getText().length()>0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double theResult = num1 + num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((number1.getText().length()>0) && (number1.getText().length()>0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double theResult = num1 - num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((number1.getText().length()>0) && (number2.getText().length()>0)) {

                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double theResult = num1 * num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((number1.getText().length()>0) && (number2.getText().length()>0)) {

                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double theResult = num1 / num2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();

                }
            }
        });

return v;

    }
}



