/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kroky.jminesweeper;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Krokavec Peter
 */
public class MinefieldPanel extends javax.swing.JPanel {

    MinefieldPanel(int xSize, int ySize) {
        initComponents();
        initMinefield(xSize, ySize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();

        jPanel1.setLayout(new GridBagLayout());

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("jLabel4");
        jLabel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("jLabel5");
        jLabel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("jLabel6");
        jLabel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("jLabel6");
        jLabel7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setText("jLabel6");
        jLabel8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setText("jLabel6");
        jLabel9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
        jPanel1.add(jLabel9, gridBagConstraints);

        setBorder(BorderFactory.createEtchedBorder());
        setLayout(new GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void initMinefield(int xSize, int ySize) {
        Tile[][] tiles = initTiles(xSize, ySize);
        placeMinesToTiles(tiles);
        placeTilesToPanel(tiles);
    }

    private Tile[][] initTiles(int xSize, int ySize) {
        Tile[][] tiles = new Tile[xSize][ySize];
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                tiles[x][y] = new Tile(x, y);
            }
        }
        initNeighbours(tiles);
        return tiles;
    }

    private void initNeighbours(Tile[][] tiles) {
        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[0].length; y++) {
//                //top row
//                tiles[x][y].setNorthwestTile(getTile(tiles, x - 1, y - 1));
//                tiles[x][y].setNorthTile(getTile(tiles, x, y - 1));
//                tiles[x][y].setNortheastTile(getTile(tiles, x + 1, y - 1));
//                //middle row
//                tiles[x][y].setWestTile(getTile(tiles, x - 1, y));
//                tiles[x][y].setEastTile(getTile(tiles, x + 1, y));
//                //bottom row
//                tiles[x][y].setSouthwestTile(getTile(tiles, x - 1, y + 1));
//                tiles[x][y].setSouthTile(getTile(tiles, x, y + 1));
//                tiles[x][y].setSoutheastTile(getTile(tiles, x + 1, y + 1));
                //top row
                tiles[x][y].addNeighbour(getTile(tiles, x - 1, y - 1));
                tiles[x][y].addNeighbour(getTile(tiles, x, y - 1));
                tiles[x][y].addNeighbour(getTile(tiles, x + 1, y - 1));
                //middle row
                tiles[x][y].addNeighbour(getTile(tiles, x - 1, y));
                tiles[x][y].addNeighbour(getTile(tiles, x + 1, y));
                //bottom row
                tiles[x][y].addNeighbour(getTile(tiles, x - 1, y + 1));
                tiles[x][y].addNeighbour(getTile(tiles, x, y + 1));
                tiles[x][y].addNeighbour(getTile(tiles, x + 1, y + 1));
            }
        }
    }

    private Tile getTile(Tile[][] tiles, int x, int y) {
        try {
            return tiles[x][y];
        } catch (IndexOutOfBoundsException e) {
            return null; //if index out of bounds occurs, there's no neighbour at these coordinates
        }
    }

    private void placeMinesToTiles(Tile[][] tiles) {
        //TODO
    }

    private void placeTilesToPanel(Tile[][] tiles) {
        GridBagConstraints gridBagConstraints;

        this.setLayout(new GridBagLayout());

        for (int x = 0; x < tiles.length; x++) {
            for (int y = 0; y < tiles[0].length; y++) {
                gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.gridx = x;
                gridBagConstraints.gridy = y;
                gridBagConstraints.insets = new Insets(-1, -1, -1, -1);
                this.add(tiles[x][y], gridBagConstraints);
            }
        }

    }

}