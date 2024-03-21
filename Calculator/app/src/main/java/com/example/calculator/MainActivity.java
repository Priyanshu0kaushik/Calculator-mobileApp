package com.example.calculator;


import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {
    public MaterialButton C, back, percent, divide, multiply, minus, plus, equal, one, two, zero, dot, three, four, five, six, seven, eight, nine;
    public TextView resulttv, history;
    public float sizee=50f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C = findViewById(R.id.C);
        back = findViewById(R.id.back);
        percent = findViewById(R.id.percent);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        equal = findViewById(R.id.result);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        resulttv = findViewById(R.id.ResulttextView);
        history = findViewById(R.id.HistorytextView);

//        Digits

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(one);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(two);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(three);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(four);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(five);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(six);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(seven);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(eight);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(nine);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeinhistory(zero);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=(String) history.getText();
                if (s.contains(".")){
                    ;

                }
                else{
                    if(s.equals("0")){
                        history.setVisibility(View.VISIBLE);
                        String on = history.getText() + (dot.getText()).toString();
                        history.setText(on);
                        resulttv.setTextColor(getResources().getColor(R.color.gray));
                        history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                        resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                        resulttv.setText("= 0");
                    }
                    else{
                        history.setVisibility(View.VISIBLE);
                        String on = history.getText() + (dot.getText()).toString();
                        history.setText(on);
                        history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                        resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);

                    }
                }

            }
        });

//        Operators

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=(String) history.getText();
                if(s.charAt(s.length()-1)=='+'|s.charAt(s.length()-1)=='-'|s.charAt(s.length()-1)=='÷'|s.charAt(s.length()-1)=='×'|s.charAt(s.length()-1)=='.'){
                    s=s.substring(0, s.length() - 1);

                }
                history.setVisibility(View.VISIBLE);
                s+='÷';
                resulttv.setTextColor( getResources().getColor(R.color.gray));
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                history.setText(s);



            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=(String) history.getText();
                if(s.charAt(s.length()-1)=='+'|s.charAt(s.length()-1)=='-'|s.charAt(s.length()-1)=='÷'|s.charAt(s.length()-1)=='×'|s.charAt(s.length()-1)=='.'){
                    s=s.substring(0, s.length() - 1);

                }
                history.setVisibility(View.VISIBLE);
                s+='+';
                resulttv.setTextColor( getResources().getColor(R.color.gray));
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);

                history.setText(s);


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=(String) history.getText();
                if(s.charAt(s.length()-1)=='+'|s.charAt(s.length()-1)=='-'|s.charAt(s.length()-1)=='÷'|s.charAt(s.length()-1)=='×'|s.charAt(s.length()-1)=='.'){
                    s=s.substring(0, s.length() - 1);

                }
                history.setVisibility(View.VISIBLE);
                s+='-';
                resulttv.setTextColor( getResources().getColor(R.color.gray));
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                history.setText(s);



            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=(String) history.getText();
                if(s.charAt(s.length()-1)=='+'|s.charAt(s.length()-1)=='-'|s.charAt(s.length()-1)=='÷'|s.charAt(s.length()-1)=='×'|s.charAt(s.length()-1)=='.'){
                    s=s.substring(0, s.length() - 1);

                }
                history.setVisibility(View.VISIBLE);
                s+='×';
                resulttv.setTextColor( getResources().getColor(R.color.gray));
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                history.setText(s);



            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=history.getText().toString();
                String sub,ss;
                if(s.equals("0")) {
                    ;
                }
                else {
                    int p = s.lastIndexOf('+');
                    int mult = s.lastIndexOf('×');
                    int min = s.lastIndexOf('-');
                    int div = s.lastIndexOf('÷');
                    int max1, max2;
                    String  oper="";
                    max1 = Math.max(p, mult);
                    max2 = Math.max(min, div);
                    max1 = Math.max(max1, max2);
                    if (max1 == -1){
                        sub=s;
                        ss="";
                    }
                    else{
                        char oper1= s.charAt(max1);
                        oper+=oper1;
                        sub = s.substring(max1+1,s.length());
                        ss=s.substring(0,max1);

                    }

                    if(sub.length()==0){
                        ;
                    }
                    else {
                        if(sub.substring(sub.length() - 1).equals(".")){
                            sub=sub.substring(0,sub.length()-1);
                        }
                        double f=Double.parseDouble(sub);
                        f/=100;
                        ss+=oper;
                        String re=Double.toString(f);
                        int indexdot= re.indexOf('.');
                        int afterdot=re.length()-indexdot+1;
                        int indexsubdot=sub.indexOf('.');
                        int subafterdot =sub.length()-indexsubdot+1;
                        if(sub.contains(".")){
                            if(indexdot==re.length()-2) {
                                if(re.charAt(indexdot+1)=='0'){
                                    re=re.substring(0,indexdot);
                                }
                            }
                            else if(afterdot>subafterdot+2) {
                                re=re.substring(0,indexdot+4);
                            }
                            else{

                                ;
                            }

                        }

                        else{
                            if(indexdot==re.length()-2) {
                                if(re.charAt(indexdot+1)=='0'){
                                    re=re.substring(0,indexdot);
                                }
                            }

                        }
                        ss+=re;


                    }
                    resulttv.setTextColor( getResources().getColor(R.color.gray));
                    history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                    resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                    history.setText(ss);
                    Result();

                } }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (history.getText().toString().equals("0")){
                    ;
                }
                else{
                    if((history.getText().toString().length()>=11)&(history.getText().toString().length()<18)){
                        sizee-=2.5;
                    }
                    else{
                        sizee=30;
                    }
                    if(resulttv.getText().toString().length()>13){
                        resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,35);
                    }
                    else{
                        resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);

                    }
                    history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                    resulttv.setTextColor( getResources().getColor(R.color.black));
                }


            }
        });



        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resulttv.setTextColor( getResources().getColor(R.color.black));
                history.setText("0");
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                history.setVisibility(View.INVISIBLE);
                sizee=50;
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                resulttv.setText("0");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String on= (String) history.getText();
                if (on.length()==0|on.length()==1){
                    history.setText("0");
                    history.setVisibility(View.INVISIBLE);
                    resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                    resulttv.setTextColor(getResources().getColor(R.color.black));
                    resulttv.setText("0");
                }
                else {
                    on = on.substring(0, on.length() - 1);
                    if((on.length()>=11)&(on.length()<18)){
                        sizee+=2.5;

                    }
                    else{
                        sizee=50;

                    }
                    resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                    history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                    history.setText(on);
                    Result();
                }
            }
        });


    }


    public void writeinhistory(MaterialButton x){
        if ((history.getText()).toString().equals("0")) {
            if (x==zero){

                ;
            }
            else{
                String on = x.getText().toString();
                if((on.length()>=11)&(on.length()<18)){
                    sizee-=2.5;
                }
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                history.setVisibility(View.VISIBLE);
                history.setText(on);
                history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
                resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                resulttv.setTextColor( getResources().getColor(R.color.gray));
            }
        } else {
            history.setVisibility(View.VISIBLE);
            String on = history.getText() + (x.getText()).toString();
            if((on.length()>=11)&(on.length()<18)){
                sizee-=2.5;
            }
            history.setTextSize(TypedValue.COMPLEX_UNIT_DIP,sizee);
            resulttv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
            history.setText(on);
            resulttv.setTextColor( getResources().getColor(R.color.gray));
        }
        Result();

    }
    public void Result(){
        String history_text=history.getText().toString();
        if(history_text.equals("0")){
            ;
        }
        else{
            String exp= history_text.replace('-','–');
            exp= history_text.replace('÷','/');
            exp= history_text.replace('×','*');

            Expression e=new Expression(exp);
            String answer ="= "+Double.toString(e.calculate());
            int inddot=answer.indexOf(".");
            if(answer.contains(".")){
                if(inddot==answer.length()-2) {
                    if(answer.charAt(inddot+1)=='0'){
                        answer=answer.substring(0,inddot);
                    }
                }}
            if (answer.equals("= NaN")){
                answer="= Error";
            }

            resulttv.setText(answer);

        }

    }
}

