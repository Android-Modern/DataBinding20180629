package com.example.doctorsfab.databindingv1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.doctorsfab.databindingv1.databinding.ActivityMain2Binding;
import com.example.doctorsfab.databindingv1.databinding.ActivityMainBinding;

public class Main2Activity extends AppCompatActivity {

/*
* 레이아웃이름으로 바인딩클래스명 확보 주의!
* *
* */
ActivityMain2Binding activityMain2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        activityMain2Binding.textView3.setText("kkk");

    }
}
