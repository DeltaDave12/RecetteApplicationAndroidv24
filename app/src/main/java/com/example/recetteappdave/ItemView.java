package com.example.recetteappdave;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemView extends LinearLayout {

    private ImageView imageView;
    private TextView textView;

    public ItemView(Context context) {
        super(context);
        init();
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        //button id 7 et 9 commme imageView et textView
        View view = inflater.inflate(R.layout.itemxml, this, true);
        imageView = view.findViewById(R.id.itemImage);
        textView = view.findViewById(R.id.itemName);
    }

    public void setItem(Item item) {
        imageView.setImageResource(item.getImgref());
        textView.setText(item.getItemName());
    }
}
