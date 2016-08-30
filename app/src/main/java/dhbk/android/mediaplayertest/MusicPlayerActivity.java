package dhbk.android.mediaplayertest;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dhbk.android.mediaplayertest.ui.BaseActivity;

/**
 * This class hold the MediaBrowser and the MediaController instances. It will create a MediaBrowser
 * when it is created and connect/disconnect on start/stop. Thus, a MediaBrowser will be always
 * connected while this activity is running.
 */
public class MusicPlayerActivity extends BaseActivity {
    private static final String SAVED_MEDIA_ID="com.example.android.uamp.MEDIA_ID";

    private Bundle mVoiceSearchParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // declare toolbar
        initializeToolbar();

        // todo declare param from intent
        initializeFromParams(savedInstanceState, getIntent());

    }

    /**
     * todo 2 get the string from voice
     * @param savedInstanceState
     * @param intent
     */
    protected void initializeFromParams(Bundle savedInstanceState, Intent intent) {
        String mediaId = null;
        // check if we were started from a "Play XYZ" voice search. If so, we save the extras
        // (which contain the query details) in a parameter, so we can reuse it later, when the
        // MediaSession is connected.
        if (intent.getAction() != null && intent.getAction().equals(MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH)) {
            mVoiceSearchParams = intent.getExtras();
        } else {
            if (savedInstanceState != null) {
                // If there is a saved media ID, use it
                mediaId = savedInstanceState.getString(SAVED_MEDIA_ID);
            }
        }

        navigateToBrowser(mediaId);
    }
}
