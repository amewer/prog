package com.example.webuy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ListeMembresAdapter extends BaseAdapter {

    private final Context context;
    ArrayList<String> membres;


    public ListeMembresAdapter(ArrayList<String> membres, Context applicationContext) {
        this.context=applicationContext;
        this.membres=membres;
    }

    @Override
    public int getCount() {
        return membres.size();
    }

    @Override
    public Object getItem(int position) {
        return membres.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.list_items_magasins, null);
        }

        //ImageView logo = itemView.findViewById(R.id.imageView);
        final TextView nomOffre = (TextView) itemView.findViewById(R.id.titreArticle);
        //TextView adresseMagasin = (TextView) itemView.findViewById(R.id.textView2);

        nomOffre.setText(membres.get(position));


        return itemView;
    }
}
