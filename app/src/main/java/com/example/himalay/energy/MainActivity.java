package com.example.himalay.energy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private TextView fbubble;
    private Firebase mRef, mRef1, mRef2, mRef3, mRef4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView1 = findViewById(R.id.textView3);
        final TextView textView2 = findViewById(R.id.textView1);
        final TextView textView3 = findViewById(R.id.textView5);
        final TextView textView4 = findViewById(R.id.textView6);
        final TextView textView5 = findViewById(R.id.textView4);
        mRef1 = new Firebase("https://wattmeater.firebaseio.com/Your Bill");
        mRef2 = new Firebase("https://wattmeater.firebaseio.com/Watts");
        mRef3 = new Firebase("https://wattmeater.firebaseio.com/Voltage");
        mRef4 = new Firebase("https://wattmeater.firebaseio.com/Raw value of kWh");
        mRef = new Firebase("https://wattmeater.firebaseio.com/Ampear");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                textView4.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {


            }


        });


        mRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                textView3.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                textView2.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                textView1.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                textView5.setText(value);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
