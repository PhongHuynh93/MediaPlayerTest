package dhbk.android.mediaplayertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This class hold the MediaBrowser and the MediaController instances. It will create a MediaBrowser
 * when it is created and connect/disconnect on start/stop. Thus, a MediaBrowser will be always
 * connected while this activity is running.
 */
public class MusicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);


        // declare toolbar
        initializeToolbar();
    }

    protected void initializeToolbar() {

    }
}
