package edu.ufcg.es.es_front.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.ufcg.es.es_front.R;

public class CreateVehicleActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_vehicle);
        init();

    }

    private void init() {
        this.mViewHolder.vehicleBrand = findViewById(R.id.vehicle_brand);
        this.mViewHolder.vehicleModel = findViewById(R.id.vehicle_model);
        this.mViewHolder.vehicleYear = findViewById(R.id.vehicle_year);
        this.mViewHolder.vehicleOdometer = findViewById(R.id.vehicle_odometer);
        this.mViewHolder.vehicleSemanalMedia = findViewById(R.id.vehicle_semanal_media);
        this.mViewHolder.vehiclePlate = findViewById(R.id.vehicle_plate);
        this.mViewHolder.buttonSubmit = findViewById(R.id.button_submit);
        this.mViewHolder.vehicleExpirationMonth = findViewById(R.id.vehicle_expiration_month);
        this.mViewHolder.buttonSubmit.setOnClickListener(this.submitOnClickListener());
    }

    private static class ViewHolder{
        EditText vehicleBrand, vehicleModel, vehicleYear, vehicleOdometer, vehicleSemanalMedia, vehiclePlate, vehicleExpirationMonth;
        String brand, model, year, odometer, media, plate, expiration;
        Button buttonSubmit;
    }

    private View.OnClickListener submitOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        mViewHolder.brand = mViewHolder.vehicleBrand.getText().toString();
                        mViewHolder.model = mViewHolder.vehicleModel.getText().toString();
                        mViewHolder.year = mViewHolder.vehicleYear.getText().toString();
                        mViewHolder.odometer = mViewHolder.vehicleOdometer.getText().toString();
                        mViewHolder.media = mViewHolder.vehicleSemanalMedia.getText().toString();
                        mViewHolder.plate = mViewHolder.vehiclePlate.getText().toString();
                        mViewHolder.expiration = mViewHolder.vehicleExpirationMonth.getText().toString();


            }
        };
    }
}
