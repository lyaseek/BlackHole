package com.example.android.blackhole;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int point = 100;
    String result = "";
    boolean a1 = false;
    boolean a2 = false;
    boolean a3 = false;
    boolean a4 = false;
    boolean a5 = false;
    boolean a6 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1_b = (Button) findViewById(R.id.button1_b);
        final Button button1_c = (Button) findViewById(R.id.button1_c);
        final TextView quest1 = (TextView) findViewById(R.id.quest1);
        final Button button1_a = (Button) findViewById(R.id.button1_a);
        button1_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest1.setText("");
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest1.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest1.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button1_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest1.setText("");
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest1.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest1.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button1_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest1.setText("");
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest1.setText(getResources().getString(R.string.correct));
                quest1.setTextColor(getResources().getColor(R.color.colorCorrect));
                button1_a.setClickable(false);
                button1_b.setClickable(false);
                button1_c.setClickable(false);
                a1 = true;
                if (a2 && a3 && a4 && a5 && a6) {
                    result();
                }
            }
        });
        final Button button2_b = (Button) findViewById(R.id.button2_b);
        final Button button2_c = (Button) findViewById(R.id.button2_c);
        final TextView quest2 = (TextView) findViewById(R.id.quest2);
        final Button button2_a = (Button) findViewById(R.id.button2_a);
        button2_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest2.setText("");
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest2.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest2.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button2_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest2.setText("");
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest2.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest2.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button2_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest1.setText("");
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest2.setText(getResources().getString(R.string.correct));
                quest2.setTextColor(getResources().getColor(R.color.colorCorrect));
                button2_a.setClickable(false);
                button2_b.setClickable(false);
                button2_c.setClickable(false);
                a2 = true;
                if (a1 && a3 && a4 && a5 && a6) {
                    result();
                }
            }
        });
        final Button button3_b = (Button) findViewById(R.id.button3_b);
        final Button button3_c = (Button) findViewById(R.id.button3_c);
        final TextView quest3 = (TextView) findViewById(R.id.quest3);
        final Button button3_a = (Button) findViewById(R.id.button3_a);
        button3_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest3.setText("");
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest3.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest3.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button3_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest3.setText("");
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest3.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest3.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button3_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest3.setText("");
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest3.setText(getResources().getString(R.string.correct));
                quest3.setTextColor(getResources().getColor(R.color.colorCorrect));
                button3_a.setClickable(false);
                button3_b.setClickable(false);
                button3_c.setClickable(false);
                a3 = true;
                if (a1 && a2 && a4 && a5 && a6) {
                    result();
                }
            }
        });
        final Button button4_b = (Button) findViewById(R.id.button4_b);
        final Button button4_c = (Button) findViewById(R.id.button4_c);
        final TextView quest4 = (TextView) findViewById(R.id.quest4);
        final Button button4_a = (Button) findViewById(R.id.button4_a);
        button4_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest4.setText("");
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest4.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest4.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button4_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest4.setText("");
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest4.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest4.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button4_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest4.setText("");
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest4.setText(getResources().getString(R.string.correct));
                quest4.setTextColor(getResources().getColor(R.color.colorCorrect));
                button4_a.setClickable(false);
                button4_b.setClickable(false);
                button4_c.setClickable(false);
                a4 = true;
                if (a1 && a2 && a3 && a5 && a6) {
                    result();
                }
            }
        });
        final Button button5_b = (Button) findViewById(R.id.button5_b);
        final Button button5_c = (Button) findViewById(R.id.button5_c);
        final TextView quest5 = (TextView) findViewById(R.id.quest5);
        final Button button5_a = (Button) findViewById(R.id.button5_a);
        button5_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest5.setText("");
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest5.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest5.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button5_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest5.setText("");
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest5.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest5.setTextColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button5_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest5.setText("");
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest5.setText(getResources().getString(R.string.correct));
                quest5.setTextColor(getResources().getColor(R.color.colorCorrect));
                button5_a.setClickable(false);
                button5_b.setClickable(false);
                button5_c.setClickable(false);
                a5 = true;
                if (a1 && a2 && a3 && a4 && a6) {
                    result();
                }
            }
        });
        final Button button6_b = (Button) findViewById(R.id.button6_b);
        final Button button6_c = (Button) findViewById(R.id.button6_c);
        final TextView quest6 = (TextView) findViewById(R.id.quest6);
        final Button button6_a = (Button) findViewById(R.id.button6_a);
        button6_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest6.setText("");
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest6.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest6.setTextColor(getResources().getColor(R.color.colorIncorrect));
                Toast.makeText(getApplicationContext(), "Please, answer all questions correctly!", Toast.LENGTH_LONG).show();

            }
        });
        button6_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest6.setText("");
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                quest6.setText(getResources().getString(R.string.incorrect));
                point -= 5;
                quest6.setTextColor(getResources().getColor(R.color.colorIncorrect));
                Toast.makeText(getApplicationContext(), "Please, answer all questions correctly!", Toast.LENGTH_LONG).show();

            }
        });
        button6_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                quest6.setText("");
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                quest6.setText(getResources().getString(R.string.correct));
                quest6.setTextColor(getResources().getColor(R.color.colorCorrect));
                button6_a.setClickable(false);
                button6_b.setClickable(false);
                button6_c.setClickable(false);
                a6 = true;
                if (a1 && a2 && a3 && a4 && a5) {
                    result();
                } else {
                    Toast.makeText(getApplicationContext(), "Please, answer all questions correctly!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void result() {
        {
            if (point < 0) {
                point = 0;
                result = "Try again!";
            } else if (point <= 90) {
                result = "Not bad, but you can better.";
            } else {
                result = "Excellent result!";
            }
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("point", point);
            intent.putExtra("result", result);
            startActivityForResult(intent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        RadioGroup rg_1 = (RadioGroup) findViewById(R.id.rg_1);
        RadioGroup rg_2 = (RadioGroup) findViewById(R.id.rg_2);
        RadioGroup rg_3 = (RadioGroup) findViewById(R.id.rg_3);
        RadioGroup rg_4 = (RadioGroup) findViewById(R.id.rg_4);
        rg_1.clearCheck();
        rg_2.clearCheck();
        rg_3.clearCheck();
        rg_4.clearCheck();
        this.recreate();
    }
}