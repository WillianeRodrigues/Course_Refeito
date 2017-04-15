package br.com.usp.willianerodrigues.course.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.usp.willianerodrigues.course.R;
import br.com.usp.willianerodrigues.course.activities.LoginActivity;
import br.com.usp.willianerodrigues.course.activities.RegisterActivity;


public class Slide02 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slide_02, container, false);

        Button buttonStart = (Button) view.findViewById(R.id.btn_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        Button buttonCreate = (Button) view.findViewById(R.id.btn_sing_in);
        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }

}
