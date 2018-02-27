package edu.sjsu.delmas.isabelle.usingservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a handle of the two buttons
        Button startServiceButton = (Button) findViewById(R.id.startServiceButton);
        Button stopServiceButton = (Button) findViewById(R.id.StopServiceButton);

        // Creates a listener for onClick
        startServiceButton.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v){
              startService(new Intent(MainActivity.this, MyService.class));
          }
        });

        // Creates a listener for onClick
        stopServiceButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });
    }
}
