package com.shanioob.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button spotBtn,scrBtn,libBtn,bldBtn,xyzBtn,myBtn;
    String appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotBtn = (Button)findViewById(R.id.btnSpotify);
        scrBtn = (Button)findViewById(R.id.btnScores);
        libBtn= (Button)findViewById(R.id.btnLibrary);
        bldBtn= (Button)findViewById(R.id.btnBuild);
        xyzBtn= (Button)findViewById(R.id.btnXYZ);
        myBtn= (Button)findViewById(R.id.btnMyApp);
    }

    public void spotifyOnClick(View v){
        appName = "Spotify Streamer";
        toastDisplay(appName);
    }

    public void scoresOnClick(View v){
        appName = "Scores";
        toastDisplay(appName);
    }

    public void libraryOnClick(View v){
        appName = "Library";
        toastDisplay(appName);
    }

    public void buildItOnClick(View v){
        appName = "Build It Bigger";
        toastDisplay(appName);
    }

    public void xyzOnClick(View v){
        appName = "XYZ Reader";
        toastDisplay(appName);
    }

    public void myAppOnClick(View v){
        appName = "My Own";
        toastDisplay(appName);
    }

    public void toastDisplay(String appName){
        Toast.makeText(this,"This button will show my "+appName+" app!",Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
