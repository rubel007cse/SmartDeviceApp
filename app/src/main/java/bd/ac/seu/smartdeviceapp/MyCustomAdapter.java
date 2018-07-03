package bd.ac.seu.smartdeviceapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyCustomAdapter extends BaseAdapter {


    String [] varsities;
    String [] locations;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;



    public MyCustomAdapter(
            Activity activity, int [] varsityImages,
            String [] varsityNames, String [] varsityLocation
    ) {

        context = activity;
        imageId = varsityImages;
        varsities = varsityNames;
        locations = varsityLocation;


        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return varsities.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView h_varsity, h_location;
        ImageView h_image;

    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {



        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.mysingleitem, null);

        holder.h_varsity = rowView.findViewById(R.id.si_varsityName);
        holder.h_location = rowView.findViewById(R.id.si_varsityLoc);
        holder.h_image = rowView.findViewById(R.id.si_varsityImg);

        holder.h_varsity.setText(varsities[position]);
        holder.h_location.setText(locations[position]);
        holder.h_image.setImageResource(imageId[position]);



        return rowView;
    }



}
