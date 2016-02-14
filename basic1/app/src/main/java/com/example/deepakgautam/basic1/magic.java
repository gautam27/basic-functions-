package com.example.deepakgautam.basic1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by deepak gautam on 14-02-2016.
 */
public class magic extends Activity  implements View.OnClickListener
{
    EditText etxt;
    Button btn;
    ToggleButton tbtn;
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magic);
        initialise();
        tbtn.setOnClickListener(this);
        btn.setOnClickListener(this);
    }


    private void initialise() {
        btn = (Button) findViewById(R.id.magicbt);
        tbtn = (ToggleButton) findViewById(R.id.magictbt);
        tv = (TextView) findViewById(R.id.magictv);

        etxt = (EditText) findViewById(R.id.etcommand);
    }


//  single onclick listner for all the buttons
    // for this just need to implement class View.OnClickListener
    // and override the method onClick(View v)

    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.magicbt:

                String match = etxt.getText().toString();

                if (match.contentEquals("left")) {
                    tv.setGravity(Gravity.LEFT);
                } else if (match.contentEquals("right")) {
                    tv.setGravity(Gravity.RIGHT);
                } else if (match.contentEquals("center")) {
                    tv.setGravity(Gravity.CENTER);

                } else if (match.contentEquals("magic")) {
                    Random rand_var = new Random();

                    tv.setText("random magic start");
                    tv.setTextSize(rand_var.nextInt(75));

                    tv.setTextColor(Color.rgb(rand_var.nextInt(256), rand_var.nextInt(256), rand_var.nextInt(256)));

                    int var = rand_var.nextInt(3);
                    switch (var) {
                        case 0:
                            tv.setGravity(Gravity.LEFT);
                            break;
                        case 1:
                            tv.setGravity(Gravity.RIGHT);
                            break;
                        case 2:
                            tv.setGravity(Gravity.CENTER);
                            break;
                    }
                } else {
                    tv.setText("invalid input given ");


                }

                break;

            case R.id.magictbt:
                if (tbtn.isChecked()) {
                    etxt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    etxt.setInputType(InputType.TYPE_CLASS_TEXT);
                }
                break;
        }
    }

}


