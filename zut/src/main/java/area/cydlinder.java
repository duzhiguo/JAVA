package area;

import javax.swing.*;

public class cydlinder {

     public cydlinder(){
        String r = JOptionPane.showInputDialog("半径:");
        String  heigh = JOptionPane.showInputDialog("高:");
        double radius =  Integer.parseInt(r);
        double height = Integer.parseInt(heigh);
        double area = radius * radius * Math.PI;
        double volume = area * height;
        JOptionPane.showMessageDialog(null,String.valueOf("area :"+area));
        JOptionPane.showMessageDialog(null,String.valueOf("volume: "+volume));

    }


}
