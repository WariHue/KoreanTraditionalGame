package com.github.warihue.Frame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
//import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Random rd = new Random();
        //int sum = 0;
        // 프레임 생성
        JFrame frm = new JFrame("윷");

        Font nF = new Font("NanumGothic",1,30);

        // 프레임 크기 설정
        frm.setSize(350, 300);

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ★ 레이아웃 설정
        frm.getContentPane().setLayout(null);

        JLabel lbl = new JLabel();
        lbl.setBounds(30, 50, 274, 50);
        lbl.setText("게임을 시작합니다");
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        lbl.setFont(nF);
        frm.getContentPane().add(lbl);

        // 버튼 생성
        JButton btn1 = new JButton("윷 던지기");
        btn1.setBounds(45, 170, 244, 30);
        btn1.addActionListener(event -> {
            int sum = rd.nextInt(6);
            String str;
            if(sum == 0)
                lbl.setText("뒷도");
            else if (sum == 1)
                lbl.setText("도");
            else if(sum == 2)
                lbl.setText("개");
            else if (sum == 3)
                lbl.setText("걸");
            else if(sum ==4)
                lbl.setText("윷");
            else if (sum == 5)
                lbl.setText("모");
        });



        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);

        // 프레임이 보이도록 설정
        frm.setVisible(true);
    }

}

