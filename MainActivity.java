package com.example.mcghee_craig_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float Value1, Value2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setValue1(0);
        setValue2(0);
        final EditText edit1 = (EditText) findViewById(R.id.edit1);

        Button btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "0");
            }
        });

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "1");
            }
        });

        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "2");
            }
        });

        Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "3");
            }
        });

        Button btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "4");
            }
        });

        Button btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "5");
            }
        });

        Button btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "6");
            }
        });

        Button btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "7");
            }
        });

        Button btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        Button btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        Button btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText() + ".");
            }
        });

        Button btn_clear=(Button)findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue1(0);
                setValue2(0);
                edit1.setText(null);
            }
        });

        Button btn_Add=(Button)findViewById(R.id.btn_Add);
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue1(Float.parseFloat(edit1.getText().toString()));
                setAdd(true);
                setSub(false);
                setMul(false);
                setDiv(false);
                edit1.setText(null);
            }
        });

        Button btn_Sub=(Button)findViewById(R.id.btn_Sub);
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue1(Float.parseFloat(edit1.getText().toString()));
                setAdd(false);
                setSub(true);
                setMul(false);
                setDiv(false);
                edit1.setText(null);
            }
        });

        Button btn_Mul=(Button)findViewById(R.id.btn_Mul);
        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue1(Float.parseFloat(edit1.getText().toString()));
                setAdd(false);
                setSub(false);
                setMul(true);
                setDiv(false);
                edit1.setText(null);
            }
        });

        Button btn_Div=(Button)findViewById(R.id.btn_Div);
        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue1(Float.parseFloat(edit1.getText().toString()));
                setAdd(false);
                setSub(false);
                setMul(false);
                setDiv(true);
                edit1.setText(null);
            }
        });

        Button btn_equal=(Button)findViewById(R.id.btn_equal);
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue2(Float.parseFloat(edit1.getText().toString()));
                if(isAdd()==true)
                    edit1.setText(Float.toString(getValue1()+getValue2()));
                else if(isSub()==true)
                    edit1.setText(Float.toString(getValue1()-getValue2()));
                else if(isMul()==true)
                    edit1.setText(Float.toString(getValue1()*getValue2()));
                else if(isDiv()==true) {
                    if(getValue2()==0){
                        Toast toast=Toast.makeText(getApplicationContext(),"Cannot divide by 0",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else
                        edit1.setText(Float.toString(getValue1() / getValue2()));
                }
                setValue2(0);
                setValue1(Float.parseFloat(edit1.getText().toString()));
            }
        });


    }

        public float getValue1 () {
            return Value1;
        }

        public float getValue2 () {
            return Value2;
        }

        public boolean isAdd () {
            return add;
        }

        public boolean isSub () {
            return sub;
        }

        public boolean isMul () {
            return mul;
        }

        public boolean isDiv () {
            return div;
        }

        public void setValue1 ( float value1){
            Value1 = value1;
        }

        public void setValue2 ( float value2){
            Value2 = value2;
        }

        public void setAdd ( boolean add){
            this.add = add;
        }

        public void setSub ( boolean sub){
            this.sub = sub;
        }

        public void setMul ( boolean mul){
            this.mul = mul;
        }

        public void setDiv ( boolean div){
            this.div = div;

        }
    }