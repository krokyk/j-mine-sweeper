/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kroky.jminesweeper;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kroky.commons.utils.SwingUtils;
import org.kroky.jminesweeper.events.GameStateChangedEvent;
import org.kroky.jminesweeper.events.GameStateChangedListener;
import org.kroky.jminesweeper.utils.StopWatch;
import org.kroky.jminesweeper.utils.StopWatchListener;

/**
 *
 * @author Krokavec Peter
 */
public class JMSMain extends javax.swing.JFrame {

    private static final Logger LOG = LogManager.getFormatterLogger();

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

        jScrollPane2 = new JScrollPane();
        minefieldContainer = new JPanel();
        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        xSlider = new JSlider();
        xLabel = new JLabel();
        jLabel9 = new JLabel();
        ySlider = new JSlider();
        yLabel = new JLabel();
        jPanel2 = new JPanel();
        lockCheckbox = new JCheckBox();
        jPanel3 = new JPanel();
        generateButton = new JButton();
        jPanel4 = new JPanel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        timeCounter = new JButton();
        flagCounter = new JButton();
        jLabel12 = new JLabel();
        popSlider = new JSlider();
        popLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMinesweeper");

        jScrollPane2.setMaximumSize(new Dimension(640, 640));
        jScrollPane2.setMinimumSize(new Dimension(320, 320));
        jScrollPane2.setPreferredSize(new Dimension(640, 640));

        minefieldContainer.setLayout(new BoxLayout(minefieldContainer, BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(minefieldContainer);

        jLabel8.setText("X:");

        xSlider.setMinimum(10);
        xSlider.setToolTipText("");
        xSlider.setValue(10);
        xSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                xSliderStateChanged(evt);
            }
        });

        xLabel.setText("20");
        xLabel.setText(String.valueOf(xSlider.getValue()));

        jLabel9.setText("Y:");

        ySlider.setMinimum(10);
        ySlider.setValue(10);
        ySlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                ySliderStateChanged(evt);
            }
        });

        yLabel.setText("20");
        yLabel.setText(String.valueOf(ySlider.getValue()));

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.LINE_AXIS));

        lockCheckbox.setSelected(true);
        lockCheckbox.setText("Lock");
        jPanel2.add(lockCheckbox);

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.LINE_AXIS));

        generateButton.setMaximumSize(new Dimension(82, 82));
        generateButton.setMinimumSize(new Dimension(82, 82));
        generateButton.setPreferredSize(new Dimension(82, 82));
        generateButton.setIcon(SwingUtils.getIcon("/icons/smiley_start.png", new Dimension(60, 60)));
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(generateButton);

        jLabel2.setText("Flags left:");

        jLabel1.setText("Elapsed time:");

        timeCounter.setBackground(new Color(0, 0, 0));
        timeCounter.setForeground(new Color(255, 0, 0));
        timeCounter.setFocusPainted(false);
        timeCounter.setLabel("00:00");
        timeCounter.setOpaque(false);

        flagCounter.setBackground(new Color(0, 0, 0));
        flagCounter.setForeground(new Color(255, 0, 0));
        flagCounter.setText("0000");
        flagCounter.setFocusPainted(false);
        flagCounter.setOpaque(false);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(timeCounter)
                    .addComponent(flagCounter)))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(timeCounter)
                    .addComponent(jLabel1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(flagCounter)
                    .addComponent(jLabel2)))
        );

        jLabel12.setText("Mine population:");

        popSlider.setMaximum(99);
        popSlider.setMinimum(1);
        popSlider.setValue(5);
        popSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                popSliderStateChanged(evt);
            }
        });

        popLabel.setText("20%");
        popLabel.setText(String.valueOf(popSlider.getValue()) + "%");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(popSlider, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ySlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(yLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .addComponent(popLabel))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(xSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(xLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(ySlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(yLabel)))
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(popSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(popLabel)))
            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        Component[] children = minefieldContainer.getComponents();
        generateButton.setIcon(SwingUtils.getIcon("/icons/smiley_start.png", new Dimension(60, 60)));
        if (children != null) {
            minefieldContainer.removeAll();
            minefieldContainer.repaint();
        }
        MinefieldPanel minefieldPanel = new MinefieldPanel(getSizeX(), getSizeY(), getMineCount());
        minefieldContainer.add(Box.createHorizontalGlue());
        minefieldContainer.add(minefieldPanel);
        minefieldContainer.add(Box.createHorizontalGlue());
        stopWatch.restart();
        pack();
    }//GEN-LAST:event_generateButtonActionPerformed

    private void popSliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_popSliderStateChanged
        final int percent = getPercent();
        String value = String.valueOf(percent) + "%";
        setLabelValue(popLabel, value);
        setFlagCounterText(getMineCount());
    }//GEN-LAST:event_popSliderStateChanged

    private void ySliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_ySliderStateChanged
        String value = String.valueOf(getSizeY());
        setLabelValue(yLabel, value);
        if (lockCheckbox.isSelected()) {
            xSlider.setValue(getSizeY());
            setLabelValue(xLabel, value);
        }
        setFlagCounterText(getMineCount());
    }//GEN-LAST:event_ySliderStateChanged

    private void xSliderStateChanged(ChangeEvent evt) {//GEN-FIRST:event_xSliderStateChanged
        String value = String.valueOf(getSizeX());
        setLabelValue(xLabel, value);
        if (lockCheckbox.isSelected()) {
            ySlider.setValue(getSizeX());
            setLabelValue(yLabel, value);
        }
        setFlagCounterText(getMineCount());
    }//GEN-LAST:event_xSliderStateChanged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e) {
            LOG.warn("Unable to use Nimbus L&F.", e);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JMSMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton flagCounter;
    private JButton generateButton;
    private JLabel jLabel1;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane2;
    private JCheckBox lockCheckbox;
    private JPanel minefieldContainer;
    private JLabel popLabel;
    private JSlider popSlider;
    private JButton timeCounter;
    private JLabel xLabel;
    private JSlider xSlider;
    private JLabel yLabel;
    private JSlider ySlider;
    // End of variables declaration//GEN-END:variables

    private static final GameState GAME_STATE = GameState.getInstance();
    private StopWatch stopWatch;

    private void additionalInit() {
        setFlagCounterText(getMineCount());

        try {
            final Font font = SwingUtils.getFont("/fonts/Digital Dismay.ttf", Font.PLAIN, 32);
            timeCounter.setFont(font);
            flagCounter.setFont(font);
        } catch (FontFormatException | IOException e) {
            LOG.warn("Unable to initialize font for counters. Fallback to default", e);
        }

        stopWatch = new StopWatch(1000, new StopWatchListener(timeCounter));

        SwingUtils.centerOnScreen(this);
        GAME_STATE.addGameStateChangedListener(new GameStateChangedListener() {
            @Override
            public void gameStateChange(GameStateChangedEvent evt) {
                setFlagCounterText(evt.getFlagsRemaining());
            }

            @Override
            public void win(GameStateChangedEvent evt) {
                stopWatch.stop();
                LOG.info("WIN!!!");
                generateButton.setIcon(SwingUtils.getIcon("/icons/smiley_win.png", new Dimension(60, 60)));
            }

            @Override
            public void lose(GameStateChangedEvent evt) {
                stopWatch.stop();
                LOG.info("GAME OVER!!!");
                generateButton.setIcon(SwingUtils.getIcon("/icons/smiley_game_over.png", new Dimension(60, 60)));
            }

        });
        pack();
    }

    private void setFlagCounterText(int remainingFlagCount) {
        String value = String.format("%04d", remainingFlagCount);
        flagCounter.setText(value);
    }

    private void setLabelValue(JLabel label, String value) {
        label.setText(value);
    }

    private int getMineCount() {
        return (int) Math.round(getSizeX() * getSizeY() * (getPercent() / 100.0));
    }

    private int getPercent() {
        return popSlider.getValue();
    }

    private int getSizeX() {
        return xSlider.getValue();
    }

    private int getSizeY() {
        return ySlider.getValue();
    }

}
