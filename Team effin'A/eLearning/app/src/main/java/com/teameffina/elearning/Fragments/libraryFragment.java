package com.teameffina.elearning.Fragments;

import android.content.Context;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.teameffina.elearning.R;

public class libraryFragment extends Fragment {
    @Nullable
    @Override
    public View getView() {
        View main = View.inflate(getContext(), R.layout.fragment_library, null);
        return main;
    }
}