package Novo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inter extends JFrame {
    JButton btnDialog = new JButton("Dialogo");
    private Inter(){
        Container paine = this.getContentPane();
        this.setVisible(true);
        paine.add(btnDialog);
        btnDialog.setVisible(true   );
        btnDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mtdDialogo();
            }
        });
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void mtdDialogo(){
        JOptionPane.showMessageDialog(new JFrame(),"Eggs are not supposed to be green.");
    }
    public static void main(String args[]){
        Inter tt = new Inter();
    }
}
