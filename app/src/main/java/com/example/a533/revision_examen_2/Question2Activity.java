package com.example.a533.revision_examen_2;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question2Activity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        SetListeners();
    }

    private void SetListeners(){

        findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.strange_dialog);
                Button captainButton = dialog.findViewById(R.id.btn_captain);
                Button cancelButton = dialog.findViewById(R.id.btn_cancel);

                captainButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MakeToast("Vroom");
                        dialog.dismiss();
                    }
                });

                cancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MakeToast("It's treason then");
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }

    private void MakeToast(String message){
        Toast.makeText(this, message,
                Toast.LENGTH_SHORT).show();
    }
}
