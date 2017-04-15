package br.com.usp.willianerodrigues.course.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.usp.willianerodrigues.course.CourseApplication;
import br.com.usp.willianerodrigues.course.R;

public class SplashActivity extends AppCompatActivity {

    private CourseApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        application = (CourseApplication) getApplicationContext();

        hideNavigationBar();

        new SplashAsync().execute((Void) null);
    }

    // Ocultar a statusBar e actionBar
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    private class SplashAsync extends AsyncTask<Void, Void, Boolean> {

        private final int TIME = 1500;

        @Override
        protected Boolean doInBackground(Void... voids) {
            try {
                Thread.sleep(TIME);
                return application.buscarUserActive() != null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }

        @Override
        protected void onPostExecute(Boolean sucess) {

            if (sucess) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            } else {
                Intent intent = new Intent(SplashActivity.this, SlideActivity.class);
                startActivity(intent);
                finish();
            }

        }
    }

}
