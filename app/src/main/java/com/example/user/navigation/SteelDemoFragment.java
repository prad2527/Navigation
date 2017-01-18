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

public class SteelDemoFragment extends Fragment
{
    EditText hardness,carbon,tensile;
    TextView result;
    Button btnresult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_steel_demo, container, false);



        hardness = (EditText)v.findViewById(R.id.txtHardness);
        carbon = (EditText) v.findViewById(R.id.txtCarbon);
        tensile = (EditText)v.findViewById(R.id.txtTensile);
        result = (TextView)v.findViewById(R.id.txtResult);
        btnresult = (Button)v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int Hardness,Tensile;
                double Carbon;
                Hardness = Integer.parseInt(hardness.getText().toString());
                Carbon = Double.parseDouble(carbon.getText().toString());
                Tensile = Integer.parseInt(tensile.getText().toString());

                if (Hardness > 50)
                {
                    if (Carbon< 0.7)
                    {
                        if (Tensile > 5600)
                        {
                            result.setText("Grade is 10");
                        }
                        else
                        {
                            result.setText("Grade is 9");
                        }
                    }
                    else
                    {
                        if(Hardness > 50)
                        {
                            if (Tensile > 5600)
                            {
                                result.setText("Grade is 7");
                            }
                            else
                            {
                                result.setText("Grade is 6");
                            }
                        }
                    }
                }
                else
                {
                    if (Carbon < 0.7)
                    {
                        if (Tensile > 5600)
                        {
                            result.setText("Grade is 8");
                        }
                        else
                        {
                            result.setText("Grade is 6");
                        }
                    }
                    else
                    {
                        if (Tensile > 5600)
                        {
                            result.setText("Grade is 6");
                        }
                        else
                        {
                            result.setText("Grade is 5");
                        }
                    }
                }
            }
        });

        return v;
    }
}




