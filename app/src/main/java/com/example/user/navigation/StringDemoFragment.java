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
 * Created by user on 19/12/2016.
 */

public class StringDemoFragment extends Fragment
{
    EditText firstString,secondString;
    TextView Stringis;
    Button btnStringis;

    String s1,s2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_string_demo, container, false);


        firstString = (EditText)v.findViewById(R.id.txtfirstString);
        secondString =(EditText)v.findViewById(R.id.txtsecondString);
        Stringis = (TextView)v.findViewById(R.id.txtStringis);
        btnStringis =(Button)v.findViewById(R.id.btnStringis);

        btnStringis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(s1.equals(s2))
                {
                    Toast.makeText(getActivity(), "String is same", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getActivity(), "String is not same", Toast.LENGTH_LONG).show();
                }

            }
        });

        return v;

    }
}


