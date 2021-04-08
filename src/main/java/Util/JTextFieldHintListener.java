/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author wufan
 */
public class JTextFieldHintListener implements FocusListener {
    private String hintText;
    private JTextField textField;
    private Color color;
    public JTextFieldHintListener(JTextField jTextField,String hintText,Color color) {
        this.color = color;
        this.textField = jTextField;
        this.hintText = hintText;
        jTextField.setText(hintText);  //默认直接显示
        jTextField.setForeground(color);
    }
    @Override
    public void focusGained(FocusEvent e) {
        String temp = textField.getText();
        if(temp.equals(hintText)) {
                textField.setText("");
                textField.setForeground(Color.BLACK);
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        //失去焦点时，没有输入内容，显示提示内容
        String temp = textField.getText();
        if(temp.equals("")) {
                textField.setForeground(new Color(153,153,153));
                textField.setText(hintText);
        }
    }
   

}
