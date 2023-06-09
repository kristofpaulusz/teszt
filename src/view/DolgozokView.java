/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;

/**
 *
 * @author g
 */
public class DolgozokView extends javax.swing.JFrame {

    /**
     * Creates new form DolgozokView
     */
    public DolgozokView() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lanyokLabel = new javax.swing.JLabel();
        fiukLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lanyokList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        fiukList = new javax.swing.JList<>();
        osszesitoPanel = new javax.swing.JPanel();
        lanyBt = new javax.swing.JRadioButton();
        fiuBt = new javax.swing.JRadioButton();
        legidosebbLabel = new javax.swing.JLabel();
        osszesLabel = new javax.swing.JLabel();
        hatEveLabel = new javax.swing.JLabel();
        adatokPanel = new javax.swing.JPanel();
        adatokKorLabel = new javax.swing.JLabel();
        adatokDolgozikLabel = new javax.swing.JLabel();
        genderBox = new javax.swing.JCheckBox();
        mentBt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dolgozók");

        lanyokLabel.setText("Lányok");

        fiukLabel.setText("Fiúk");

        jScrollPane1.setViewportView(lanyokList);

        jScrollPane2.setViewportView(fiukList);

        osszesitoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesítő"));

        buttonGroup1.add(lanyBt);
        lanyBt.setText("lány");

        buttonGroup1.add(fiuBt);
        fiuBt.setText("fiú");

        legidosebbLabel.setText("legidősebb:");

        osszesLabel.setText("összes kor:");

        hatEveLabel.setText("6 éve dolgozó:");

        javax.swing.GroupLayout osszesitoPanelLayout = new javax.swing.GroupLayout(osszesitoPanel);
        osszesitoPanel.setLayout(osszesitoPanelLayout);
        osszesitoPanelLayout.setHorizontalGroup(
            osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszesitoPanelLayout.createSequentialGroup()
                .addGroup(osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(osszesitoPanelLayout.createSequentialGroup()
                        .addComponent(lanyBt)
                        .addGap(18, 18, 18)
                        .addComponent(fiuBt))
                    .addComponent(legidosebbLabel)
                    .addComponent(osszesLabel)
                    .addComponent(hatEveLabel))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        osszesitoPanelLayout.setVerticalGroup(
            osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszesitoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(osszesitoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lanyBt)
                    .addComponent(fiuBt))
                .addGap(27, 27, 27)
                .addComponent(legidosebbLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(osszesLabel)
                .addGap(18, 18, 18)
                .addComponent(hatEveLabel)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        adatokPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Adatok"));

        adatokKorLabel.setText("kor:");

        adatokDolgozikLabel.setText("mióta dolgozik:");

        javax.swing.GroupLayout adatokPanelLayout = new javax.swing.GroupLayout(adatokPanel);
        adatokPanel.setLayout(adatokPanelLayout);
        adatokPanelLayout.setHorizontalGroup(
            adatokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adatokPanelLayout.createSequentialGroup()
                .addGroup(adatokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adatokKorLabel)
                    .addComponent(adatokDolgozikLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        adatokPanelLayout.setVerticalGroup(
            adatokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adatokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adatokKorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adatokDolgozikLabel)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        genderBox.setText("Mindkettő nem");

        mentBt.setText("Ment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lanyokLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(osszesitoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mentBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adatokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fiukLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lanyokLabel)
                        .addComponent(fiukLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(osszesitoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adatokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genderBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mentBt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DolgozokView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DolgozokView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DolgozokView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DolgozokView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DolgozokView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adatokDolgozikLabel;
    private javax.swing.JLabel adatokKorLabel;
    private javax.swing.JPanel adatokPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fiuBt;
    private javax.swing.JLabel fiukLabel;
    private javax.swing.JList<String> fiukList;
    private javax.swing.JCheckBox genderBox;
    private javax.swing.JLabel hatEveLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton lanyBt;
    private javax.swing.JLabel lanyokLabel;
    private javax.swing.JList<String> lanyokList;
    private javax.swing.JLabel legidosebbLabel;
    private javax.swing.JToggleButton mentBt;
    private javax.swing.JLabel osszesLabel;
    private javax.swing.JPanel osszesitoPanel;
    // End of variables declaration//GEN-END:variables

    public void setLegidosebb(int kor) {
        legidosebbLabel.setText("Legidősebb: "+kor+" éves");
    }
    public void setOsszesKor(int osszes) {
        osszesLabel.setText("Összes kor: "+osszes+" év");
    
    }
    public void setHatEve(String nev) {
        hatEveLabel.setText("6 éve dolgozó: "+nev);
    }

    public void addRadioBtListeners(Controller.NemValasztasListener nemValasztasListener) {
        lanyBt.addActionListener(nemValasztasListener);
        fiuBt.addActionListener(nemValasztasListener);
    }

}
