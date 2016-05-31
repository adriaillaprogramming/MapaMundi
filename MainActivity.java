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


        final TextView playerPoints1 = (TextView) findViewById(R.id.PlayerPoints1);
        TextView playerPoints2 = (TextView) findViewById(R.id.PlayerPoints2);
        TextView playerPoints3 = (TextView) findViewById(R.id.PlayerPoints3);
        TextView playerPoints4 = (TextView) findViewById(R.id.PlayerPoints4);

        //Players' points ints

        //Punts
        int pp1 = 0;
        int pp2 = 0;
        int pp3 = 0;
        int pp4 = 0;

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
                pp4++;
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
