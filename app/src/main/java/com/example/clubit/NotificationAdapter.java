package com.example.clubit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NotificationAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] dname;
    String[] topic;
    String[] content;

    public NotificationAdapter(Activity context, String[] dname, String[] topic, String[] content) {
        super(context, R.layout.notification_layout);
        this.context = context;
        this.dname = dname;
        this.topic = topic;
        this.content = content;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.notification_layout,null,true);

        TextView name = rowView.findViewById(R.id.chip5);
        TextView topics = rowView.findViewById(R.id.post_topic);
        TextView contents = rowView.findViewById(R.id.post_content);

        name.setText(dname[position]);
        topics.setText(topic[position]);
        contents.setText(content[position]);
        return rowView;
    }
}
