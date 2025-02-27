package GUI;

import Classes.Player;
import DAO.ErpDAOException;
import DAO.playerDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class AlteraPlayer extends javax.swing.JFrame {
    private Player P = new Player();
    int id, posicao;
    private static ArrayList<Player> players = new ArrayList<Player>();
  
    public AlteraPlayer() {
        initComponents();
        setResizable(false); //sem tela cheia
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OK = new javax.swing.JButton();
        CAN = new javax.swing.JButton();
        COMBO = new javax.swing.JComboBox<>();
        RBM1 = new javax.swing.JRadioButton();
        RBF1 = new javax.swing.JRadioButton();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RBM = new javax.swing.JRadioButton();
        RBF = new javax.swing.JRadioButton();
        T3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        OK.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        OK.setText("OK");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });

        CAN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CAN.setText("cancelar");
        CAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANMouseClicked(evt);
            }
        });
        CAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANActionPerformed(evt);
            }
        });

        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });

        RBM1.setText("Xbox");
        RBM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBM1ActionPerformed(evt);
            }
        });

        RBF1.setText("Playstation");
        RBF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBF1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nickname:");

        jLabel2.setText("Email:");

        jLabel4.setText("Plataforma:");

        RBM.setText("Nintendo Switch");
        RBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMActionPerformed(evt);
            }
        });

        RBF.setText("PC");

        jLabel5.setText("Mude a plataforma aqui ==>>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBM, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBM1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBF1)
                    .addComponent(RBF))
                .addGap(0, 155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(CAN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RBM)
                            .addComponent(RBF))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBM1)
                        .addComponent(RBF1))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAN)
                    .addComponent(OK))
                .addGap(77, 77, 77))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        Player M = new Player();
        String plat = null;
        M.setId_player(id);
        if (T1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O Campo nickname não pode estar vazio");
        }else if(T2.getText().equals("")){
             JOptionPane.showMessageDialog(rootPane, "O Campo email não pode estar vazio");
        } 
        else {
            M.setNickname(T1.getText());
            M.setEmail(T2.getText());
            M.setPlataforma(T3.getText());
            if (RBF1.isSelected() == true) {
                plat = "Playstation";
            }else if (RBM.isSelected() == true) {
                plat= "Nintendo Switch";
            }
            if (RBM1.isSelected() == true) {
                plat= "Xbox";
            }
            if (RBF.isSelected() == true) {
                plat= "PC";
            }
            M.setPlataforma(plat);
                playerDAO PDAO = new playerDAO();
            try {
                PDAO.atualizar(M);
            } catch (ErpDAOException ex) {
                Logger.getLogger(AlteraPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
                JOptionPane.showMessageDialog(rootPane, "Atualização efetuada com sucesso!!");
            dispose();
        }
    }//GEN-LAST:event_OKMouseClicked

    private void CANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANMouseClicked
        dispose();
    }//GEN-LAST:event_CANMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregaCombo();
        carrega();
    }//GEN-LAST:event_formComponentShown

    private void CANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANActionPerformed

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        posicao = (int) COMBO.getSelectedIndex();
        id = players.get(posicao).getId_player();
        carrega();
    }//GEN-LAST:event_COMBOItemStateChanged

    private void RBM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBM1ActionPerformed

    private void RBF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBF1ActionPerformed

    private void RBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBMActionPerformed
public static void carregaCombo() {
            COMBO.removeAllItems();
           playerDAO MDAO = new playerDAO();
           players = MDAO.listar();
        for (int i = 0; i < players.size(); i++) {
            COMBO.addItem(players.get(i).getId_player() + "");
        }
    }

public void carrega(){
    playerDAO MDAO = new playerDAO();
        try {
            P = MDAO.procurar(id);
        } catch (ErpDAOException ex) {
            Logger.getLogger(AlteraPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        T1.setText(P.getNickname());
        T2.setText(P.getEmail().toLowerCase());
        if (P.getPlataforma() == "Playstation") {
            RBF1.setSelected(true);
        }else if (P.getPlataforma() == "Nintendo Switch") {
            RBM.setSelected(true);
        }else if (P.getPlataforma() == "PC") {
            RBF.setSelected(true);
        }else if (P.getPlataforma() == "Xbox") {
            RBM1.setSelected(true);
        }
        T3.setText(P.getPlataforma());
       
}

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAN;
    private static javax.swing.JComboBox<String> COMBO;
    private javax.swing.JButton OK;
    private javax.swing.JRadioButton RBF;
    private javax.swing.JRadioButton RBF1;
    private javax.swing.JRadioButton RBM;
    private javax.swing.JRadioButton RBM1;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
