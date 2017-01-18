package com.example.user.navigation;

import android.os.Bundle;
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

public class ConvertFernamentToCentigradeFragment extends Fragment
{

    EditText farenheit;
    TextView centigrade;
    Button btnresult;

    Double Farenheit,Centigrade,result;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_fernament_centigrade, container, false);



        farenheit = (EditText)v.findViewById(R.id.txtFarenheit);
        centigrade = (TextView) v.findViewById(R.id.txtCentigrade);
        btnresult = (Button)v.findViewById(R.id.btnresult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Farenheit = Double.parseDouble(farenheit.getText().toString());
                Centigrade=(Farenheit-32)*5/9;
                centigrade.setText(String.valueOf(result));
            }
        });

        return v;
    }
}





