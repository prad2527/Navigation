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

public class CharacterDemoFragment extends Fragment
{
    EditText character;
    TextView result;
    Button btnresult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {

        View v = inflater.inflate
                (R.layout.fragment_character_demo, container, false);


        character = (EditText) v.findViewById(R.id.txtCharacter);
        result = (TextView) v.findViewById(R.id.txtResult);
        btnresult = (Button) v.findViewById(R.id.btnResult);

        btnresult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                char ch = character.getText().charAt(0);
                if (ch >= 48 && ch <= 57)
                {
                    result.setText("Character is Digit");
                }
                else if (ch >= 65 && ch <= 90)
                {
                    result.setText("Character is Capital Letter");

                }
                else if (ch >= 97 && ch <= 122)
                {
                    result.setText("Character is Small Case Letter");

                }
                else if (ch >= 0 && ch <= 47)
                {
                    result.setText("Character is Special Symbol");

                }
                else if (ch >= 58 && ch <= 64)
                {
                    result.setText("Character is Special Symbol");

                }
                else if (ch >= 91 && ch <= 96)
                {
                    result.setText("Character is digit");

                }
                else if (ch >= 123 && ch <= 127)
                {
                    result.setText("Character is digit");
                }
            }
        });

        return  v;
    }
}








