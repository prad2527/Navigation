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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 * Created by user on 17/12/2016.
 */

public class ArrayOprationFragment extends Fragment
{
    EditText name,age;
    TextView result;
    Button btnadd,btnfirst,btnnext,btnprivious,btnlast;
    Map<String, String> myLinkedHashmap=new LinkedHashMap<>();
    ArrayList myList=new ArrayList();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View v = inflater.inflate
                (R.layout.fragment_array_opration, container, false);


        name = (EditText) v.findViewById(R.id.txtName);
        age = (EditText) v.findViewById(R.id.txtAge);
        result = (TextView) v.findViewById(R.id.txtResult);

        btnadd = (Button) v.findViewById(R.id.btnAdd);
        btnfirst = (Button) v.findViewById(R.id.btnFirst);
        btnnext = (Button) v.findViewById(R.id.btnNext);
        btnprivious = (Button) v.findViewById(R.id.btnPrivious);
        btnlast = (Button) v.findViewById(R.id.btnLast);

        btnadd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Name, Age;
                Name = name.getText().toString();
                Age = age.getText().toString();


                myLinkedHashmap.put(Name, Age);
                if (myLinkedHashmap.size() > 5)
                {
                    Toast.makeText(getActivity(), "Array is full....", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnfirst.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Map.Entry obj =  myLinkedHashmap.entrySet().iterator().next();
                result.setText(obj.getKey()+" "+obj.getValue());
            }
        });

        btnlast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Map.Entry obj= (Map.Entry) myLinkedHashmap.entrySet().toArray()[myLinkedHashmap.size()-1];
                result.setText(obj.getKey()+" "+obj.getValue());

            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Iterator itr=myLinkedHashmap.entrySet().iterator();
                while(itr.hasNext())
                {
                    result.setText(String.valueOf(itr.next()));
                }


            }
        });
        btnprivious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListIterator<Map.Entry<String,String>> listIterator=new LinkedList<>(myLinkedHashmap.entrySet()).listIterator();
                while (listIterator.hasPrevious()) {
                    result.setText(listIterator.previous().getKey());
                }
            }
        });

        return v;
    }
}



