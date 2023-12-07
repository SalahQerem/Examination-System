package swe_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends javax.swing.JFrame {

    private Integer id;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Integer getId() {
        return id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        login_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        login_massege_lbl = new javax.swing.JLabel();
        password_text = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("BOSS Technologies");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        username_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        login_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        signup_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signup_btn.setText("Sign up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        login_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        password_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(signup_btn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login_btn))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(username_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn)
                    .addComponent(signup_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        if (username_text.getText().equals("") || password_text.getText().equals("")) {
            login_massege_lbl.setText("All fields are required");
            return;
        }

        id = Integer.parseInt(username_text.getText());
        String name = "";

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id, f_name ,l_name, u_password FROM s_user WHERE id = ? and u_password = ?;");
            ps.setInt(1, Integer.parseInt(username_text.getText()));
            ps.setString(2, password_text.getText());

            PreparedStatement pss = conn.prepareStatement("SELECT id, f_name ,l_name, a_password FROM admin WHERE id = ? and a_password = ?;");
            pss.setInt(1, Integer.parseInt(username_text.getText()));
            pss.setString(2, password_text.getText());

            ResultSet rs = ps.executeQuery();
            ResultSet rss = pss.executeQuery();
            if (rss.next()) {
                name = rss.getString("f_name") + " " + rss.getString("l_name");
                Admin_pnl ap = new Admin_pnl(this.id);
                ap.setTitle(name);
                ap.setVisible(true);
                this.setVisible(false);
            } else if (rs.next()) {
                name = rs.getString("f_name") + " " + rs.getString("l_name");
                PreparedStatement psss = conn.prepareStatement("SELECT id FROM contributor WHERE id = ?");
                psss.setInt(1, Integer.parseInt(username_text.getText()));

                ResultSet rsss = psss.executeQuery();
                if (rsss.next()) {
                    Contributor_pnl cp = new Contributor_pnl(this.id);
                    cp.setTitle(name);
                    cp.setVisible(true);
                } else {
                    Student_pnl sp = new Student_pnl(this.id);
                    sp.setTitle(name);
                    sp.setVisible(true);
                }
                psss.close();
                this.setVisible(false);
            } else {
                login_massege_lbl.setText("Username or Password Invalid");
            }
            conn.close();
            ps.close();
            pss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        Sign_up sn = new Sign_up();
        sn.setVisible(true);
    }//GEN-LAST:event_signup_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel login_massege_lbl;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JButton signup_btn;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
