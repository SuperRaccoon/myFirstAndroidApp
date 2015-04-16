package com.example.zekun.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class gameStart extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_game_start);
        setContentView(R.layout.activity_game_start);
        Intent username=getIntent();

        String user=username.getStringExtra(ChooseQuiz.name);

        TextView myText=new TextView(this);
        myText.setTextSize(20);
        myText.setText(user+" is playing the best game ever!");
        String myMessage=(user+" is playing the best game ever!");
        TextView myDisplayTV= (TextView) findViewById(R.id.displayThis);
        myDisplayTV.setText(myMessage);

        //setContentView(findViewById(R.id.userDisplayMessage), myMessage);


    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
