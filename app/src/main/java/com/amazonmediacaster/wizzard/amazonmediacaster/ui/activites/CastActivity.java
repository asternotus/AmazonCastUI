package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amazonmediacaster.wizzard.amazonmediacaster.R;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ICastScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.CastPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories.PresenterFactory;

public class CastActivity extends AppCompatActivity implements ICastScreenView {

    private CastPresenter castPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast);

        PresenterFactory factory = new PresenterFactory(this);
        castPresenter = ViewModelProviders.of(this, factory).get(CastPresenter.class);

        getLifecycle().addObserver(castPresenter);
    }
}
