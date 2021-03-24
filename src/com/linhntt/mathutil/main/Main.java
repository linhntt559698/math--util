/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhntt.mathutil.main;

import com.linhntt.mathutil.MathUtilv;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n = 5;
       long expected = 120;
       long actual = MathUtilv.getFactorial(n);
       System.out.println("5! expeted: " + expected +"; actual:" + actual);
       //
       n = 0;
       expected = 1;
       actual = MathUtilv.getFactorial(n);
       System.out.println("0! expeted: " + expected +"; actual:" + actual);
    }
    
}
// viết code xong thì phải test code , nguyên tắc phải theo
// test ngay từng hàm từng class trc khi ráp chung vs các class khác 
// test ngay khi xong hàm , xong class đc gọi là test mức dộ 1 , Unittest , mức đơn vị code  .
//  làm sao để test . có nhiu cách 
// 1. cách 1 : sout (gọi hàm ) để in ra kết quả của hàm 
// 2. cách 2 : JOptionPane để popup lên kết quả xử lý hàm 
// 3. cách 3 : ghi ra LOG file, hoặc la ra trang web 
// 3 cách này thì đều phải dùng mắt để xem kết quả và tự xem kết quả đúng sai , đúng khi ham chạy ra 1 giá trị -ACTUAL VALUE
// và ta thấy ACTUAL VALUE = tay  gọi là EXPECTED VALUE  
// ví dụ 5! thì ta hu vọng expected hàm trả về 120 
// nhưng hàm trả về đúng 120 - actual 
// hàm chạy đúng cho 5!
// sai : tui test 6! expected = 720, chạy ra actual = 120
// hàm xử lí sai
// cách 4 máy ơi so sánh dùm lun đi vì mày có thể ss đc . có các phép toán để so sánh 
// con người không cần nhìn từng dòng kết quả để luận đúng sai máy sẽ lo tất 
// nếu tất cả đềutính hướng chạy hàm dều  đúng màu xanh 
// hầu hết tất cả tính huống chạy hàm đều đúng , có 1 cái sai thì tất cả hàm sai  màu đỏ 
// đỏ chỉ cần 1 thàng sai 
// xanh tất cả đều phải đúng 
// muốn làm đc điều này ta cần thư viện phụ trợ giúp cho jav có màu xanh đỏ 
// điều này có bên C# , PHP, JS , RUBY ...
// java : JUnit , testNG 
// C# NUnit,xUnit 
// PHP....
