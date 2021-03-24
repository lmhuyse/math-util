/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmhuyse.mathutil.main;

import com.lmhuyse.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello GitHub!!!");
        System.out.println("This is 1st upload from local to remote GitHub");
        // tui mun test test 5! co dung dung 120 hem???
        int n = 5;            //n!
        long expected = 120;  //hy vong 120 tra ve
        long actual = MathUtility.getFactorial(n);  //thuc te ha chay la may
        //minh so sanh de biet dung sai???
        System.out.println("5! expected: " + expected +
                                ": actual: " + actual);
        
        //tui mun test 0! co dung la 1 hem?
        n = 0;            //n!
        expected = 1;  //hy vong 120 tra ve
        actual = MathUtility.getFactorial(n);  //thuc te xxha chay la may
        //minh so sanh de biet dung sai???
        System.out.println("0! expected: " + expected +
                                ": actual: " + actual);
    }
    
}

//VIET CODE XONG thi phai tét code - nghuyen tac phai theo
//TEST NGAY TUNG HAM, TUNG CLASSS TRUOC KHI RAP CHUNG VOI CAC CLASS KHAC
//TEST NGAY KHI XONG HAM, XONG CLASS
//duoc goi la test muc do 1, Muc Unit Test (test muc don vi code)
//Lam sao de test, co nhieu cach
//1. Cach 1: sout(goi ham()) de in ra ket qua xu li ham
//2. Cach 2: JOptionPane de popup len ket qua xu li cua ham (J Desktop)
//3. Cach 3: Ghi ra LOG file, ra 1 traang web (JW)
//4. Cach 4: MAY OI SO SANH GIUM VA KET LUAN GIUM TAO LUON VI MAY
//CO CAC PHEP TOAN MA
//CON NGUOI KO CAN NHIN TUNG DONG KET QUA TRA VE DE LUAN DUNG SAI
//MAY SE LO CHO
//NEU TAT CA TINH HUONG CHAY HAM DEU DUNG -? HAM DUNG   -> MAU XANH
//NEU TAT CA TINH HUONG CAHY HAM DEU DUNG, CO 1 CAI SAI -> HAM SAI
//                                                      -> HAM DO
//DO: CHI CAN 1 THANG SAI
//XANH: TAT CA PHAI DEU DUNG

// MUN LAM DC DIEU NAY TA CAN THU VIEN PHU TRO GIUP CHO JAVA XANH DO
//DIEU NAY CUNG CO BAN C# PHP, JS, RUBY..
//JAVA: JUnit, tESTng
//C#  :NUnit, xUnit, MSTest
//PHP
//* dung: tuc la ham cahy ra 1 gia tri = ACTUAL VALUE
//                  va ta thay ACTUAL VALUE khop, bang voi cai gia
//tri ma ta mong doi, ta tinh truoc = tay, goi la EXPECTED VALUE
//vi du 5! thi ta hy vong expected ham tra va 120
//nhunh khon nan thay, ham tra ve dung 120 = actual
//ham chay dung cho 5!

//* sai: tui test 6!, expected = 720, khjon nan thay, chay ra actual = 120
//ham xu li xai