package swe_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Contributor_pnl extends javax.swing.JFrame {

    private int id = 0, e_id = 0, ques_in = 1;

    public Contributor_pnl(Object l) {
        initComponents();
        setLocationRelativeTo(null);
        id = (Integer) l;

        add_exam_type_scroll.removeAllItems();
        add_exam_type_scroll.addItem("Select type");
        add_exam_type_scroll.addItem("Mid");
        add_exam_type_scroll.addItem("Final");

        courses_type_scrl.removeAllItems();
        courses_type_scrl.addItem("Select type of Course");
        courses_type_scrl.addItem("Uni. Requirement (Optional)");
        courses_type_scrl.addItem("Uni. Requirement (Mandatory)");
        courses_type_scrl.addItem("Faculty Requirement (Mandatory)");
        courses_type_scrl.addItem("Maj. Requirement (Optional)");
        courses_type_scrl.addItem("Maj. Requirement (Mandatory)");

        courses_scrl.removeAllItems();
        courses_scrl.addItem("Select Course");

        courses_type_scrl1.removeAllItems();
        courses_type_scrl1.addItem("Select type of Course");
        courses_type_scrl1.addItem("Uni. Requirement (Optional)");
        courses_type_scrl1.addItem("Uni. Requirement (Mandatory)");
        courses_type_scrl1.addItem("Faculty Requirement (Mandatory)");
        courses_type_scrl1.addItem("Maj. Requirement (Optional)");
        courses_type_scrl1.addItem("Maj. Requirement (Mandatory)");

        courses_scrl1.removeAllItems();
        courses_scrl1.addItem("Select Course");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        courses_type_scrl = new javax.swing.JComboBox<>();
        courses_scrl = new javax.swing.JComboBox<>();
        add_exam_time_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add_exam_type_scroll = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques_text_area = new javax.swing.JTextArea();
        ques_num_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ch2_text = new javax.swing.JTextField();
        ch3_text = new javax.swing.JTextField();
        ch4_text = new javax.swing.JTextField();
        ch1_text = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        right_choice_text = new javax.swing.JTextField();
        add_exam_info_btn = new javax.swing.JButton();
        next_ques_btn = new javax.swing.JButton();
        add_exam_btn = new javax.swing.JButton();
        add_exam_massege_lbl = new javax.swing.JLabel();
        add_exam_info_massege_lbl = new javax.swing.JLabel();
        add_ques_massege_lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        courses_type_scrl1 = new javax.swing.JComboBox<>();
        courses_scrl1 = new javax.swing.JComboBox<>();
        add_material_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        add_material_url_area = new javax.swing.JTextArea();
        add_material_btn = new javax.swing.JButton();
        add_material_massege_lbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        add_video_url_area = new javax.swing.JTextArea();
        add_video_btn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        add_video_massege_lbl = new javax.swing.JLabel();
        add_video_material_name_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contributor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("New Exam");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Exam type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Time period (in minutes)");

        courses_type_scrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_type_scrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        courses_type_scrl.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courses_type_scrlItemStateChanged(evt);
            }
        });

        courses_scrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_scrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add_exam_time_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Course");

        add_exam_type_scroll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_exam_type_scroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ques_text_area.setColumns(20);
        ques_text_area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ques_text_area.setRows(5);
        jScrollPane1.setViewportView(ques_text_area);

        ques_num_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ques_num_lbl.setText("Questions");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Choices");

        ch2_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ch3_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ch4_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ch1_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("3");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("4");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Right Choice (number of choice)");

        right_choice_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_exam_info_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_exam_info_btn.setText("Save");
        add_exam_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_exam_info_btnActionPerformed(evt);
            }
        });

        next_ques_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        next_ques_btn.setText("Next Question");
        next_ques_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_ques_btnActionPerformed(evt);
            }
        });

        add_exam_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_exam_btn.setText("Add Exam");
        add_exam_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_exam_btnActionPerformed(evt);
            }
        });

        add_exam_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_exam_info_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_ques_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("New Material");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Material name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Course");

        courses_type_scrl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_type_scrl1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        courses_type_scrl1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courses_type_scrl1ItemStateChanged(evt);
            }
        });

        courses_scrl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_scrl1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add_material_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("URL");

        add_material_url_area.setColumns(20);
        add_material_url_area.setRows(5);
        jScrollPane2.setViewportView(add_material_url_area);

        add_material_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_material_btn.setText("Add");
        add_material_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_material_btnActionPerformed(evt);
            }
        });

        add_material_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("New Video");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Material");

        add_video_url_area.setColumns(20);
        add_video_url_area.setRows(5);
        jScrollPane3.setViewportView(add_video_url_area);

        add_video_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_video_btn.setText("Add");
        add_video_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_video_btnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("URL");

        add_video_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_video_material_name_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(add_exam_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(add_exam_btn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_exam_info_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_exam_info_btn))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courses_type_scrl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(add_exam_time_text)
                                        .addComponent(add_exam_type_scroll, 0, 160, Short.MAX_VALUE))
                                    .addComponent(courses_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(45, 45, 45)
                                        .addComponent(ch4_text, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ch1_text, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ch2_text, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ch3_text, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(right_choice_text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ques_num_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(next_ques_btn)
                            .addComponent(add_ques_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(courses_type_scrl1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add_material_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(courses_scrl1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(add_material_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add_material_btn)))
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel17)
                                            .addComponent(add_video_material_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_video_btn)
                                    .addComponent(add_video_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(add_exam_type_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(add_material_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(add_exam_time_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(courses_type_scrl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courses_scrl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courses_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courses_type_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_exam_info_btn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_exam_info_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ques_num_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_material_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_material_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_video_material_name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch1_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch2_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch3_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch4_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(right_choice_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(next_ques_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_ques_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_video_btn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(add_exam_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_video_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(add_exam_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_exam_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_exam_info_btnActionPerformed
        String type = "";
        Integer c_id = 0;
        if (add_exam_time_text.getText().equals("") || add_exam_type_scroll.getSelectedItem().equals("Select type") || courses_scrl.getSelectedItem().equals("Select Course") || courses_type_scrl.getSelectedItem().equals("Select type of Course")) {
            add_exam_info_massege_lbl.setText("All fields are required");
            return;
        }

        if (add_exam_type_scroll.getSelectedIndex() == 1) {
            type = "Mid";
        } else {
            type = "Final";
        }
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement p = conn.prepareStatement("SELECT id FROM course WHERE name = ?;");
            p.setString(1, courses_scrl.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                c_id = rs.getInt("id");
            }

            PreparedStatement pss = conn.prepareStatement("SELECT max(id) FROM exam;");
            ResultSet rss = pss.executeQuery();
            if (rss.next()) {
                e_id = rss.getInt("max(id)") + 1;
            } else {
                e_id = 1;
            }

            PreparedStatement ps = conn.prepareStatement("Insert INTO exam(id, required_time, e_type, course_id, contributor_id) VALUES (?, ?, ?, ?, ?);");
            ps.setInt(1, e_id);
            ps.setInt(2, Integer.parseInt(add_exam_time_text.getText()));
            ps.setString(3, type);
            ps.setInt(4, c_id);
            ps.setInt(5, id);
            ps.executeUpdate();

            add_exam_info_massege_lbl.setText("Added");
            conn.close();
            p.close();
            ps.close();
            pss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_exam_info_btnActionPerformed

    private void next_ques_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_ques_btnActionPerformed
        if (e_id == 0 || ques_text_area.getText().equals("") || ch1_text.getText().equals("") || ch2_text.getText().equals("") || ch3_text.getText().equals("") || ch4_text.getText().equals("") || right_choice_text.getText().equals("")) {
            add_ques_massege_lbl.setText("Complete the Question");
            return;
        }

        Set<String> s = new HashSet<>();
        s.add(ch1_text.getText());
        s.add(ch2_text.getText());
        s.add(ch3_text.getText());
        s.add(ch4_text.getText());
        if (s.size() < 4) {
            add_ques_massege_lbl.setText("Choices must be different");
            return;
        }

        if (!(Integer.parseInt(right_choice_text.getText()) > 0 && Integer.parseInt(right_choice_text.getText()) < 5)) {
            add_ques_massege_lbl.setText("Right Answer must be in range 1 to 4");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Insert INTO question(q_text, fi_choice, s_choice, th_choice, fo_choice, right_choice, exam_id) VALUES (?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, ques_text_area.getText());
            ps.setString(2, ch1_text.getText());
            ps.setString(3, ch2_text.getText());
            ps.setString(4, ch3_text.getText());
            ps.setString(5, ch4_text.getText());
            ps.setInt(6, Integer.parseInt(right_choice_text.getText()));
            ps.setInt(7, e_id);
            ps.executeUpdate();

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        ques_text_area.setText("");
        ch1_text.setText("");
        ch2_text.setText("");
        ch3_text.setText("");
        ch4_text.setText("");
        right_choice_text.setText("");
        ques_num_lbl.setText("Question " + ques_in);
        add_ques_massege_lbl.setText("");
        ques_in++;
    }//GEN-LAST:event_next_ques_btnActionPerformed

    private void add_exam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_exam_btnActionPerformed
        add_exam_massege_lbl.setText(ques_in + "Questions Added for this Exam");
        add_exam_info_massege_lbl.setText("");
        ques_in = 0;
    }//GEN-LAST:event_add_exam_btnActionPerformed

    private void courses_type_scrlItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courses_type_scrlItemStateChanged
        String type = "";

        switch (courses_type_scrl.getSelectedIndex()) {
            case 1:
                type = "URO";
                break;
            case 2:
                type = "URM";
                break;
            case 3:
                type = "FRM";
                break;
            case 4:
                type = "MRO";
                break;
            case 5:
                type = "MRM";
                break;
        }

        courses_scrl.removeAllItems();
        courses_scrl.addItem("Select Course");

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT name FROM course WHERE c_type = ?;");
            ps.setString(1, type);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                courses_scrl.addItem(rs.getString("name"));
            }
            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_courses_type_scrlItemStateChanged

    private void courses_type_scrl1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courses_type_scrl1ItemStateChanged
        String type = "";

        switch (courses_type_scrl1.getSelectedIndex()) {
            case 1:
                type = "URO";
                break;
            case 2:
                type = "URM";
                break;
            case 3:
                type = "FRM";
                break;
            case 4:
                type = "MRO";
                break;
            case 5:
                type = "MRM";
                break;
        }

        courses_scrl1.removeAllItems();
        courses_scrl1.addItem("Select Course");

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT name FROM course WHERE c_type = ?;");
            ps.setString(1, type);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                courses_scrl1.addItem(rs.getString("name"));
            }
            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_courses_type_scrl1ItemStateChanged

    private void add_material_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_material_btnActionPerformed
        if (add_material_name.getText().equals("") || add_material_url_area.getText().equals("")) {
            add_material_massege_lbl.setText("All fields are required");
            return;
        }

        Integer c_id = 0;
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement p = conn.prepareStatement("SELECT id FROM course WHERE name = ?;");
            p.setString(1, courses_scrl1.getSelectedItem().toString());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                c_id = rs.getInt("id");
            }

            PreparedStatement ps = conn.prepareStatement("Insert INTO material(url, name, course_id, contributor_id) VALUES (?, ?, ?, ?);");
            ps.setString(1, add_material_url_area.getText());
            ps.setString(2, add_material_name.getText());
            ps.setInt(3, c_id);
            ps.setInt(4, id);
            ps.executeUpdate();

            add_material_massege_lbl.setText("Added");
            conn.close();
            p.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_material_btnActionPerformed

    private void add_video_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_video_btnActionPerformed
        if (add_video_material_name_text.getText().equals("") || add_video_url_area.getText().equals("")) {
            add_video_massege_lbl.setText("All fields are required");
            return;
        }

        String m_id = "";
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement p = conn.prepareStatement("SELECT url FROM material WHERE name = ?;");
            p.setString(1, add_video_material_name_text.getText());
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                m_id = rs.getString("url");
            }

            if (m_id == "") {
                add_video_massege_lbl.setText("This Material not exist");
            }

            PreparedStatement ps = conn.prepareStatement("Insert INTO video(url, material_id) VALUES (?, ?);");
            ps.setString(1, add_video_url_area.getText());
            ps.setString(2, m_id);
            ps.executeUpdate();

            add_video_massege_lbl.setText("Added");
            conn.close();
            p.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }//GEN-LAST:event_add_video_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_exam_btn;
    private javax.swing.JButton add_exam_info_btn;
    private javax.swing.JLabel add_exam_info_massege_lbl;
    private javax.swing.JLabel add_exam_massege_lbl;
    private javax.swing.JTextField add_exam_time_text;
    private javax.swing.JComboBox<String> add_exam_type_scroll;
    private javax.swing.JButton add_material_btn;
    private javax.swing.JLabel add_material_massege_lbl;
    private javax.swing.JTextField add_material_name;
    private javax.swing.JTextArea add_material_url_area;
    private javax.swing.JLabel add_ques_massege_lbl;
    private javax.swing.JButton add_video_btn;
    private javax.swing.JLabel add_video_massege_lbl;
    private javax.swing.JTextField add_video_material_name_text;
    private javax.swing.JTextArea add_video_url_area;
    private javax.swing.JTextField ch1_text;
    private javax.swing.JTextField ch2_text;
    private javax.swing.JTextField ch3_text;
    private javax.swing.JTextField ch4_text;
    private javax.swing.JComboBox<String> courses_scrl;
    private javax.swing.JComboBox<String> courses_scrl1;
    private javax.swing.JComboBox<String> courses_type_scrl;
    private javax.swing.JComboBox<String> courses_type_scrl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton next_ques_btn;
    private javax.swing.JLabel ques_num_lbl;
    private javax.swing.JTextArea ques_text_area;
    private javax.swing.JTextField right_choice_text;
    // End of variables declaration//GEN-END:variables
}
