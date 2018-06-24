package bd.ac.seu.smartdeviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsOfSEU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_seu);


        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText et = findViewById(R.id.myname);

                TextView showTxt = findViewById(R.id.showingText);
                showTxt.setText("Your name is : "+et.getText().toString());



            }
        });



    }
}
