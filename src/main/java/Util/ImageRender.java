/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author wufan
 */
public class ImageRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       String photoName = value.toString();
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource(photoName)).getImage()
        .getScaledInstance(150, 100, Image.SCALE_DEFAULT));
       return new JLabel(imageIcon);
    }
    
}
