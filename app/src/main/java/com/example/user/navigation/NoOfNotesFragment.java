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

public class NoOfNotesFragment extends Fragment
{
    EditText Rs500,Rs100,Rs50,Rs20,Rs10,Rs5,Rs1,Amount;
    TextView Result;
    Button btnDisplay;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_no_notes, container, false);

        Rs500 = (EditText)v.findViewById(R.id.txt500);
        Rs100 = (EditText)v.findViewById(R.id.txt100);
        Rs50 = (EditText)v.findViewById(R.id.txt50);
        Rs20 = (EditText)v.findViewById(R.id.txt20);
        Rs10 = (EditText)v.findViewById(R.id.txt10);
        Rs5 = (EditText)v.findViewById(R.id.txt5);
        Rs1 = (EditText)v.findViewById(R.id.txt1);
        Amount = (EditText)v.findViewById(R.id.txtAmount);

        Result = (TextView)v.findViewById(R.id.txtResult);

        btnDisplay = (Button)v.findViewById(R.id.btnResult);

        btnDisplay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int amount,num;
                amount=Integer.parseInt(Amount.getText().toString());
                while(amount>=500)
                {
                    num=amount/500;
                    amount=amount%500;
                    Rs500.setText(String.valueOf(num));
                    break;
                }
                while(amount>=100)
                {
                    num=amount/100;
                    amount=amount%100;
                    Rs100.setText(String.valueOf(num));
                    break;
                }
                while(amount>=50)
                {
                    num=amount/50;
                    amount=amount%50;
                    Rs50.setText(String.valueOf(num));
                    break;
                }
                while(amount>=20)
                {
                    num=amount/20;
                    amount=amount%20;
                    Rs20.setText(String.valueOf(num));
                    break;
                }
                while(amount>=10)
                {
                    num=amount/10;
                    amount=amount%10;
                    Rs10.setText(String.valueOf(num));
                    break;
                }
                while(amount>=5)
                {
                    num=amount/5;
                    amount=amount%5;
                    Rs5.setText(String.valueOf(num));
                    break;
                }

                while(amount>=1)
                {
                    num=amount/1;
                    amount=amount%1;
                    Rs1.setText(String.valueOf(num));
                    break;
                }
            }
        });



return v;

    }
}


