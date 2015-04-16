package com.cardoc.asc1.cardoc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;


public class CarInfo extends ActionBarActivity {

    //TextView mTextView;
    TextView make;
    TextView model;
    TextView year;
    TextView mileage;
    TextView oil;
    TextView airFilter;
    TextView wheel;
    TextView brake;
    TextView tran;
    TextView makeText;
    TextView modelText;
    TextView yearText;
    TextView mileageText;
    TextView oilText;
    TextView airFilterText;
    TextView wheelText;
    TextView brakeText;
    TextView tranText;
    Button home;
    Button edit;
    TextView oilC;
    TextView airC;
    TextView wheelC;
    TextView brakeC;
    TextView tranC;


    View.OnClickListener buttonListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),StartScreen.class);
            intent.putExtra("carMake",make.getText().toString());
            intent.putExtra("carModel",model.getText().toString());
            intent.putExtra("carYear",year.getText().toString());
            startActivity(intent);
        }
    };

    View.OnClickListener buttonListener2 = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),EditCar.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);

        makeText = (TextView)findViewById(R.id.car_make_text);
        modelText = (TextView)findViewById(R.id.car_model_text);
        yearText = (TextView)findViewById(R.id.car_year_text);
        mileageText = (TextView)findViewById(R.id.car_mileage_text);
        oilText = (TextView)findViewById(R.id.car_oil_text);
        airFilterText = (TextView)findViewById(R.id.car_air_text);
        wheelText = (TextView)findViewById(R.id.car_wheel_text);
        brakeText = (TextView)findViewById(R.id.car_brake_text);
        tranText = (TextView)findViewById(R.id.car_tran_text);
        Bundle bundle = getIntent().getExtras();
        String value2 = bundle.getString("carMake");
        String value3 = bundle.getString("carModel");
        String value4 = bundle.getString("carYear");
        String value5 = bundle.getString("carMileage");
        String value6 = bundle.getString("carOil");
        String value7 = bundle.getString("carAirFilter");
        String value8 = bundle.getString("carWheel");
        String value9 = bundle.getString("carBrake");
        String value10 = bundle.getString("carTran");

        make = (TextView)findViewById(R.id.car_make);
        make.setText(value2);
        model=(TextView)findViewById(R.id.car_model);
        model.setText(value3);
        year= (TextView)findViewById(R.id.car_year);
        year.setText(value4);
        mileage= (TextView)findViewById(R.id.car_mileage);
        mileage.setText(value5);
        oil= (TextView)findViewById(R.id.last_oil);
        oil.setText(value6);
        airFilter= (TextView)findViewById(R.id.last_air);
       airFilter.setText(value7);
        wheel= (TextView)findViewById(R.id.last_wheel);
        wheel.setText(value8);
        brake= (TextView)findViewById(R.id.last_brake);
       brake.setText(value9);
        tran= (TextView)findViewById(R.id.last_tran);
        tran.setText(value10);

        home =(Button)findViewById(R.id.go_home);
        home.setOnClickListener(buttonListener);

        edit =(Button)findViewById(R.id.go_edit);
        edit.setOnClickListener(buttonListener2);



        int miles = Integer.parseInt(mileage.getText().toString());
        int oilT = Integer.parseInt(oil.getText().toString());
        int airFilterT = Integer.parseInt(airFilter.getText().toString());
        int wheelT = Integer.parseInt(wheel.getText().toString());
        int brakeT = Integer.parseInt(brake.getText().toString());
        int tranT = Integer.parseInt(tran.getText().toString());


        if((miles-oilT)>3000){
            oilC = (TextView)findViewById(R.id.oilC);
        oilC.setText("NEED OIL CHANGE");}
        else{
            oilC = (TextView)findViewById(R.id.oilC);
        oilC.setText((oilT+3000)-miles + " miles tell next oil change");}

        if((miles-airFilterT)>6000){
            airC = (TextView)findViewById(R.id.airC);
            airC.setText("NEED AIR FILTER CHANGE");}
        else{
            airC = (TextView)findViewById(R.id.airC);
            airC.setText(airFilterT+6000-miles + " miles tell next air filter change");}

        if((miles-wheelT)>12000){
            wheelC = (TextView)findViewById(R.id.wheelC);
            wheelC.setText("NEED WHEEL REALIGNMENT");}
        else{
            wheelC = (TextView)findViewById(R.id.wheelC);
            wheelC.setText(wheelT+12000-miles + " miles tell next wheel realignment");}

        if((miles-brakeT)>12000){
            brakeC = (TextView)findViewById(R.id.brakeC);
            brakeC.setText("NEED BRAKE CHANGE");}
        else{
            brakeC = (TextView)findViewById(R.id.brakeC);
            brakeC.setText(brakeT+12000-miles + " miles tell next brake change");}

        if((miles-tranT)>30000){
            tranC = (TextView)findViewById(R.id.tranC);
            tranC.setText("NEED TRANSMISSION FLUID CHANGE");}
        else{
            tranC = (TextView)findViewById(R.id.tranC);
            tranC.setText(tranT+30000-miles + " miles tell next transmission fluid change");}





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_car_info, menu);
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
