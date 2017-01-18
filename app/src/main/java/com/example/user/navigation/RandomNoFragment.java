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
 * Created by user on 17/12/2016.
 */

public class RandomNoFragment extends Fragment
{


    EditText no;
    Button btnresult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_random_no, container, false);


        no =(EditText)v.findViewById(R.id.txtResult);
        btnresult =(Button)v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int Random;
                int min=10,max=100;
                Random=(int)(Math.random()*(max-min)+min);
                no.setText(String.valueOf(Random));

            }
        });
   return v;
    }
}


