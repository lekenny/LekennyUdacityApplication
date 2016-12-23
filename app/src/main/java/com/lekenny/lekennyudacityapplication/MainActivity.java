package com.lekenny.lekennyudacityapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_00)
    Button btn_00;
    @BindView(R.id.btn_01)
    Button btn_01;
    @BindView(R.id.btn_02)
    Button btn_02;
    @BindView(R.id.btn_03)
    Button btn_03;
    @BindView(R.id.btn_04)
    Button btn_04;

    @OnClick(R.id.btn_00) void sayHello0() {
        Toast.makeText(this, btn_00.getText(), LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_01) void sayHello1() {
        Toast.makeText(this, btn_01.getText(), LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_02) void sayHello2() {
        Toast.makeText(this, btn_02.getText(), LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_03) void sayHello3() {
        Toast.makeText(this, btn_03.getText(), LENGTH_SHORT).show();
    }@OnClick(R.id.btn_04) void sayHello4() {
        Toast.makeText(this, btn_04.getText(), LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
