package com.example.cc15.soco;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anupam on 01-10-2016.
 */
public class interest_list extends Activity implements  AdapterView.OnItemClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<word> shabd=new ArrayList<>();
        shabd.add(new word("Discrimination",false));
        shabd.add(new word("Sanitation",false));
        shabd.add(new word("Corruption",false));
        shabd.add(new word("Harrasment",false));
        shabd.add(new word("Domestic violence",false));
        shabd.add(new word("Stray Animals",false));
        shabd.add(new word("Pollution",false));
        shabd.add(new word("Education",false));
        shabd.add(new word("Fraud",false));
        shabd.add(new word("Child Marriage",false));
        shabd.add(new word("Communalism",false));
        shabd.add(new word("Inflation",false));
        shabd.add(new word("Racism",false));
        shabd.add(new word("Moral Policing",false));
        shabd.add(new word("Theft",false));
        shabd.add(new word("Infanticide",false));
        shabd.add(new word("Unsafe Construction",false));

     //   ListView list=(ListView)findViewById(R.id.soochi);
        setContentView(R.layout.list_print);
        wordAdapter adapter=new wordAdapter(this,shabd,R.layout.list_item);
        ListView list=(ListView)findViewById(R.id.soochi);
        list.setOnItemClickListener(this);
        list.setAdapter(adapter);

        Button done = (Button)findViewById(R.id.donebtn);
        done.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }
        );

    }



    @Override
    public void onItemClick(AdapterView<?> word, View view, int position, long id) {
        Log.v("sd", "aspdokasdpoakdapodkapdka");
        CheckBox c = (CheckBox) findViewById(R.id.tick);

        if(c.isChecked()==false)
            c.setChecked(true);
        else
            c.setChecked(false);
    }
}

class word{

    private String mmessage;
    private boolean mbool;

    public word(String message, boolean bool)
    {
        mmessage=message;
        mbool=bool;
    }
    public String getMessage()
    {
        return mmessage;
    }
    public Boolean getbool()
    {
        return mbool;
    }
}

class wordAdapter extends ArrayAdapter<word> implements View.OnClickListener {
     int pos;
       private int resourceid;
    public wordAdapter(Context context, ArrayList<word> words, int resource) {
        super(context, 0,words);
        resourceid=resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        word currentWord=getItem(position);
        String rmessage=currentWord.getMessage();
        Boolean rbool=currentWord.getbool();
        TextView messageView=(TextView)listItemView.findViewById(R.id.message);
        CheckBox checkView=(CheckBox)listItemView.findViewById(R.id.tick);
        messageView.setText(rmessage);
        checkView.setChecked(rbool);

        checkView.setOnClickListener(this);

        return listItemView;
    }

    @Override
    public void onClick(View v) {

    }
}