package com.example.deepakgautam.basic1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by deepak gautam on 13-02-2016.
 */

public class menu extends ListActivity
{
      String  options[]={"MainActivity","buttons","option1","pption2","option3","option4","option5","option6"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(menu.this,android.R.layout.simple_list_item_activated_1,options));
    }


    protected void onListItemClick(ListView l,View v,int position ,long id)
    {
        super. onListItemClick( l,v,position ,id);
        String chosed_option=options[position];

        try
        {
            Class our_class=Class.forName("com.example.deepakgautam.basic1." + chosed_option);
            Intent own_intentent=new Intent(menu.this,our_class);
               startActivity(own_intentent);

        }
        catch(ClassNotFoundException e)
        {
          e.printStackTrace();
        }
    }
}


