package com.example.grouptap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ButtonFragment extends Fragment {
    Button countBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Declare and Init our layout and pass it into the view Object
        View view = inflater.inflate(R.layout.count_button, container, false);

        // Init our view using the layout view object from above
        countBtn = view.findViewById(R.id.count_button);

        // return layout view so it can be loaded
        return view;

    }
}
