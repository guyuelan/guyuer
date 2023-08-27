package com.guyue.viewmeasure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ViewMeasureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_measure);
        showFragment();
    }

    private void showFragment() {
        TestFragment fragment = new TestFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        Fragment tmp = getSupportFragmentManager().findFragmentById(R.id.container);
        if (tmp == null) {
            ft.add(R.id.container, fragment);
        } else if (tmp != fragment) {
            ft.replace(R.id.container, fragment);
        } else {
            ft.show(tmp);
        }
        ft.commitAllowingStateLoss();
    }
}