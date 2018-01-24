/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kroky.jminesweeper;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.kroky.commons.utils.SwingUtils;

/**
 *
 * @author Krokavec Peter
 */
public class JMSMain extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public JMSMain() {
        initComponents();
        additionalInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new JPanel();
        xSlider = new JSlider();
        jLabel9 = new JLabel();
        jLabel8 = new JLabel();
        ySlider = new JSlider();
        xLabel = new JLabel();
        yLabel = new JLabel();
        jLabel12 = new JLabel();
        popSlider = new JSlider();
        popLabel = new JLabel();
        jPanel2 = new JPanel();
        lockCheckbox = new JCheckBox();
        jPanel3 = new JPanel();
        generateButton = new JButton();
        jPanel4 = new JPanel();
        jScrollPane2 = new JScrollPane();
        minefieldContainer = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        xSlider.setMinimum(10);
        xSlider.setToolTipText("");
        xSlider.setValue(20);
        xSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                xSliderStateChanged(evt);
            }
        });

        jLabel9.setText("Y:");

        jLabel8.setText("X:");

        ySlider.setMinimum(10);
        ySlider.setValue(20);
        ySlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                ySliderStateChanged(evt);
            }
        });

        xLabel.setText("20");
        xLabel.setText(String.valueOf(xSlider.getValue()));

        yLabel.setText("20");
        yLabel.setText(String.valueOf(ySlider.getValue()));

        jLabel12.setText("Mine population:");

        popSlider.setMaximum(99);
        popSlider.setMinimum(1);
        popSlider.setValue(15);
        popSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                popSliderStateChanged(evt);
            }
        });

        popLabel.setText("20%");
        popLabel.setText(String.valueOf(popSlider.getValue()) + "%");

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.LINE_AXIS));

        lockCheckbox.setSelected(true);
        lockCheckbox.setText("Lock");
        jPanel2.add(lockCheckbox);

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.LINE_AXIS));

        generateButton.setText("Generate!");
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(generateButton);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(popSlider, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ySlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(popLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(yLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .addComponent(xLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(xSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(xLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(ySlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(yLabel)))
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(popSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(popLabel))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane2.setMaximumSize(new Dimension(640, 640));
        jScrollPane2.setMinimumSize(new Dimension(320, 320));
        jScrollPane2.setPreferredSize(new Dimension(640, 640));

        minefieldContainer.setLayout(new BoxLayout(minefieldContainer, BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(minefieldContainer);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xSliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_xSliderStateChanged
        String value = String.valueOf(xSlider.getValue());
        changeLabelValue(xLabel, value);
        if (lockCheckbox.isSelected()) {
            ySlider.setValue(xSlider.getValue());
            changeLabelValue(yLabel, value);
        }
    }//GEN-LAST:event_xSliderStateChanged

    private void ySliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_ySliderStateChanged
        String value = String.valueOf(ySlider.getValue());
        changeLabelValue(yLabel, value);
        if (lockCheckbox.isSelected()) {
            xSlider.setValue(ySlider.getValue());
            changeLabelValue(xLabel, value);
        }
    }//GEN-LAST:event_ySliderStateChanged

    private void popSliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_popSliderStateChanged
        String value = String.valueOf(popSlider.getValue()) + "%";
        changeLabelValue(popLabel, value);
    }//GEN-LAST:event_popSliderStateChanged

    private void generateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        Component[] children = minefieldContainer.getComponents();
        if (children != null) {
            minefieldContainer.removeAll();
            minefieldContainer.repaint();
        }
        MinefieldPanel panel = new MinefieldPanel(xSlider.getValue(), ySlider.getValue(), popSlider.getValue());
        minefieldContainer.add(Box.createHorizontalGlue());
        minefieldContainer.add(panel);
        minefieldContainer.add(Box.createHorizontalGlue());
        pack();
    }//GEN-LAST:event_generateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMSMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMSMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton generateButton;
    private JLabel jLabel12;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel6;
    private JScrollPane jScrollPane2;
    private JCheckBox lockCheckbox;
    private JPanel minefieldContainer;
    private JLabel popLabel;
    private JSlider popSlider;
    private JLabel xLabel;
    private JSlider xSlider;
    private JLabel yLabel;
    private JSlider ySlider;
    // End of variables declaration//GEN-END:variables

    private void additionalInit() {
        SwingUtils.centerOnScreen(this);
    }

    private void changeLabelValue(JLabel label, String value) {
        label.setText(value);
    }

}
