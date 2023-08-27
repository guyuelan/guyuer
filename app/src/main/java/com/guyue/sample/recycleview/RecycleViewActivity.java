package com.guyue.sample.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guyue.sample.R;
import com.guyue.sample.recycleview.adapter.MusicListAdaper;
import com.guyue.viewmeasure.ViewMeasureActivity;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "RecycleViewActivity";
    private List<String> mSongs = new ArrayList();

    private RecyclerView mRecyclerView;
    private Button mbutton;
    private Button mbutton_view;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 100; i++) mSongs.add("slsl" + i);
        mbutton = findViewById(R.id.open_dialog);
        mbutton.setOnClickListener(this);
        mbutton_view = findViewById(R.id.view_measure);
        mbutton_view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (mbutton == v) {
            Bundle bundle = new Bundle();

            bundle.putStringArrayList(MusicDialogFragment.MEDIA_ITEM_LIST, (ArrayList<String>) mSongs);
            bundle.putInt(MusicDialogFragment.MEDIA_ITEM_INDEX, 2);

            MusicDialogFragment fragment = new MusicDialogFragment().getInstance(bundle);
            fragment.show(getSupportFragmentManager(), MusicDialogFragment.MUSIC_LIST_TAG);
        } else if (mbutton_view == v) {
            Intent newIntent = new Intent(this, ViewMeasureActivity.class);
            startActivity(newIntent);
        }



    }
}