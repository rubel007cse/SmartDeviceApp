package bd.ac.seu.smartdeviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        int catchedValue = getIntent().getIntExtra("mykey",100);


        ImageView iv = findViewById(R.id.showImage);
        TextView tv = findViewById(R.id.mytext);


        if(catchedValue == 1) {
            iv.setImageResource(R.drawable.neymar);
            tv.setText("Neymar");
        } else if(catchedValue == 2){
            iv.setImageResource(R.drawable.messi);
            tv.setText("Messi");
        } else if( catchedValue == 3) {
            iv.setImageResource(R.drawable.blockchain);
            tv.setText("Blockchain");
        } else if (catchedValue == 4) {
            iv.setImageResource(R.drawable.mr);
            tv.setText("Mosharrof Rubel");
        } else {
            iv.setImageResource(R.drawable.rokomari);
        }


    }
}
