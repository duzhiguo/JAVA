package area;

import javax.swing.*;

public class ascii {
    public  ascii(){
        String num = JOptionPane.showInputDialog("num: ");
        for (byte b : num.getBytes()) {
            System.out.print((char) (b + 48));
        }
    }


}
