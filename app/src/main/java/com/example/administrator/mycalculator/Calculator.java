package com.example.administrator.mycalculator;

/**
 * 四则运算
 * @author XunmingXu 2018/9/23
 *
 */
public class Calculator {

    /**
     * 加法运算
     * @param   num1, num2 两个浮点数;
     * @return 返回一个浮点数
     */
    public static float plus(float num1, float num2) {
        if( num1 == 0.0 && num2 == 0.0) {
            return 0;
        }
        return (num1 + num2);
    }

    /**
     * 减法运算
     * @param num1,num2两个浮点数
     * @return 返回一个浮点数
     */

}
