package dhbk.android.mediaplayertest.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dhbk.android.mediaplayertest.R;

public class PlaybackControlsFragment extends Fragment {
    public PlaybackControlsFragment() {
    }

    public static PlaybackControlsFragment newInstance() {
        PlaybackControlsFragment fragment = new PlaybackControlsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_playback_controls, container, false);
    }
}
