package com.cardoc.asc1.cardoc;


import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;


public class AddNewCar extends ActionBarActivity {

    TextView newCar;
    EditText make;
    EditText model;
    EditText year;
    EditText mileage;
    EditText oil;
    EditText airFilter;
    EditText wheel;
    EditText brake;
    EditText tran;
    Button addCar1;


    OnClickListener buttonListener = new OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),CarInfo.class);
            intent.putExtra("carMake",make.getText().toString());
            intent.putExtra("carModel",model.getText().toString());
            intent.putExtra("carYear",year.getText().toString());
            intent.putExtra("carMileage",mileage.getText().toString());
            intent.putExtra("carOil",oil.getText().toString());
            intent.putExtra("carAirFilter",airFilter.getText().toString());
            intent.putExtra("carWheel",wheel.getText().toString());
            intent.putExtra("carBrake",brake.getText().toString());
            intent.putExtra("carTran",tran.getText().toString());
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_car);
       newCar=(TextView)findViewById(R.id.addCar);
        make=(EditText)findViewById(R.id.car_make);
        model=(EditText)findViewById(R.id.car_model);
        year=(EditText)findViewById(R.id.car_year);
        mileage=(EditText)findViewById(R.id.car_mileage);
        oil=(EditText)findViewById(R.id.last_oil);
        airFilter=(EditText)findViewById(R.id.last_air);
       wheel=(EditText)findViewById(R.id.last_wheel);
        brake=(EditText)findViewById(R.id.last_brake);
       tran=(EditText)findViewById(R.id.last_tran);
        addCar1=(Button)findViewById(R.id.addNewCar);
        addCar1.setOnClickListener(buttonListener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_new_car, menu);
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
