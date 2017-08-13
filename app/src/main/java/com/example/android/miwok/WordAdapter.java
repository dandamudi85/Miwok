package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danda on 27-05-2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mcolorId;

    public WordAdapter(Activity context,ArrayList<Word> words,int colorId)
    {
        super(context,0,words);
        mcolorId = colorId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView  = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.text2);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.text1);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        if(currentWord.getImageResourceId() != -1)
        {
            ImageView icon = (ImageView) listItemView.findViewById(R.id.image);
            icon.setImageResource(currentWord.getImageResourceId());
        }
        else
        {
            ImageView icon = (ImageView) listItemView.findViewById(R.id.image);
            icon.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(),mcolorId);
        textContainer.setBackgroundColor(color);

        View image = listItemView.findViewById(R.id.icon);
        image.setBackgroundColor(color);



        return listItemView;
    }
}
