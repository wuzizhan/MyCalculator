package com.example.administrator.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.support.v7.app.ActionBar;
import android.graphics.Color;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn0;           //数字按钮0
    private Button btn1;           //数字按钮1
    private Button btn2;           //数字按钮2
    private Button btn3;           //数字按钮3
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnFloat;
    private TextView tvDisplayNum1;  //显示用户按下的第一个值
    private TextView tvDisplayNum2;  //显示用户按下的第二个值
    private TextView tvDisPlayResult; //显示运算结果
    private TextView tvDisplayCalculator; //显示运算符
    private boolean flag = false;  //是否按下运算符

    private LinearLayout linearLayout;          //父容器的实例对象
    private RelativeLayout relativeLayout;

    private static final String TAG = "MainActivity";

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


        //获取布局中的子控件数字按钮实例对象
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnFloat = (Button) findViewById(R.id.btn_dot);

        //获取布局中显示子控件实例对象，并置空
        tvDisplayNum1 = (TextView) findViewById(R.id.tv_display_num1);
        tvDisplayNum1.setText("");
        tvDisplayNum2 = (TextView) findViewById(R.id.tv_display_num2);
        tvDisplayNum2.setText("");
        tvDisPlayResult = (TextView) findViewById(R.id.tv_display_result);
        tvDisPlayResult.setText("");
        tvDisplayCalculator = (TextView) findViewById(R.id.tv_display_calculator);
        tvDisplayCalculator.setText("");

        //获取父容器的实例对象
        linearLayout = (LinearLayout)findViewById(R.id.layout_display);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        Log.d(TAG, linearLayout.toString());
        Log.d(TAG, relativeLayout.toString());



        //设置等号按钮的监听事件
        Button btnEqual = (Button)findViewById(R.id.btn_equal);
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = tvDisplayNum1.getText().toString();
                String num2 = tvDisplayNum2.getText().toString();
                String operator = tvDisplayCalculator.getText().toString();
                switch (operator) {
                    case "+":
                        if(!TextUtils.isEmpty(num1) && !TextUtils.isEmpty(num2)){
                            float result = Calculator.plus(Float.parseFloat(num1), Float.parseFloat(num2));
                            tvDisPlayResult.setText(String.valueOf(result));
                        }
                        break;
                    case "-":
                        if(!TextUtils.isEmpty(num1) && !TextUtils.isEmpty(num2)){
                            float result = Calculator.minus(Float.parseFloat(num1), Float.parseFloat(num2));
                            tvDisPlayResult.setText(String.valueOf(result));
                        }
                        break;
                    case "*":
                        if(!TextUtils.isEmpty(num1) && !TextUtils.isEmpty(num2)){
                            float result = Calculator.multiplication(Float.parseFloat(num1), Float.parseFloat(num2));
                            tvDisPlayResult.setText(String.valueOf(result));
                        }
                        break;
                    case "/":
                        if(!TextUtils.isEmpty(num1) && !TextUtils.isEmpty(num2)){
                            float result = Calculator.division(Float.parseFloat(num1), Float.parseFloat(num2));
                            if(-1 == result){
                                tvDisPlayResult.setText("分母不能为0，请重新输入");
                            }else
                                tvDisPlayResult.setText(String.valueOf(result));
                        }
                        break;

                    default:
                        return;


                }

            }
        });


//        //获取子控件按钮的父布局的对象
//        LinearLayout layoutDial = (LinearLayout)findViewById(R.id.layout_dial);
//        layoutDial.measure(0,0);
//        Toast.makeText(MainActivity.this, "数字按钮的宽度: "+layoutDial.getMeasuredWidth(), Toast.LENGTH_SHORT).show();
//        Log.d(TAG, "数字按键的宽度: "+layoutDial.getMeasuredWidth());


    }

   // @Override
    public void onButtonClick(View view) {
        int id = view.getId();
        switch(id) {
            case R.id.btn_0:
                if(flag == false) {
                    tvDisplayNum1.append(btn0.getText());
                }else {
                    tvDisplayNum2.append(btn0.getText());
                }
                break;
            case R.id.btn_1:
                if(flag == false) {
                    tvDisplayNum1.append(btn1.getText());
                }else {
                    tvDisplayNum2.append(btn1.getText());
                }
                break;
            case R.id.btn_2:
                if(flag == false) {
                    tvDisplayNum1.append(btn2.getText());
                }else {
                    tvDisplayNum2.append(btn2.getText());
                }
                break;
            case R.id.btn_3:
                if(flag == false) {
                    tvDisplayNum1.append(btn3.getText());
                }else {
                    tvDisplayNum2.append(btn3.getText());
                }
                break;
            case R.id.btn_4:
                if(flag == false) {
                    tvDisplayNum1.append(btn4.getText());
                }else {
                    tvDisplayNum2.append(btn4.getText());
                }
                break;
            case R.id.btn_5:
                if(flag == false) {
                    tvDisplayNum1.append(btn5.getText());
                }else {
                    tvDisplayNum2.append(btn5.getText());
                }
                break;
            case R.id.btn_6:
                if(flag == false) {
                    tvDisplayNum1.append(btn6.getText());
                }else {
                    tvDisplayNum2.append(btn6.getText());
                }
                break;
            case R.id.btn_7:
                if(flag == false) {
                    tvDisplayNum1.append(btn7.getText());
                }else {
                    tvDisplayNum2.append(btn7.getText());
                }
                break;
            case R.id.btn_8:
                if(flag == false) {
                    tvDisplayNum1.append(btn8.getText());
                }else {
                    tvDisplayNum2.append(btn8.getText());
                }
                break;
            case R.id.btn_9:
                if(flag == false) {
                    tvDisplayNum1.append(btn9.getText());
                }else {
                    tvDisplayNum2.append(btn9.getText());
                }
                break;
            case R.id.btn_dot:
                if(flag == false) {
                    if(!"".equals(tvDisplayNum1.getText().toString())){
                        tvDisplayNum1.append(btnFloat.getText());
                    }else{
                        Toast.makeText(MainActivity.this, "请先输入数值", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    if(!"".equals(tvDisplayNum2.getText().toString())){
                        tvDisplayNum2.append(btnFloat.getText());
                    }else{
                        Toast.makeText(MainActivity.this, "请先输入数值", Toast.LENGTH_SHORT).show();
                    }
                }
//                if(flag == false) {
//                    if(!"".equals(tvDisplayNum1)){
//                        tvDisplayNum1.append(btnFloat.getText());
//                    }else{
//                        Toast.makeText(MainActivity.this, "请先输入数值", Toast.LENGTH_SHORT).show();
//                    }
//                }else{
//                    if(!"".equals(tvDisplayNum2)){
//                        tvDisplayNum2.append(btnFloat.getText());
//                    }else{
//                        Toast.makeText(MainActivity.this, "请先输入数值", Toast.LENGTH_SHORT).show();
//                    }
//                }
                break;
            case R.id.btn_plus:
                flag = true;
                tvDisplayCalculator.setText("+");
                break;
            case R.id.btn_minus:
                flag = true;
                tvDisplayCalculator.setText("-");
                break;
            case R.id.btn_div:
                flag = true;
                tvDisplayCalculator.setText("/");
                break;
            case R.id.btn_multi:
                flag = true;
                tvDisplayCalculator.setText("*");
                break;
            case R.id.btn_del:
                String result = tvDisPlayResult.getText().toString();
                String num2 = tvDisplayNum2.getText().toString();
                String num1 = tvDisplayNum1.getText().toString();
                String operator = tvDisplayCalculator.getText().toString();

                if(!TextUtils.isEmpty(result)){
                    String resultSub = result.substring(0,result.length()-1);
                    tvDisPlayResult.setText(resultSub);
                    break;
                }
                //relativeLayout.removeViewAt(1);
                //relativeLayout.getChildAt(1).setVisibility(View.GONE);

                if(!num2.equals("")){
                    String num2Sub = num2.substring(0, num2.length()-1);
                    Toast.makeText(MainActivity.this, num2Sub, Toast.LENGTH_SHORT).show();
                    tvDisplayNum2.setText(num2Sub);
                    break;
                }
                //relativeLayout.removeViewAt(0);
                //relativeLayout.getChildAt(0).setVisibility(View.GONE);

                if(operator != "") {
                    tvDisplayCalculator.setText("");
//                    String operatorSub = operator.substring(0, operator.length()-1);
//                    Toast.makeText(MainActivity.this, "删除后剩余长度："+operatorSub.length(), Toast.LENGTH_SHORT).show();
//                    //if( operatorSub == "")
//                    if(TextUtils.isEmpty(operatorSub))
//                        tvDisplayCalculator.setText("");
                    flag = false;
                    break;
                }
                //linearLayout.removeViewAt(1);
                //linearLayout.getChildAt(1).setVisibility(View.GONE);

                if(!"".equals(num1)){
                    String num1Sub = num1.substring(0, num1.length()-1);
                    tvDisplayNum1.setText(num1Sub);
                    Toast.makeText(MainActivity.this, "删除后剩余长度："+num1Sub.length(), Toast.LENGTH_SHORT).show();
                    break;
                }
                //linearLayout.removeViewAt(0);
                //linearLayout.getChildAt(0).setVisibility(View.GONE);

                break;

            default:
                return;
        }
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
