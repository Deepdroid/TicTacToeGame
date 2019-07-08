package com.example.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b00, b01, b02, b10, b11, b12, b20, b21, b22, exit,replay;

    private boolean p1turn = true;
    private int mcount=0;
    int sc=1;


    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView1);
        b00 = findViewById(R.id.button00);
        b01 = findViewById(R.id.button01);
        b02 = findViewById(R.id.button02);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b20 = findViewById(R.id.button20);
        b21 = findViewById(R.id.button21);
        b22 = findViewById(R.id.button22);
        exit = findViewById(R.id.button);
        replay=findViewById(R.id.button2);
        b00.setOnClickListener(this);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
            replay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Button) b00).setText("");
                    ((Button) b01).setText("");
                    ((Button) b02).setText("");
                    ((Button) b10).setText("");
                    ((Button) b11).setText("");
                    ((Button) b12).setText("");
                    ((Button) b20).setText("");
                    ((Button) b21).setText("");
                    ((Button) b22).setText("");

                    ((Button) b00).setEnabled(true);
                    ((Button) b01).setEnabled(true);
                    ((Button) b02).setEnabled(true);
                    ((Button) b10).setEnabled(true);
                    ((Button) b11).setEnabled(true);
                    ((Button) b12).setEnabled(true);
                    ((Button) b20).setEnabled(true);
                    ((Button) b21).setEnabled(true);
                    ((Button) b22).setEnabled(true);
                    p1turn = true;
                    ((TextView) tv1).setText("Player 1");
                    ((TextView) tv2).setText("Turn");


                }
            });

        ;

    }

    @Override
    public void onClick(View v) {
        if (p1turn) {
            ((Button) v).setText("X");
            ((Button) v).setEnabled(false);
            p1turn = false;
            ((TextView) tv1).setText("Player 2");
            ((TextView) tv2).setText("Turn");
            sc++;


        } else {
            ((Button) v).setText("0");
            ((Button) v).setEnabled(false);
            p1turn = true;
            ((TextView) tv1).setText("Player 1");
            ((TextView) tv2).setText("Turn");
            sc++;
        }


        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1=b00.getText().toString();
        s2=b01.getText().toString();
        s3=b02.getText().toString();
        s4=b10.getText().toString();
        s5=b11.getText().toString();
        s6=b12.getText().toString();
        s7=b20.getText().toString();
        s8=b21.getText().toString();
        s9=b22.getText().toString();
        if((s1.equals("X")&&s2.equals("X")&&s3.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s1.equals("0")&&s2.equals("0")&&s3.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s4.equals("X")&&s5.equals("X")&&s6.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s4.equals("0")&&s5.equals("0")&&s6.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s7.equals("X")&&s8.equals("X")&&s9.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s7.equals("0")&&s8.equals("0")&&s9.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s1.equals("X")&&s4.equals("X")&&s7.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s1.equals("0")&&s4.equals("0")&&s7.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s2.equals("X")&&s5.equals("X")&&s8.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s2.equals("0")&&s5.equals("0")&&s8.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s3.equals("X")&&s6.equals("X")&&s9.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s3.equals("0")&&s6.equals("0")&&s9.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s1.equals("X")&&s5.equals("X")&&s9.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s1.equals("0")&&s5.equals("0")&&s9.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }
        if((s3.equals("X")&&s5.equals("X")&&s7.equals("X")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 1 win");
            sc=1;
            mcount++;
        }
        if((s3.equals("0")&&s5.equals("0")&&s7.equals("0")))
        {
            tv2.setText("WINNER");
            tv1.setText("Player 2 win");
            sc=1;
            mcount++;
        }




        if(mcount>0)
        {
            Toast.makeText(this, "GAME FINISHED", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(sc==10)
            {

                ((TextView)tv2).setText("DRAW");
                ((TextView)tv1).setText("No Player Win");
                sc=1;

            }
            mcount=0;
        }
        if((tv2.getText().toString()).equals("WINNER"))
        {
            b00.setEnabled(false);
            b01.setEnabled(false);
            b02.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
        }
        //count=1;
        mcount=0;


    }

}
