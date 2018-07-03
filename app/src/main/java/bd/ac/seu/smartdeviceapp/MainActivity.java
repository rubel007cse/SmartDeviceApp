package bd.ac.seu.smartdeviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button list = findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(
                        MainActivity.this,
                        Varsities.class
                ));


            }
        });









    }


    public void login(View v){

        Intent i = new Intent(MainActivity.this,
                DetailsOfSEU.class);
        startActivity(i);

    }


    void one(View v){

        Intent go = new Intent(MainActivity.this, Numbers.class);
        go.putExtra("mykey",1);
        startActivity(go);

    }

    void two(View v){

        Intent go = new Intent(MainActivity.this, Numbers.class);
        go.putExtra("mykey",2);
        startActivity(go);

    }


    void three(View v){

        Intent go = new Intent(MainActivity.this, Numbers.class);
        go.putExtra("mykey",3);
        startActivity(go);

    }

    void four(View v){
        Intent go = new Intent(MainActivity.this, Numbers.class);
        go.putExtra("mykey",4);
        startActivity(go);

    }




















}
