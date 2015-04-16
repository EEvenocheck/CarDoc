package com.cardoc.asc1.cardoc;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.ImageView;


public class StartScreen extends ActionBarActivity {

    TextView existingCar;
    Button addCar;
    TextView make;
    TextView model;
    TextView year;
    ImageView image;
    Button getInfo;

    OnClickListener buttonListener = new OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),AddNewCar.class);
            startActivity(intent);
        }
    };
    OnClickListener buttonListener2 = new OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),CarInfo.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        existingCar = (TextView)findViewById(R.id.ExistingCars);
        addCar = (Button)findViewById(R.id.addCar);
        addCar.setOnClickListener(buttonListener);
        image = (ImageView) findViewById(R.id.red_car);
        getInfo = (Button)findViewById(R.id.get_info);
        getInfo.setOnClickListener(buttonListener2);

        Bundle bundle = getIntent().getExtras();
        String value2 = bundle.getString("carMake");
        String value3 = bundle.getString("carModel");
        String value4 = bundle.getString("carYear");
        make = (TextView)findViewById(R.id.car_make);
        make.setText(value2);
        model=(TextView)findViewById(R.id.car_model);
        model.setText(value3);
        year= (TextView)findViewById(R.id.car_year);
        year.setText(value4);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_screen, menu);
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
