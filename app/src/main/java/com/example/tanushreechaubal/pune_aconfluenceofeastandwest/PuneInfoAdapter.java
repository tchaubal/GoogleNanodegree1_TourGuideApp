package com.example.tanushreechaubal.pune_aconfluenceofeastandwest;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TanushreeChaubal on 3/7/18.
 */

public class PuneInfoAdapter extends ArrayAdapter<PuneInfo> {

    private int mColorResourceId;

    public PuneInfoAdapter(Activity context, ArrayList<PuneInfo> info, int colorResourceId) {
        super(context, 0, info);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item_three_textviews, parent,false);
        }

        PuneInfo currentInfo = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name_TextView);
        name.setText(currentInfo.getName());

        TextView location = (TextView) listItemView.findViewById(R.id.location_TextView);
        location.setText(currentInfo.getLocation());

        TextView description = (TextView) listItemView.findViewById(R.id.description_TextView);
        description.setText(currentInfo.getDescription());

        ImageView image = (ImageView) listItemView.findViewById(R.id.list_ImageView);
        if(currentInfo.hasImage()){
            image.setImageResource(currentInfo.getImageResourceID());
        }else{
            image.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
