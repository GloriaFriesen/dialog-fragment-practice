package com.epicodus.fragmentpractice;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MoodDialogFragment extends DialogFragment {
    private Button cancelButton;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);

        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup);
                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();
            }
        });


        return rootView;

    }
}
