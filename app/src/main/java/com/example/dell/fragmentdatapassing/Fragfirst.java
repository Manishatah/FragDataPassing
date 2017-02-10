package com.example.dell.fragmentdatapassing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by DELL on 2/9/2017.
 */

public class Fragfirst extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragfirst,container,false);
        Button btn=(Button)view.findViewById(R.id.btnfrag1);
        final EditText ed=(EditText)view.findViewById(R.id. editTextname);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragsecond fragsecond=new Fragsecond();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                String str=ed.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("key",str);
                fragsecond.setArguments(bundle);
                ft.replace(R.id.l1,fragsecond);
                ed.setText("");
                ft.addToBackStack("");
                ft.commit();

            }
        });
        return view;
    }
}
