    package com.example.hp.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button add,sub,mul,div,clear,equal;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    TextView tv;

    String s1="",s2="",s3="",s4="",result="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal = (Button) findViewById(R.id.equal);
        clear = (Button) findViewById(R.id.clear);
        tv = (TextView) findViewById(R.id.tv);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            s1 = tv.getText()+"1";
                tv.setText(s1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s1 = tv.getText()+"2";
                tv.setText(s1);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s1 = tv.getText()+"3";
                tv.setText(s1);

            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"4";
                tv.setText(s1);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"5";
                tv.setText(s1);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"6";
                tv.setText(s1);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"7";
                tv.setText(s1);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"8";
                tv.setText(s1);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"9";
                tv.setText(s1);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = tv.getText()+"0";
                tv.setText(s1);
            }
        });
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            s2 = ""+tv.getText();
                tv.setText("");
                s3="+";

            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s2 = ""+tv.getText();
                tv.setText("");
                s3="-";

            }
        });
        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s2 = ""+tv.getText();
                tv.setText("");
                s3="*";

            }
        });
        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s2 = ""+tv.getText();
                tv.setText("");
                s3="/";

            }
        });

        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
             result = calc(s3);
                tv.setText(result);
            }

        });
        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tv.setText("");
            }

        });
    }

    String calc (String s)
    {
        s4=""+tv.getText();
        double a,b,c=0;
        a=Double.parseDouble(s2);
        b=Double.parseDouble(s4);

        if (s.equals("+"))
        {
        c=a+b;
        }
        if (s.equals("-"))
        {
            c=a-b;
        }
        if (s.equals("*"))
        {
            c=a*b;
        }
        if (s.equals("/"))
        {
            c=a/b;
        }
        return (String.valueOf(c));
    }

        //s1 =(String)tv.getText();

    }


