/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author wufan
 */
public class Util {
    public static void tableStyle1(JTable table,JScrollPane scrollPane,Color color){
        
        scrollPane.getViewport().setBackground(new Color(255, 255, 255));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                // allow default preparation
                Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // replace default font
                comp.setFont(new Font("Segoe UI", Font.BOLD, 14));
                return comp;
            }
            
        };
        cellRenderer.setBackground(color); //new Color(125,100,171)
        cellRenderer.setForeground(new Color(255,255,255));
         for(int i=0;i<table.getColumnCount();i++){
            TableColumn column = table.getTableHeader().getColumnModel().getColumn(i);
            column.setHeaderRenderer(cellRenderer);
        }
    }
    
    public static String strToMultilineHTML(String str,String sp){
        String html = "<html><body><p align=\"center\">" ;
        for (String string : str.split(sp)) {
            html+= string+ "<br/>";
        }
        html +=  "</p></body></html";
        return html;
    }
}
