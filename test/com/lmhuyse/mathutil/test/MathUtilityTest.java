/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmhuyse.mathutil.test;

import static com.lmhuyse.mathutil.MathUtility.*; //tao muon cac ham hien 
import java.sql.SQLException;
                                         //trong class go truc tiep luon
                                         //go truc tiep khong phai cham
                                         //chi static moi co dieu nay
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    @Test//phai co
    public void testFactorialGivenRightArgumentReturnGoodResult() {  //ten ham la V(dong tu)
        int n = 5;             //tui mun test 5! co dung la
        long expected = 120;   //120 hay ko
        long actual = getFactorial(n);
        assertEquals(expected, actual);
        
        //minh test cac truong hop khac dung dau vao, dung dau ra
        //khoi can bien trung gian, choi luon trong lenh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
    }
    
    //dieu gi xay ra neu ta dua vao tham so ca chon, am, hoac > 20
    //theo thiet ke cua , dua vao ca chon se men ra ngoai le
    //va ta can test, xem ngoai le co duoc nem ra khong neu co ca chon
    //tuc la thay xuat hien ngoai le neu co ca con dua vao -> ham dung
    //thay ngoai le khi co ca chon thi minh mung vi ham da chay dung
    
    //                       .ruby      katalon(KML)
    //                       .adonet
    //com.microsoft.sqlserver.jdbc
    //             .visualstudio
    //             .azure
    //             .windows
    @Test(expected = IllegalArgumentException.class)
    //co dung khi chay ham nay nem ra ngoai le ten la IllegalArgy...
    //neu dung no nem ra ra ngoai le cung ten, code dung roi, XANH THOY
    public void testFactorialWrongArgumentThrowsException() {
        //minh test tinh huong ham phai nem ra ngoai le neu tham so ca chon
        //ngoai le la thu khong phai la value de so sanh, ko dung ma assertEquals()
        //ta phai dung chieu khac, JUnit 4 khac JUnit 5 o cho bat ngoai le
        //Khi 5 di di thinh mon SWT301 cua tui: DI, Lambda Expresssion lien quan
        //JUnit 5                             Dependency Injection / SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
        //build-impl.xml dong 1005 them ", test," sau compile
        //C:\Program Files\NetBeans 8.2\platform\modules\ext (lay thu vien)
    }
    
}
