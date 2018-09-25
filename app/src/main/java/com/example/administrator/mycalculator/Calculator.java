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
    public static float minus(float num1, float num2) {
        return (num1 - num2);
    }

    /**
     * 乘法运算
     * @param   num1, num2 (都是float)
     * @return float
     */
    public static float multiplication(float num1, float num2) {
        if(num1 == 0.0 || num2 == 0.0) {
            return 0;
        }else{
            return (num1 * num2);
        }
    }

    /**
     * 除法运算
     * @param  num1, num2 (都是float)
     * @return float
     */
    public static float division(float num1, float num2) {
        if(num2 == 0) {
            return -1;
        }else {
            if(0 == num1) {
                return 0;
            }else
                return (num1/num2);

        }
    }
}
