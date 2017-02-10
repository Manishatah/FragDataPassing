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
import android.widget.TextView;

/**
 * Created by DELL on 2/9/2017.
 */

public class Fragsecond extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragsecond,container,false);
        Button bt=(Button)view.findViewById(R.id.btna_frag2);
        Button btn1=(Button)view.findViewById(R.id.btnb_frag2);
        final EditText ed=(EditText) view.findViewById(R.id.editTextSem);
final String str=getArguments() .getString("key");

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                fm.popBackStack();
                ft.commit();

            }
        });
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragthird fragthird=new Fragthird();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            Bundle bundle=new Bundle();
            String s=ed.getText() .toString();
            bundle.putString("key1",str);
            bundle.putString("key2",s);
            fragthird.setArguments(bundle);
            ft.replace(R.id.l1,fragthird);
            ed.setText("");
            ft.addToBackStack("");
            ft.commit();



        }
    });
    return view;
    }
}
