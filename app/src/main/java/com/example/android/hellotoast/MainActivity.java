/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Displays two Buttons and a TextView.
 * - Pressing the TOAST button shows a Toast.
 * - Pressing the COUNT button increases the displayed mCount.
 *
 * Note: Fixing behavior when device is rotated is a challenge exercise for the student.
 */

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        Log.d("MainActivity", "Question 1 : La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d("MainActivity", "Question 2 : Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent.");
        Log.d("MainActivity", "Question 3 : new Intent(Context context, Class<?> class)");
        Log.d("MainActivity", "Question 4 : Comme extra d'intention (Intent)");
        Log.d("MainActivity", "Question 5 : Tout ce qui précède.");
    }

    /*
    * Shows a Toast when the TOAST button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since a toast always shows on the top,
    *             the passed in view is not used.
    */
    public void showToast(View view) {

        Intent intent = new Intent(this, Hello.class);
        String message = mShowCount.getText().toString();
        intent.putExtra("count", message);
        startActivity(intent);
        /*Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();*/
    }

    /*
    * Increments the number in the TextView when the COUNT button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since the count always appears in the TextView,
    *             the passed in view is not used.
    */
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
