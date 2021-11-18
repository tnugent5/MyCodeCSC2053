package com.example.recyclerviewstarter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    //the inflater creates the single item layout
    //see it used in onCreateViewHolder below
    private LayoutInflater mInflater;

    //the constructor can take any parameters we need
    public WordListAdapter(Context context,
                           LinkedList<String> wordList) {
        //use this to create the layout
        mInflater = LayoutInflater.from(context);
        mWordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, );
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    //The RecyclerView.ViewHolder class must be an inner class
    //of the adapter class.
    //WordViewHolder is the Java class that represents the wordlist_item.xml layout
    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //instantiate any views used in the item layout here
        private TextView mWordIterative;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            mWordItemView = itemView.findViewById(R.id.word);

            itemView.setOnClickListener(this);
        }

    }

}