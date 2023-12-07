package swe_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Admin_pnl extends javax.swing.JFrame {

    private int id;

    public Admin_pnl(Object o) {
        initComponents();
        setLocationRelativeTo(null);
        id = (Integer) o;
        setLocationRelativeTo(null);
        add_course_type_scrl.removeAllItems();
        add_course_type_scrl.addItem("Select type of Course");
        add_course_type_scrl.addItem("Uni. Requirement (Optional)");
        add_course_type_scrl.addItem("Uni. Requirement (Mandatory)");
        add_course_type_scrl.addItem("Faculty Requirement (Mandatory)");
        add_course_type_scrl.addItem("Maj. Requirement (Optional)");
        add_course_type_scrl.addItem("Maj. Requirement (Mandatory)");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_course_name_text = new javax.swing.JTextField();
        add_course_id_text = new javax.swing.JTextField();
        add_course_type_scrl = new javax.swing.JComboBox<>();
        add_course_btn = new javax.swing.JButton();
        add_course_massege_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_tbl = new javax.swing.JTable();
        show_course_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        delete_course_id_text = new javax.swing.JTextField();
        delete_course_btn = new javax.swing.JButton();
        delete_course_massege_lbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        add_admin_fname_text = new javax.swing.JTextField();
        add_admin_id_text = new javax.swing.JTextField();
        add_admin_email_text = new javax.swing.JTextField();
        add_admin_lname_text = new javax.swing.JTextField();
        add_admin_btn = new javax.swing.JButton();
        add_admin_massege_lbl = new javax.swing.JLabel();
        add_admin_password_text = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        admin_tbl = new javax.swing.JTable();
        show_admin_btn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        delete_admin_id_text = new javax.swing.JTextField();
        delete_admin_btn = new javax.swing.JButton();
        delete_admin_massege_lbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        add_contributor_id_text = new javax.swing.JTextField();
        add_contributor_btn = new javax.swing.JButton();
        add_contributor_massege_lbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contributor_tbl = new javax.swing.JTable();
        show_contributor_btn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        delete_contributor_id_text = new javax.swing.JTextField();
        delete_contributor_btn = new javax.swing.JButton();
        delete_contributor_massege_lbl = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        student_tbl = new javax.swing.JTable();
        show_student_btn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        show_student_name_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("New Course");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Show Courses");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Course ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Course name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Course type");

        add_course_name_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_course_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_course_type_scrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_course_type_scrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add_course_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_course_btn.setText("Add");
        add_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_course_btnActionPerformed(evt);
            }
        });

        add_course_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        course_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course name", "Course type"
            }
        ));
        jScrollPane1.setViewportView(course_tbl);

        show_course_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_course_btn.setText("Show Courses");
        show_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_course_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Course ID ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Delete Course");

        delete_course_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        delete_course_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete_course_btn.setText("Delete");
        delete_course_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_course_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_course_massege_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_course_id_text)
                            .addComponent(add_course_name_text)
                            .addComponent(add_course_type_scrl, 0, 150, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6))))
                    .addComponent(add_course_btn))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_course_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete_course_btn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(delete_course_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(delete_course_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(add_course_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(add_course_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(add_course_type_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_course_btn)
                    .addComponent(show_course_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_course_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_course_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_course_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_course_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Course", jPanel1);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("New Admin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Show Admins");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setText("Delete Admin");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Admin ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Last name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("email");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Password");

        add_admin_fname_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_admin_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_admin_email_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_admin_lname_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_admin_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_admin_btn.setText("Add");
        add_admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_admin_btnActionPerformed(evt);
            }
        });

        add_admin_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_admin_password_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        admin_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "name", "email"
            }
        ));
        jScrollPane2.setViewportView(admin_tbl);

        show_admin_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_admin_btn.setText("Show Admins");
        show_admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_admin_btnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Admin ID");

        delete_admin_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        delete_admin_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete_admin_btn.setText("Delete");
        delete_admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_admin_btnActionPerformed(evt);
            }
        });

        delete_admin_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(add_admin_btn)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(125, 125, 125)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add_admin_lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add_admin_fname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add_admin_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(add_admin_password_text)
                                            .addComponent(add_admin_email_text, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                                .addComponent(add_admin_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete_admin_btn)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(177, 177, 177)
                                .addComponent(delete_admin_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(delete_admin_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(show_admin_btn)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(add_admin_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(add_admin_fname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(add_admin_lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(add_admin_email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(add_admin_password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show_admin_btn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(add_admin_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_admin_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_admin_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_admin_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_admin_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Admin", jPanel4);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setText("New Contributor");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel18.setText("Show Contributor");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setText("Delete Contributor");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Contributor ID");

        add_contributor_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_contributor_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_contributor_btn.setText("Add");
        add_contributor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_contributor_btnActionPerformed(evt);
            }
        });

        add_contributor_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        contributor_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contributor ID", "name", "email", "Major"
            }
        ));
        jScrollPane3.setViewportView(contributor_tbl);

        show_contributor_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_contributor_btn.setText("Show Contributors");
        show_contributor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_contributor_btnActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Admin ID");

        delete_contributor_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        delete_contributor_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete_contributor_btn.setText("Delete");
        delete_contributor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_contributor_btnActionPerformed(evt);
            }
        });

        delete_contributor_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel21.setText("Show Students");

        student_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "name", "email", "Major"
            }
        ));
        jScrollPane4.setViewportView(student_tbl);

        show_student_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_student_btn.setText("Show Student");
        show_student_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_student_btnActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Student  f_name");

        show_student_name_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_contributor_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(282, 282, 282)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(add_contributor_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_contributor_btn))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel21))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(show_student_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(show_student_btn))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(show_contributor_btn)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_contributor_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(delete_contributor_btn)
                                    .addComponent(delete_contributor_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_contributor_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel25)
                            .addComponent(delete_contributor_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_contributor_btn)
                            .addComponent(delete_contributor_btn)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(show_student_btn)
                                    .addComponent(jLabel22)
                                    .addComponent(show_student_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(show_contributor_btn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_contributor_massege_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(delete_contributor_massege_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Contributor", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("User", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_course_btnActionPerformed
        if (add_course_id_text.getText().equals("") || add_course_name_text.getText().equals("") || add_course_type_scrl.getSelectedItem().equals("Select type of Course")) {
            add_course_massege_lbl.setText("All fields are required");
            return;
        }

        String type = "";
        switch (add_course_type_scrl.getSelectedItem().toString()) {
            case "Uni. Requirement (Optional)":
                type = "URO";
                break;
            case "Uni. Requirement (Mandatory)":
                type = "URM";
                break;
            case "Faculty Requirement (Mandatory)":
                type = "FRM";
                break;
            case "Maj. Requirement (Optional)":
                type = "MRO";
                break;
            case "Maj. Requirement (Mandatory)":
                type = "MRM";
                break;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Insert INTO course(id, name, c_type, admin_id) VALUES (?, ?, ?, ?);");
            ps.setInt(1, Integer.parseInt(add_course_id_text.getText()));
            ps.setString(2, add_course_name_text.getText());
            ps.setString(3, type);
            ps.setInt(4, id);
            ps.executeUpdate();

            add_course_massege_lbl.setText("Added");
            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_course_btnActionPerformed

    private void show_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_course_btnActionPerformed
        DefaultTableModel t = (DefaultTableModel) course_tbl.getModel();
        t.setRowCount(0);

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id, name, c_type FROM course;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {rs.getString("id"), rs.getString("name"), rs.getString("c_type")};
                DefaultTableModel tm = (DefaultTableModel) course_tbl.getModel();
                tm.addRow(s);
            }

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_show_course_btnActionPerformed

    private void delete_course_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_course_btnActionPerformed
        if (delete_course_id_text.equals("")) {
            delete_course_massege_lbl.setText("Course ID is required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM course WHERE course.id = ?;");
            ps.setInt(1, Integer.parseInt(delete_course_id_text.getText()));
            ps.executeUpdate();
            delete_course_massege_lbl.setText("Done");

            conn.close();
            ps.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_delete_course_btnActionPerformed

    private void add_admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_admin_btnActionPerformed
        if (add_admin_id_text.getText().equals("") || add_admin_fname_text.getText().equals("") || add_admin_lname_text.getText().equals("") || add_admin_email_text.getText().equals("") || add_admin_password_text.getText().equals("")) {
            add_admin_massege_lbl.setText("All fields are required");
            return;
        }
        if (add_admin_password_text.getText().length() < 8) {
            add_admin_massege_lbl.setText("The Password must be more than 7 character");
            return;
        }
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Insert INTO admin(id, f_name, l_name, email, a_password) VALUES (?, ?, ?, ?, ?);");
            ps.setInt(1, Integer.parseInt(add_admin_id_text.getText()));
            ps.setString(2, add_admin_fname_text.getText());
            ps.setString(3, add_admin_lname_text.getText());
            ps.setString(4, add_admin_email_text.getText());
            ps.setString(5, add_admin_password_text.getText());
            ps.executeUpdate();

            add_admin_massege_lbl.setText("Added");
            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_admin_btnActionPerformed

    private void show_admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_admin_btnActionPerformed
        DefaultTableModel t = (DefaultTableModel) admin_tbl.getModel();
        t.setRowCount(0);

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id, f_name, l_name, email FROM admin;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {rs.getString("id"), rs.getString("f_name") + rs.getString("l_name"), rs.getString("email")};
                DefaultTableModel tm = (DefaultTableModel) admin_tbl.getModel();
                tm.addRow(s);
            }

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_show_admin_btnActionPerformed

    private void delete_admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_admin_btnActionPerformed
        if (delete_admin_id_text.equals("")) {
            delete_admin_massege_lbl.setText("Admin ID is required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM admin WHERE admin.id = ?;");
            ps.setInt(1, Integer.parseInt(delete_admin_id_text.getText()));
            ps.executeUpdate();
            delete_admin_massege_lbl.setText("Done");

            conn.close();
            ps.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_delete_admin_btnActionPerformed

    private void add_contributor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_contributor_btnActionPerformed
        if (add_contributor_id_text.getText().equals("")) {
            add_contributor_massege_lbl.setText("Contributor ID are required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Insert INTO contributor(id, admin_ID) VALUES (?, ?);");
            ps.setInt(1, Integer.parseInt(add_contributor_id_text.getText()));
            ps.setInt(2, id);
            ps.executeUpdate();

            add_contributor_massege_lbl.setText("Added");
            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_contributor_btnActionPerformed

    private void show_contributor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_contributor_btnActionPerformed
        DefaultTableModel t = (DefaultTableModel) contributor_tbl.getModel();
        t.setRowCount(0);

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT s_user.id, f_name, l_name, uni_email, major FROM s_user, contributor where contributor.id = s_user.id;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {rs.getString("id"), rs.getString("f_name") + rs.getString("l_name"), rs.getString("uni_email"), rs.getString("major")};
                DefaultTableModel tm = (DefaultTableModel) contributor_tbl.getModel();
                tm.addRow(s);
            }

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_show_contributor_btnActionPerformed

    private void delete_contributor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_contributor_btnActionPerformed
        if (delete_contributor_id_text.equals("")) {
            delete_contributor_massege_lbl.setText("Contributor ID is required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM contributor WHERE contributor.id = ?;");
            ps.setInt(1, Integer.parseInt(delete_contributor_id_text.getText()));
            ps.executeUpdate();
            delete_contributor_massege_lbl.setText("Done");

            conn.close();
            ps.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_delete_contributor_btnActionPerformed

    private void show_student_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_student_btnActionPerformed
        DefaultTableModel t = (DefaultTableModel) student_tbl.getModel();
        t.setRowCount(0);

        if (show_student_name_text.getText().equals("")) {
            Connection conn = DBConnection.getConnection();
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT s_user.id, f_name, l_name, uni_email, major FROM s_user, student where s_user.id = student.id;");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String s[] = {rs.getString("id"), rs.getString("f_name") + rs.getString("l_name"), rs.getString("uni_email"), rs.getString("major")};
                    DefaultTableModel tm = (DefaultTableModel) student_tbl.getModel();
                    tm.addRow(s);
                }

                conn.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        } else {
            Connection conn = DBConnection.getConnection();
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT s_user.id, f_name, l_name, email FROM s_user, student where s_user.id = student.id and f_name = ?;");
                ps.setString(1, show_student_name_text.getText());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String s[] = {rs.getString("id"), rs.getString("f_name") + rs.getString("l_name"), rs.getString("email")};
                    DefaultTableModel tm = (DefaultTableModel) student_tbl.getModel();
                    tm.addRow(s);
                }

                conn.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });

    }//GEN-LAST:event_show_student_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_admin_btn;
    private javax.swing.JTextField add_admin_email_text;
    private javax.swing.JTextField add_admin_fname_text;
    private javax.swing.JTextField add_admin_id_text;
    private javax.swing.JTextField add_admin_lname_text;
    private javax.swing.JLabel add_admin_massege_lbl;
    private javax.swing.JPasswordField add_admin_password_text;
    private javax.swing.JButton add_contributor_btn;
    private javax.swing.JTextField add_contributor_id_text;
    private javax.swing.JLabel add_contributor_massege_lbl;
    private javax.swing.JButton add_course_btn;
    private javax.swing.JTextField add_course_id_text;
    private javax.swing.JLabel add_course_massege_lbl;
    private javax.swing.JTextField add_course_name_text;
    private javax.swing.JComboBox<String> add_course_type_scrl;
    private javax.swing.JTable admin_tbl;
    private javax.swing.JTable contributor_tbl;
    private javax.swing.JTable course_tbl;
    private javax.swing.JButton delete_admin_btn;
    private javax.swing.JTextField delete_admin_id_text;
    private javax.swing.JLabel delete_admin_massege_lbl;
    private javax.swing.JButton delete_contributor_btn;
    private javax.swing.JTextField delete_contributor_id_text;
    private javax.swing.JLabel delete_contributor_massege_lbl;
    private javax.swing.JButton delete_course_btn;
    private javax.swing.JTextField delete_course_id_text;
    private javax.swing.JLabel delete_course_massege_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton show_admin_btn;
    private javax.swing.JButton show_contributor_btn;
    private javax.swing.JButton show_course_btn;
    private javax.swing.JButton show_student_btn;
    private javax.swing.JTextField show_student_name_text;
    private javax.swing.JTable student_tbl;
    // End of variables declaration//GEN-END:variables
}
