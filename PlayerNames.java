package com.example.android.mapamundi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerNames extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_names);

        Button accept = (Button) findViewById(R.id.changeNames);

        accept.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.changeNames):

                EditText playerInput1 = (EditText) findViewById(R.id.PlayerNameInput1);
                EditText playerInput2 = (EditText) findViewById(R.id.PlayerNameInput2);
                EditText playerInput3 = (EditText) findViewById(R.id.PlayerNameInput3);
                EditText playerInput4 = (EditText) findViewById(R.id.PlayerNameInput4);



                Intent intent = new Intent(PlayerNames.this, MainActivity.class);

                Bundle bundle1 = new Bundle();
                Bundle bundle2 = new Bundle();
                Bundle bundle3 = new Bundle();
                Bundle bundle4 = new Bundle();

                bundle1.putString("JUGADOR1", playerInput1.getText().toString());
                bundle2.putString("JUGADOR2", playerInput2.getText().toString());
                bundle3.putString("JUGADOR3", playerInput3.getText().toString());
                bundle4.putString("JUGADOR4", playerInput4.getText().toString());

                intent.putExtras(bundle1);
                intent.putExtras(bundle2);
                intent.putExtras(bundle3);
                intent.putExtras(bundle4);


                startActivity(intent);
        }
    }
}
