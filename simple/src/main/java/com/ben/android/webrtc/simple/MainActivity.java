package com.ben.android.webrtc.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.ben.android.webrtc.simple.widgets.PercentFrameLayout;

import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.SurfaceViewRenderer;

public class MainActivity extends AppCompatActivity {
    private PercentFrameLayout mRemoteContainerLayout;
    private PercentFrameLayout mLocalContainerLayout;
    private SurfaceViewRenderer mRemoteSurfaceView;
    private SurfaceViewRenderer mLocalSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_main);
        mRemoteContainerLayout = findViewById(R.id.id_remote_layout);
        mLocalContainerLayout = findViewById(R.id.id_local_layout);
        mRemoteSurfaceView = findViewById(R.id.id_remote_view);
        mLocalSurfaceView = findViewById(R.id.id_local_view);

        initelizateLocalEnvironment();
    }

    private void initelizateLocalEnvironment() {
        EglBase eglBase = EglBase.create();

        

    }

}
