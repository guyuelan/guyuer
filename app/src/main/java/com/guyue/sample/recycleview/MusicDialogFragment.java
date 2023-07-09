package com.guyue.sample.recycleview;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.guyue.sample.R;
import com.guyue.sample.recycleview.adapter.MusicListAdaper;

public class MusicDialogFragment extends DialogFragment {

   public static final String MUSIC_LIST_TAG = "musicListTag";
   public static final String MEDIA_ITEM_LIST = "mediaItemList";
   public static final String MEDIA_ITEM_INDEX = "mediaItemIndex";
   public static MusicDialogFragment getInstance(Bundle mBundle) {
      MusicDialogFragment f = new MusicDialogFragment();
      f.setArguments(mBundle);
      return f;
   }

   private RecyclerView mRecyclerView;
   private MusicListAdaper mMusicListAdaper;
   @NonNull
   @Override
   public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

      AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
      View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_recycle_view, null, false);

      initView(view);
      builder.setTitle("lsit")
              .setView(view)
              .setNegativeButton("guan bi", (dialog, which) -> {
                 dialog.dismiss();
              });

      return builder.create();
   }

   private void initView(View view) {
      if(getArguments() == null) return;
      mRecyclerView = view.findViewById(R.id.list_view);
      mRecyclerView.setNestedScrollingEnabled(true);
      mMusicListAdaper = new MusicListAdaper(getContext(), getArguments().getStringArrayList(MEDIA_ITEM_LIST),
              getArguments().getInt(MEDIA_ITEM_INDEX));
      LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),
              LinearLayoutManager.VERTICAL,
              false);
      mRecyclerView.setLayoutManager(layoutManager);
      mRecyclerView.setAdapter(mMusicListAdaper);

   }
}
