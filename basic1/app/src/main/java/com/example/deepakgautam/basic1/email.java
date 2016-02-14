package com.example.deepakgautam.basic1;

/**
 * Created by deepak gautam on 14-02-2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class email extends Activity implements View.OnClickListener {

    EditText personsEmail, intro, personsName, stupidThings, hatefulAction,
            outro;
    String emailAdd, beginning, name, stupidAction, hatefulAct, out;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        initializeVars();
        sendEmail.setOnClickListener(this);
    }

    private void initializeVars() {
        // TODO Auto-generated method stub
        personsEmail = (EditText) findViewById(R.id.etEmails);
        intro = (EditText) findViewById(R.id.etIntro);
        personsName = (EditText) findViewById(R.id.etName);
        stupidThings = (EditText) findViewById(R.id.etThings);
        hatefulAction = (EditText) findViewById(R.id.etAction);
        outro = (EditText) findViewById(R.id.etOutro);
        sendEmail = (Button) findViewById(R.id.bSentEmail);
    }

    public void onClick(View v)
    {
        // TODO Auto-generated method stub

        convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
        String send_add[] = { emailAdd };
        String message = "Well hello "
                + name
                + " I just wanted to say "
                + beginning
                + ".  Not only that but I hate when you "
                + stupidAction
                + ", that just really makes me crazy.  I just want to make you "
                + hatefulAct
                + ".  Welp, thats all I wanted to chit-chatter about, oh and"
                + out
                + ".  Oh also if you get bored you should check out www.mybringback.com"
                + '\n' + "PS. I think I love you...   :(";

        /// messege is generated above

        // now we have to create a  connectoion of our application with one  of the existing
        // mainling application in our device

        Intent myintent=  new Intent(Intent.ACTION_SEND);


        myintent.putExtra(android.content.Intent.EXTRA_EMAIL,send_add);
        myintent.putExtra(android.content.Intent.EXTRA_SUBJECT,"I LOVE U");
        myintent.setType("plain/text");
        myintent.putExtra(android.content.Intent.EXTRA_SUBJECT,message);
        startActivity(myintent);


    }

    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
        // TODO Auto-generated method stub
        emailAdd = personsEmail.getText().toString();
        beginning = intro.getText().toString();
        name = personsName.getText().toString();
        stupidAction = stupidThings.getText().toString();
        hatefulAct = hatefulAction.getText().toString();
        out = outro.getText().toString();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}