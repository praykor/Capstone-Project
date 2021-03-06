/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ghin
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     *
     * @param rsManager
     */
    public MainPage(ResultSet rsManager) {
        initComponents();
        rsMan = rsManager;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMainMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNotification = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtManager = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnOnline = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPromo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cboPromo = new javax.swing.JComboBox<>();
        btnResetPromo = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnOnorOff = new javax.swing.JPanel();
        pnInstore = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnOnline = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS - Krankies");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpMainMenu.setBackground(new java.awt.Color(153, 153, 153));
        jpMainMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/small-logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/ic_notifications_none_black_48dp_1x.png"))); // NOI18N
        btnNotification.setToolTipText("Notifications");
        btnNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/logout-variant.png"))); // NOI18N
        btnLogout.setToolTipText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtManager.setText("User");

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/information-outline.png"))); // NOI18N
        btnInfo.setToolTipText("About");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/shopping-cart (1).png"))); // NOI18N
        btnOnline.setToolTipText("Online Orders");
        btnOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMainMenuLayout = new javax.swing.GroupLayout(jpMainMenu);
        jpMainMenu.setLayout(jpMainMenuLayout);
        jpMainMenuLayout.setHorizontalGroup(
            jpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                .addComponent(txtManager)
                .addGap(69, 69, 69)
                .addComponent(btnOnline)
                .addGap(18, 18, 18)
                .addComponent(btnNotification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jpMainMenuLayout.setVerticalGroup(
            jpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOnline)
                    .addGroup(jpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtManager))
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnNotification.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Subtotal:");
        jPanel5.add(jLabel6);

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubtotal.setText("0.00");
        jPanel5.add(lblSubtotal);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Discount:");
        jPanel5.add(jLabel7);

        lblPromo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPromo.setText("0.00");
        jPanel5.add(lblPromo);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Tax:");
        jPanel5.add(jLabel8);

        lblTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTax.setText("0.00");
        jPanel5.add(lblTax);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Total:");
        jPanel5.add(jLabel10);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("0.00");
        jPanel5.add(lblTotal);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Promotion");

        cboPromo.setToolTipText("None");
        cboPromo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPromoItemStateChanged(evt);
            }
        });

        btnResetPromo.setText("Clear");
        btnResetPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPromoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetPromo))
                .addGap(28, 28, 28))
        );

        btnPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/ic_payment_black_48dp_1x.png"))); // NOI18N
        btnPay.setText("Pay");
        btnPay.setToolTipText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageRes/ic_cancel_black_48dp_1x.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancel Order");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Qty.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3);

        jScrollPane1.setViewportView(jPanel2);

        pnOnorOff.setLayout(new java.awt.CardLayout(5, 5));

        pnInstore.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnInstore.setLayout(new java.awt.GridLayout(5, 5, 5, 5));
        pnOnorOff.add(pnInstore, "card2");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Customer");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Date");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnOnline.add(jPanel6);

        jScrollPane2.setViewportView(pnOnline);

        pnOnorOff.add(jScrollPane2, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancel)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnOnorOff, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnOnorOff, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnPay))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        accessor = new DBAccessor();
        accessor.connectDB();
        try {
            if (rsMan.next()) {
                txtManager.setText("User: " + rsMan.getString("fname") + " " + rsMan.getString("lname"));
            }
            ResultSet rsProduct = null;
            rsProduct = accessor.getProduct();
            products = new ArrayList<>();
            showPanel("card2");
            transType = "INSTORE";
            while (rsProduct.next()) {
                String image = "src//ImageRes//" + rsProduct.getString(2) + ".jpg";
                image = image.replaceAll("\\s+", "");
                image = image.replaceAll(",", "");
                products.add(new Button(image, rsProduct.getInt(1), rsProduct.getString(2), rsProduct.getString(3), rsProduct.getBigDecimal(4)));
            }
            for (Button i : products) {
                i.setBorder(new LineBorder(Color.black,8));
                i.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
                i.setHorizontalTextPosition(SwingConstants.CENTER);
                i.setText("<html><center><p style=color:black><font bgcolor=white><b>" + i.getName().toUpperCase() + "<br>$" + i.getPrice() + "</font></p></b></center>");
                i.addMouseListener(new java.awt.event.MouseAdapter() {                    
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        Border redline = BorderFactory.createLineBorder(Color.red);
                        i.setBorder(BorderFactory.createCompoundBorder(redline, new LineBorder(Color.black,8)));
                        }
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        i.setBorder(new LineBorder(Color.black,8));
                        }
                    });
                i.addActionListener((ActionEvent ae) -> {
                    i.setQty(i.getQty() + 1);
                    reloadOrder();
                    calculateTotal();
                });
                i.getItem().getBtnRemove().addActionListener((ActionEvent ae) -> {
                    i.setQty(i.getQty() - 1);
                    calculateTotal();
                    if (i.getQty() == 0) {
                        jPanel2.remove(i.getItem());
                        jPanel2.revalidate();
                        jPanel2.repaint();
                    }
                });
                pnInstore.add(i);
            }
            ResultSet rsPromo = null;
            rsPromo = accessor.getPromo();
            promoMap = new HashMap<>();
            while (rsPromo.next()) {
                promoMap.put(rsPromo.getString(1), rsPromo.getBigDecimal(2));
            }
            for (Entry e : promoMap.entrySet()) {
                cboPromo.addItem(e.getKey().toString());
            }
            cboPromo.setSelectedIndex(-1);
            WrapLayout layout = new WrapLayout();
            layout.minimumLayoutSize(jPanel2);
            jPanel2.setLayout(layout);
            WrapLayout layoutOrder = new WrapLayout();
            layout.minimumLayoutSize(pnOnline);
            pnOnline.setLayout(layoutOrder);
            checkNoti();
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnResetPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPromoActionPerformed
        cboPromo.setSelectedIndex(-1);
        promo = BigDecimal.ZERO;
        lblPromo.setText(String.valueOf(promo));
        calculateTotal();
    }//GEN-LAST:event_btnResetPromoActionPerformed

    private void cboPromoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPromoItemStateChanged
        calculateTotal();
    }//GEN-LAST:event_cboPromoItemStateChanged

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if (total.compareTo(BigDecimal.ZERO) > 0) {
            payment = new PaymentPage(this, currentOrder, transType, rsMan, products, (String) cboPromo.getSelectedItem(), subtotal, promo, tax, total);
            this.setVisible(false);
            payment.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "There is nothing to pay. Please check again.", "Nothing to pay", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (transType.equals("ONLINE") && currentOrder != -1) {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure to cancel this order?", "Cancel Order.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                accessor.cancelOrder(currentOrder);
                JOptionPane.showMessageDialog(null, "Order has been canceled.", "Order Canceled", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            resetOrder();
            calculateTotal();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnlineActionPerformed
        if (transType.equals("INSTORE")) {
            transType = "ONLINE";
            btnCancelActionPerformed(evt);
            pnOnline.removeAll();
            pnOnline.add(jPanel6);
            pnOnline.revalidate();
            pnOnline.repaint();
            showPanel("card4");
            cboPromo.setEnabled(false);
            btnResetPromo.setEnabled(false);
            ResultSet rsOrder = null;
            rsOrder = accessor.getOrder();
            orders = new ArrayList<>();
            try {
                while (rsOrder.next()) {
                    orders.add(new Order(rsOrder.getInt(1), rsOrder.getString(2), rsOrder.getString(3), rsOrder.getDate(4), rsOrder.getBigDecimal(5), rsOrder.getString(6)));
                }
                for (Order i : orders) {
                    i.getBtnSelect().addActionListener((ActionEvent ae) -> {
                        ResultSet rsOrderDetail = null;
                        rsOrderDetail = accessor.getOrderDetail(i.getId());
                        try {
                            while (rsOrderDetail.next()) {
                                for (Button j : products) {
                                    if (j.getID() == rsOrderDetail.getInt(1)) {
                                        resetOrder();
                                        j.setQty(rsOrderDetail.getInt(3));
                                    }
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        cboPromo.setSelectedItem(i.getPromo_cd());
                        reloadOrder();
                        calculateTotal();
                        currentOrder = i.getId();
                    });
                    pnOnline.add(i);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            transType = "INSTORE";
            btnCancelActionPerformed(evt);
            showPanel("card2");
            cboPromo.setEnabled(true);
            btnResetPromo.setEnabled(true);
        }
    }//GEN-LAST:event_btnOnlineActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        Info info = new Info();
        info.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationActionPerformed
        checkNoti();
        StringBuilder sb = new StringBuilder("");
        try {
            while (rsNoti.next()) {
                sb.append("Item: " + rsNoti.getString(1).toUpperCase());
                sb.append(" ");
                sb.append("Message: " + rsNoti.getString(2).toUpperCase());
                sb.append("\n");
            }
            if (sb.length() != 0) {
                JOptionPane.showMessageDialog(null, sb, "Notifications", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No notification", "Notifications", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNotificationActionPerformed

    public void checkNoti() {
        rsNoti = null;
        rsNoti = accessor.getNoti();
        try {
            if (rsNoti.next()) {
                btnNotification.setIcon(newNoti);
                rsNoti.beforeFirst();
            } else {
                btnNotification.setIcon(defaultNoti);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetOrder() {
        for (Button i : products) {
            i.setQty(0);
            jPanel2.remove(i.getItem());
            if (transType.equals("INSTORE")) {
                i.getItem().getBtnRemove().setEnabled(true);
            } else {
                i.getItem().getBtnRemove().setEnabled(false);
            }
        }
        jPanel2.revalidate();
        jPanel2.repaint();
        cboPromo.setSelectedIndex(-1);
        currentOrder = -1;
    }

    public void calculateTotal() {
        subtotal = BigDecimal.ZERO;
        tax = BigDecimal.ZERO;
        total = BigDecimal.ZERO;
        for (Button i : products) {
            subtotal = subtotal.add(i.getItem().getTotalPrice());
        }
        if (promoMap.containsKey((String) cboPromo.getSelectedItem())) {
            promo = promoMap.get((String) cboPromo.getSelectedItem());
        } else {
            promo = BigDecimal.ZERO;
        }

        if (promo.compareTo(subtotal) > 0) {
            promo = subtotal;
        }

        tax = (subtotal.subtract(promo)).multiply(TAX_RATE).setScale(2, RoundingMode.HALF_UP);
        total = subtotal.subtract(promo).add(tax);
        lblPromo.setText(String.valueOf(promo));
        lblSubtotal.setText(String.valueOf(subtotal));
        lblTax.setText(String.valueOf(tax));
        lblTotal.setText(String.valueOf(total));
    }

    public void reloadOrder() {
        for (Button i : products) {
            if (i.getItem().getQty() != 0) {
                jPanel2.add(i.getItem());
                jPanel2.revalidate();
                jPanel2.repaint();
            }
        }
    }
    PaymentPage payment;

    /**
     * @param args the command line arguments
     */
    private void showPanel(String pnName) {
        CardLayout layout = (CardLayout) pnOnorOff.getLayout();
        layout.show(pnOnorOff, pnName);
    }
    private ResultSet rsNoti;
    private ImageIcon defaultNoti = new ImageIcon("src/ImageRes/ic_notifications_none_black_48dp_1x.png");
    private ImageIcon newNoti = new ImageIcon("src/ImageRes/notifications-button.png");
    private DBAccessor accessor;
    private int currentOrder = -1;
    private String transType;
    private final BigDecimal TAX_RATE = new BigDecimal("0.075");
    private BigDecimal subtotal = BigDecimal.ZERO;
    private BigDecimal promo = BigDecimal.ZERO;
    private BigDecimal tax = BigDecimal.ZERO;
    private BigDecimal total = BigDecimal.ZERO;
    private List<Order> orders;
    private List<Button> products;
    private Map<String, BigDecimal> promoMap;
    private ResultSet rsMan = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnOnline;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnResetPromo;
    private javax.swing.JComboBox<String> cboPromo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpMainMenu;
    private javax.swing.JLabel lblPromo;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnInstore;
    private javax.swing.JPanel pnOnline;
    private javax.swing.JPanel pnOnorOff;
    private javax.swing.JLabel txtManager;
    // End of variables declaration//GEN-END:variables
}
