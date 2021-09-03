package com.example.antentalcare;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExpectingMother extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_expecting_mother, container, false);

        Button button = view.findViewById(R.id.mother_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText emailFeild = view.findViewById(R.id.emailFeild);
//                EditText passwordFeild = view.findViewById(R.id.fragment1Data);
//                EditText password2Feild = view.findViewById(R.id.fragment1Data);
//                EditText occupationFeild = view.findViewById(R.id.fragment1Data);
//                EditText dobFeild = view.findViewById(R.id.fragment1Data);
//                EditText medicalCenterFeild = view.findViewById(R.id.fragment1Data);

                Bundle result = new Bundle();
                result.putString("df2", emailFeild.getText().toString());
                getParentFragmentManager().setFragmentResult("dataFrom2",result);
                emailFeild.setText("");

            }
        });

        getParentFragmentManager().setFragmentResultListener("dataFrom1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                String data = result.getString("df1");
                TextView textView = view.findViewById(R.id.dataFrom1);
                textView.setText(data);

            }
        });

        return view;
    }
}
