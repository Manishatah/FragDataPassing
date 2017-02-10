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
import android.widget.TextView;

/**
 * Created by DELL on 2/9/2017.
 */

public class Fragthird extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragthird,container,false);
        TextView txt=(TextView)view.findViewById(R.id.textViewnm);
        TextView txt1=(TextView)view.findViewById(R.id.textViewsem);
        String s1=getArguments().getString("key2");
        String str1=getArguments().getString("key1");
        txt.setText(str1);
        txt1.setText(s1);
        Button bt=(Button)view.findViewById(R.id.btnback_frg3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                fm.popBackStack();;
                ft.commit();
            }
        });
        return view;
    }
}
