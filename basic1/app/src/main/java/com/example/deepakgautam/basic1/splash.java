package com.example.deepakgautam.basic1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by deepak gautam on 12-02-2016.
 */
public class splash extends AppCompatActivity {

MediaPlayer oursong;
     @Override
     protected void onCreate(Bundle deepak) {
          super.onCreate(deepak);
          setContentView(R.layout.splash);

          oursong= MediaPlayer.create(splash.this,R.raw.tune1);
             oursong.start();

          //  creating thread for the timer of the spash screen
          Thread timer = new Thread() {
               public void run() {
                    try {
                         sleep(5000);//sleep forthe 5 sec and than go to the   finally bloch from where set next
                         // activity class, in the Android manifest file we have   given activity name
                         // to different java class , just set current activity as the activity of the
                         // mainactivity class


                    } catch (InterruptedException e) {
                         e.printStackTrace();

                    } finally {
                         Intent gotostartingpoint = new Intent("com.example.deepakgautam.basic1.MENU");//
                         // inside the INTENT the string is same which we have set in the manifest file
                         // for the menu class

                         startActivity(gotostartingpoint);

                    }
               }
          };
          timer.start();

     }

     @Override
     protected void onPause() {// as soon as we  set the activity class  as another class onpause method is called
          // and we finish the old activity class (splas class) permanently so that if we use
          //  back ward key than again splash screen will not open again
          super.onPause();
          oursong.stop();
          finish();
     }


}
