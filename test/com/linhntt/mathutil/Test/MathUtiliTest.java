/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhntt.mathutil.Test;
// nếu gọi trực tiếp không muốn class . vd : import static  com.linhntt.MathUtilv.* 
import com.linhntt.mathutil.MathUtilv;
import static com.linhntt.mathutil.MathUtilv.getFactorial;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtiliTest {
        @Test
        public void testFactorialGivenRightArgumentReturnGoodResult(){
            int n = 5;  // tui mún test 5! có bằng 120 hay không 
            long expected = 120;
            long actual = MathUtilv.getFactorial(n);
            assertEquals (expected, actual);
            // minh test tiep cac th khac . dung dau ra
            // khỏi cần biến trung gian , chơi lun trong lệnh  
            assertEquals(720, MathUtilv.getFactorial(6));
            assertEquals(24, MathUtilv.getFactorial(4));
            assertEquals(6, MathUtilv.getFactorial(3));
            assertEquals(1, MathUtilv.getFactorial(1));
            assertEquals(1, MathUtilv.getFactorial(0));
            
            
        }
        // điều gì xảy ra nếu ta đưa tham số âm , hoạc lớn hơn >20
        //theo thiết kế chung của hàm đưa vào só cà chớn sẽ ném ra ngoại lệ 
        // và ta cần test xem ngoại lệ có đc ném ra không 
        // tức là thấy xuất hiện ngoại lệ nếu có cà chớn  đưa vào--> hàm đúng
        // cbho nên thấy ngoại leejkhi có cà chơn hàm đúng 
        @Test(expected = IllegalArgumentException.class)
        // có đúng khi chạy hàm thì ném ra ngoại lệ 
        // nếu đúng nó ném ra ngoại lệ cùng tên
        public void testFactorialWrongArgumentThrowException(){
            // mình test tinh huống hàm phải ném ra ngoại lệ nếu tham số ca chớn 
            //ngoại lệ ko phải là value để so sánh, ko dúng assertEquals()
            // ta phái dùng chiêu khác . JUnit4 kasc JUnit5 ở chỗ bắt ngoại lệ 
            // kỳ 5 đi dự thính môn SWT 301(DI,lambda expression)
            //JUnit 5
            getFactorial(-5);
            getFactorial(21);
            getFactorial(40);
            
        } 
}
