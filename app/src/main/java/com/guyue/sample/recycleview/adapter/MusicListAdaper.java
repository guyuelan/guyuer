package com.guyue.sample.recycleview.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.guyue.sample.R;

import java.util.List;

public class MusicListAdaper extends RecyclerView.Adapter<MusicListAdaper.MusicViewHolder>implements OnListUpdateColor{

    private static final String TAG = "MusicListAdaper";
    private List<String> mSongs;
    private Context context;
    private OnListClickListener mOnListClickListener;
    private int mCurrentPosition = 0;
    private SparseArray<MusicViewHolder>mMusicViewHolder = new SparseArray<>();

    public MusicListAdaper(Context context, List<String>mSongs, int position){
        this.context = context;
        this.mSongs = mSongs;
        this.mCurrentPosition = position;
    }

    public void setOnListClickListener(OnListClickListener onListClickListener){
        this.mOnListClickListener = onListClickListener;
    }


    private int getPosition(MusicViewHolder viewHolder){
        return viewHolder.getAdapterPosition();
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View View =  LayoutInflater.from(context).inflate(R.layout.list_song_item, viewGroup, false);
        return new MusicViewHolder(View);
    }

    public void setCurrentIndex(int index){
        if (mCurrentPosition == index){
            return;
        }
        mCurrentPosition = index;
        if(mMusicViewHolder != null){
//            mMusicViewHolder.get(mCurrentPosition).songTitle.setTextColor(context.getResources().getColor(R.color.song_title_clicked_color));
            notifyDataSetChanged();
        }

    }


    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, int i) {
        String song = mSongs.get(i);
        mMusicViewHolder.put(i,musicViewHolder);
        String title = song;
        musicViewHolder.songTitle.setText(title);

        musicViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnListClickListener != null){
                    int position = getPosition(musicViewHolder);
                    mCurrentPosition = position;
                    mOnListClickListener.onItemClick(position);
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if(mSongs != null && mSongs.size() > 0) return mSongs.size();
        return 0;
    }

    @Override
    public void onUpdateItem(int position) {
        if(mMusicViewHolder != null){
            notifyDataSetChanged();
        }
    }

    class MusicViewHolder extends RecyclerView.ViewHolder{
        private TextView songTitle;
        private MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            songTitle = itemView.findViewById(R.id.title);
        }
    }

}


