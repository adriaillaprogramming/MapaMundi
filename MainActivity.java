package com.example.android.mapamundi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int pp1 = 0;
    int pp2 = 0;
    int pp3 = 0;
    int pp4 = 0;


    public static TextView playerName1;
    public static TextView playerName2;
    public static TextView playerName3;
    public static TextView playerName4;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Cast continents' buttons


        Button americaButton = (Button) findViewById(R.id.america_boto);
        Button asiaButton = (Button) findViewById(R.id.asia_boto);
        Button oceaniaButton = (Button) findViewById(R.id.oceania_boto);
        Button africaButton = (Button) findViewById(R.id.africa_boto);
        Button europaButton = (Button) findViewById(R.id.europa_boto);

        //Set onClickListener

        americaButton.setOnClickListener(this);
        asiaButton.setOnClickListener(this);
        oceaniaButton.setOnClickListener(this);
        africaButton.setOnClickListener(this);
        europaButton.setOnClickListener(this);


        //Cast players' Buttons


        Button addPoints1 = (Button) findViewById(R.id.addPoints1);
        Button addPoints2 = (Button) findViewById(R.id.addPoints2);
        Button addPoints3 = (Button) findViewById(R.id.addPoints3);
        Button addPoints4 = (Button) findViewById(R.id.addPoints4);

        //Set buttons' onClickListeners


        addPoints1.setOnClickListener(this);
        addPoints2.setOnClickListener(this);
        addPoints3.setOnClickListener(this);
        addPoints4.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();



        //CHANGING NAMES

        playerName1 = (TextView) findViewById(R.id.PlayerName1);
        playerName2 = (TextView) findViewById(R.id.PlayerName2);
        playerName3 = (TextView) findViewById(R.id.PlayerName3);
        playerName4 = (TextView) findViewById(R.id.PlayerName4);


        Intent intent2 = getIntent();
        Bundle extras1 = intent2.getExtras();

        if (extras1 != null) {

            String jugador1 = extras1.getString("JUGADOR1");
            String jugador2 = extras1.getString("JUGADOR2");
            String jugador3 = extras1.getString("JUGADOR3");
            String jugador4 = extras1.getString("JUGADOR4");

            playerName1.setText(jugador1);
            playerName2.setText(jugador2);
            playerName3.setText(jugador3);
            playerName4.setText(jugador4);

        } else {
            Toast.makeText(getApplicationContext(), "No s'han trobat els noms", Toast.LENGTH_LONG).show();
        }
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




            Intent intent = new Intent(MainActivity.this, PlayerNames.class);
            startActivity(intent);


            return true;

        } else if (id == R.id.instruccions) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {

        //CONTINENTS I PREGUNTES

        TextView pregunta = (TextView) findViewById(R.id.Targeta);


        //Strings amb preguntes

        String America1 = "Pregunta d'Amèrica 1";
        String America2 = "Pregunta d'Amèrica 2";
        String America3 = "Fenòmen d'Amèrica";
        String America4 = "Pregunta d'Amèrica 3";
        String America5 = "Pregunta d'Amèrica 4";



        //Noms
        TextView playerName1;
        TextView playerName2;
        TextView playerName3;
        TextView playerName4;

        switch (view.getId()) {
            case (R.id.america_boto):


                Random generator = new Random();
                int i = generator.nextInt(5) + 1;


                if (i == 3) {
                    pregunta.setText(America3);
                } else if (i == 1) {
                    pregunta.setText(America1);
                } else if (i == 2) {
                    pregunta.setText(America2);
                } else if (i == 4) {
                    pregunta.setText(America4);
                } else if (i == 5) {
                    pregunta.setText(America5);
                }


                break;
            case (R.id.asia_boto):
                Toast.makeText(getApplicationContext(), "Asia", Toast.LENGTH_LONG).show();
                break;
            case (R.id.oceania_boto):
                Toast.makeText(getApplicationContext(), "Oceania", Toast.LENGTH_LONG).show();
                break;
            case (R.id.africa_boto):
                Toast.makeText(getApplicationContext(), "Africa", Toast.LENGTH_LONG).show();
                break;
            case (R.id.europa_boto):
                Toast.makeText(getApplicationContext(), "Europe", Toast.LENGTH_LONG).show();
                break;
        }

        //JUGADORS I PUNTS

        //Cast players' TextViews


        TextView playerPoints1 = (TextView) findViewById(R.id.PlayerPoints1);
        TextView playerPoints2 = (TextView) findViewById(R.id.PlayerPoints2);
        TextView playerPoints3 = (TextView) findViewById(R.id.PlayerPoints3);
        TextView playerPoints4 = (TextView) findViewById(R.id.PlayerPoints4);







        switch (view.getId()) {
            case (R.id.addPoints1):

                pp1 = pp1 + 1;
                playerPoints1.setText(Integer.toString(pp1));

                break;

            case (R.id.addPoints2):

                pp2 = pp2 + 1;
                playerPoints2.setText(Integer.toString(pp2));
                break;

            case (R.id.addPoints3):

                pp3 = pp3 + 1;
                playerPoints3.setText(Integer.toString(pp3));
                break;

            case (R.id.addPoints4):

                pp4 = pp4 + 1;
                playerPoints4.setText(Integer.toString(pp4));
                break;
        }

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.mapamundi/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.mapamundi/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
