package bd.ac.seu.smartdeviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Varsities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varsities);


        String [] varsity = {"SEU", "NSU", "EWU"};
        String [] locations = {"Banani", "Bashundhara", "BTV"};
        int [] img = {R.drawable.neymar, R.drawable.blockchain, R.drawable.messi};


        ListView listView = findViewById(R.id.mylistview);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(
                Varsities.this, img, varsity, locations
        );

        listView.setAdapter(myCustomAdapter);


    }
}
