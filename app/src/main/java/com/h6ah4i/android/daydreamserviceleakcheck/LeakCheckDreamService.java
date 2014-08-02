package com.h6ah4i.android.daydreamserviceleakcheck;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.service.dreams.DreamService;

public class LeakCheckDreamService extends DreamService {
    public LeakCheckDreamService() {
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        setInteractive(false);
        setFullscreen(true);
        setContentView(R.layout.daydream);
    }
}
