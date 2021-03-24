/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhntt.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtilv {
    // Class này chứa mooyj nhóm hàm toán học ; fake to class chuẩn 
    // java.util.Math của jdk
    // vì đồ sài chung cho nên sà la static 
    public static final double PI = 3.14;
            // hàm tính n !
    //vì giai thừa tăng rất nhanh 
    //kiểu long chịu đucọ 10^18 con số 0 . lơn hơn nữa là thua
    //
    public static long getFactorial(int n ){
        if (n<0 ||n>20)
            throw new IllegalArgumentException("invalid argument. n must be between 0..20");
        if (n==0 ||n==1)
            return 1;
        long result = 1;  //cố tình để value
        for ( int i=2 ;i <= n; i++)
            result *= i;
        return result ;
                
        
    }
          
    
}
