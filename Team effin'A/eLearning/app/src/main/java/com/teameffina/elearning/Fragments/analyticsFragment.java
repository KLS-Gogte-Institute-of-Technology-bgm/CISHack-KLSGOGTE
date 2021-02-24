package com.teameffina.elearning.Fragments;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.teameffina.elearning.R;

public class analyticsFragment extends Fragment {
    @Nullable
    @Override
    public View getView() {
        View main = View.inflate(getContext(), R.layout.fragment_analytics, null);
        return main;
    }
}