package com.example.slf.pulse_manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;



/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment4 extends Fragment implements View.OnClickListener {

    public MyFragment4() {
    }

    private LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4,container,false);
        linearLayout= (LinearLayout) view.findViewById(R.id.record_linear);
        linearLayout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.record_linear:

                Intent intent=new Intent(getContext(),TreatmentRecordActivity.class);
                startActivity(intent);
                break;
        }
    }
}
