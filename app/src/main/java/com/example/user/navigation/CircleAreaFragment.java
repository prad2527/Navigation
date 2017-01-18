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

public class CircleAreaFragment extends Fragment
{
    EditText firstRadius;
    TextView areaOfCircle;
    Button btnarea;

    double pi = 3.14, radius, area;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_circle_area, container, false);


        firstRadius = (EditText) v.findViewById(R.id.txtRadius);
        areaOfCircle = (TextView) v.findViewById(R.id.txtArea);
        btnarea = (Button) v.findViewById(R.id.btnArea);

        btnarea.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {

                radius = Double.parseDouble(firstRadius.getText().toString());
                area = pi * radius * radius;

                areaOfCircle.setText(Double.toString(area));

            }
        });

        return v;
    }
}

