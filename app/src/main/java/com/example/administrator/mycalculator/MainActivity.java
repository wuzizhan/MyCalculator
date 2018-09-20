package com.example.administrator.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.support.v7.app.ActionBar;
import android.graphics.Color;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn_1;
    private TextView txt_1234;
    private TextView text_dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //透明式系统栏
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();

        //获取布局中的控件实例对象
        btn_1 = (Button) findViewById(R.id.btn_1);
        txt_1234 = (TextView) findViewById(R.id.text_1234);
        text_dis = (TextView) findViewById(R.id.text_display);

    }

   // @Override
    public void onButtonClick(View view) {
        text_dis.setText(btn_1.getText());

    }

//
//    //实现像看影响，玩游戏一样的沉浸式模式
//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        if(hasFocus && Build.VERSION.SDK_INT >= 19) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                    |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    |View.SYSTEM_UI_FLAG_FULLSCREEN
//                    |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                    |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
//            decorView.setSystemUiVisibility(option);
//        }
//    }
//



//    /**
//     * 设置状态栏高亮模式，状态栏上的字体图标都为黑色
//     * @param activity
//     */
//    public void statusBarLightMode(Activity activity) {
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
//            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            ActionBar actionBar = getSupportActionBar();
//            actionBar.hide();
//        }
//    }
}
