package com.example.doctorsfab.databindingv1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.doctorsfab.databindingv1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

/*
*
* 20180629 DataBindingTest
*
*  1.Layout에서 <layout으로 감싸줌>
*  2.ActivityMainBinding으로setcontentview  를 바꾸어 줌
*
* */


    ActivityMainBinding activityMainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.textView1.setText("DataBinding Test1");


        activityMainBinding.button.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View view){

                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);

        }


        });

    }
}
