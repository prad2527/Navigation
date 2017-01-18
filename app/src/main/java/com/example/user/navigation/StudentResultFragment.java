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

public class StudentResultFragment extends Fragment
{
    EditText Firstsub,Secondsub,Thirdsub,Fourthsub,Fifthsub,Sixthsub,Avrage;
    TextView Result;
    Button btnresult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_student_result, container, false);


        Firstsub = (EditText)v.findViewById(R.id.txtFirstsub);
        Secondsub = (EditText)v.findViewById(R.id.txtSecondsub);
        Thirdsub = (EditText)v.findViewById(R.id.txtThirdsub);
        Fourthsub = (EditText)v.findViewById(R.id.txtFourthsub);
        Fifthsub = (EditText)v.findViewById(R.id.txtFifthsub);
        Sixthsub = (EditText)v.findViewById(R.id.txtSixthsub);
        Avrage = (EditText)v.findViewById(R.id.txtAvrage);

        Result = (TextView)v.findViewById(R.id.txtResult);
        btnresult = (Button)v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(Firstsub.getText().length()>0 && Secondsub.getText().length()>0 && Thirdsub.getText().length()>0 &&
                        Fourthsub.getText().length()>0 && Fifthsub.getText().length()>0 && Sixthsub.getText().length()>0)
                {
                    int Marathi, Hindi, English, Maths, Evs, Science;
                    double avg;

                    Marathi = Integer.parseInt(Firstsub.getText().toString());
                    Hindi= Integer.parseInt(Secondsub.getText().toString());
                    English = Integer.parseInt(Thirdsub.getText().toString());
                    Maths = Integer.parseInt(Fifthsub.getText().toString());
                    Evs = Integer.parseInt(Fifthsub.getText().toString());
                    Science = Integer.parseInt(Sixthsub.getText().toString());

                    avg = ((Marathi + Hindi + English + Maths + Evs + Science) / 6);

                    Avrage.setText(String.valueOf(avg));


                    if (avg > 75 && avg < 100)

                    {
                        Result.setText("Your grade is Distinction");
                    }
                    else if (avg >= 60 && avg < 75)
                    {
                        Result.setText("Your grade is First Class");
                    }
                    else if (avg >= 50 && avg < 60)
                    {
                        Result.setText("Your grade is Second Class");
                    }
                    else if (avg >= 35 && avg < 50)
                    {
                        Result.setText("Your grade is Pass Class");
                    }
                    else if (Marathi < 35 && Hindi < 35 && English < 35 && Maths < 35 && Evs < 35 && Science < 35)
                    {
                        Result.setText("Your grade is fail");
                    } else
                    {
                        Result.setText("Your Result is A.T.K.T.");
                    }
                }
                else
                {
                    Toast.makeText(getActivity(),"Please Enter All the Fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;

    }

}


