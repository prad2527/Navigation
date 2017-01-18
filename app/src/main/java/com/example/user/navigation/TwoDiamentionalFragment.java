package com.example.user.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 19/12/2016.
 */

public class TwoDiamentionalFragment extends Fragment
{
    EditText Txt00,Txt01,Txt02,Txt10,Txt11,Txt12,Txt20,Txt21,Txt22;
    Button BtnA,BtnB,BtnAdd,BtnMul;
    int a00,a01,a02,a10,a11,a12,a20,a21,a22, b00,b01,b02,b10,b11,b12,b20,b21,b22;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_two_diamentional, container, false);



        Txt00= (EditText) v.findViewById(R.id.txt00);
        Txt01= (EditText) v.findViewById(R.id.txt01);
        Txt02= (EditText) v.findViewById(R.id.txt02);

        Txt10= (EditText) v.findViewById(R.id.txt10);
        Txt11= (EditText) v.findViewById(R.id.txt11);
        Txt12= (EditText) v.findViewById(R.id.txt12);

        Txt20= (EditText) v.findViewById(R.id.txt20);
        Txt21= (EditText) v.findViewById(R.id.txt21);
        Txt22= (EditText) v.findViewById(R.id.txt22);

        BtnA= (Button) v.findViewById(R.id.btnA);
        BtnB= (Button) v.findViewById(R.id.btnB);
        BtnAdd= (Button) v.findViewById(R.id.btnAdd);
        BtnMul= (Button) v.findViewById(R.id.btnMul);

        BtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                a00=Integer.parseInt(Txt00.getText().toString());
                a01=Integer.parseInt(Txt01.getText().toString());
                a02=Integer.parseInt(Txt02.getText().toString());

                a10=Integer.parseInt(Txt10.getText().toString());
                a11=Integer.parseInt(Txt11.getText().toString());
                a12=Integer.parseInt(Txt12.getText().toString());

                a20=Integer.parseInt(Txt20.getText().toString());
                a21=Integer.parseInt(Txt21.getText().toString());
                a22=Integer.parseInt(Txt22.getText().toString());



            }
        });
        BtnB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                b00=Integer.parseInt(Txt00.getText().toString());
                b01=Integer.parseInt(Txt01.getText().toString());
                b02=Integer.parseInt(Txt02.getText().toString());

                b10=Integer.parseInt(Txt10.getText().toString());
                b11=Integer.parseInt(Txt11.getText().toString());
                b12=Integer.parseInt(Txt12.getText().toString());

                b20=Integer.parseInt(Txt20.getText().toString());
                b21=Integer.parseInt(Txt21.getText().toString());
                b22=Integer.parseInt(Txt22.getText().toString());

            }
        });

        BtnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Txt00.setText(String.valueOf((a00 + b00)));
                Txt01.setText(String.valueOf((a01 + b01)));
                Txt02.setText(String.valueOf((a02 + b02)));

                Txt10.setText(String.valueOf((a10 + b10)));
                Txt11.setText(String.valueOf((a11 + b11)));
                Txt12.setText(String.valueOf((a12 + b12)));

                Txt20.setText(String.valueOf((a20 + b20)));
                Txt21.setText(String.valueOf((a21 + b21)));
                Txt22.setText(String.valueOf((a22 + b22)));
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Txt00.setText(String.valueOf((a00 * b00)+(a01*b10)+(a02*b20)));
                Txt01.setText(String.valueOf((a00 * b01)+(a01*b11)+(a02*b21)));
                Txt02.setText(String.valueOf((a00 * b02)+(a01*b12)+(a02*b22)));

                Txt10.setText(String.valueOf((a10 * b00)+(a11*b10)+(a12*b20)));
                Txt11.setText(String.valueOf(((a10 * b01)+(a11*b11)+(a12*b21))));
                Txt12.setText(String.valueOf((a10 * b02)+(a11*b12)+(a12*b22)));

                Txt20.setText(String.valueOf((a20 * b00)+(a21*b10)+(a22*b20)));
                Txt21.setText(String.valueOf((a20 * b01)+(a21*b11)+(a22*b21)));
                Txt22.setText(String.valueOf((a20 * b02)+(a21*b12)+(a22*b22)));
            }
        });

return v;

    }
}



