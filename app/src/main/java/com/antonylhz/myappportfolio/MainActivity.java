package com.antonylhz.myappportfolio;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Toast.makeText(this, getToastString(v.getId()), Toast.LENGTH_LONG).show();
    }

    private String getToastString(@IdRes int buttonId) {
        StringBuffer res = new StringBuffer("This button will launch my ");

        switch (buttonId) {
            case R.id.buttonPopularMovies:
                res.append(getString(R.string.popular_movies_app_name));
                break;
            case R.id.buttonStockHawk:
                res.append(getString(R.string.stock_hawk_app_name));
                break;
            case R.id.buttonBuildItBigger:
                res.append(getString(R.string.build_it_bigger_app_name));
                break;
            case R.id.buttonGoUbiquitous:
                res.append(getString(R.string.go_ubiquitous_app_name));
                break;
            case R.id.buttonMakeYourAppMaterial:
                res.append(getString(R.string.make_your_app_material_app_name));
                break;
            case R.id.buttonCapstone:
                res.append(getString(R.string.capstone_app_name));
                break;
            default:
                res.append("App Not Found");
        }

        res.append(" project!");
        return res.toString();
    }

}
