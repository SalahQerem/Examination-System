package swe_project;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Student_pnl extends javax.swing.JFrame {

    ArrayList<String[]> ques = new ArrayList<>();
    int ques_in = 0, id;

    public Student_pnl(Object l) {
        initComponents();
        setLocationRelativeTo(null);
        courses_type_scrl.removeAllItems();
        courses_type_scrl.addItem("Select type of Course");
        courses_type_scrl.addItem("Uni. Requirement (Optional)");
        courses_type_scrl.addItem("Uni. Requirement (Mandatory)");
        courses_type_scrl.addItem("Faculty Requirement (Mandatory)");
        courses_type_scrl.addItem("Maj. Requirement (Optional)");
        courses_type_scrl.addItem("Maj. Requirement (Mandatory)");

        courses_scrl.removeAllItems();
        courses_scrl.addItem("Select Course");

        answers_btngroup.add(f_Rbtn);
        answers_btngroup.add(s_Rbtn);
        answers_btngroup.add(th_Rbtn);
        answers_btngroup.add(fo_Rbtn);

        id = (Integer) l;

        submit_btn.setVisible(false);
        favorite_subjects();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answers_btngroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        courses_scrl = new javax.swing.JComboBox<>();
        show_subjects_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        materials_tbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        exams_tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courses_type_scrl = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        exam_id_text = new javax.swing.JTextField();
        start_exam_btn = new javax.swing.JButton();
        scrl_massage_lbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ques_text_area = new javax.swing.JTextArea();
        f_Rbtn = new javax.swing.JRadioButton();
        s_Rbtn = new javax.swing.JRadioButton();
        fo_Rbtn = new javax.swing.JRadioButton();
        th_Rbtn = new javax.swing.JRadioButton();
        pre_ques_btn = new javax.swing.JButton();
        next_ques_btn = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        ques_num_lbl = new javax.swing.JLabel();
        start_exam_massege_lbl = new javax.swing.JLabel();
        ques_move_massege_lbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        grade_lbl = new javax.swing.JLabel();
        grade_msg_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        show_videos_btn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        video_tbl = new javax.swing.JTable();
        video_massege_lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add_favorite_material_btn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        show_video_material_url_area = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        add_video_favorite_num_text = new javax.swing.JTextField();
        add_video_favorite_btn = new javax.swing.JButton();
        add_video_favorite_massege_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        favorite_material_tbl = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        favorite_videol_tbl = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        delete_favorite_subject_url_area = new javax.swing.JTextArea();
        delete_favorite_subjrct_btn = new javax.swing.JButton();
        delete_favorite_subject_massege_lbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        courses_scrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_scrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        show_subjects_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_subjects_btn.setText("Show");
        show_subjects_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_subjects_btnActionPerformed(evt);
            }
        });

        materials_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Owner", "URL"
            }
        ));
        jScrollPane1.setViewportView(materials_tbl);
        if (materials_tbl.getColumnModel().getColumnCount() > 0) {
            materials_tbl.getColumnModel().getColumn(0).setMaxWidth(100);
            materials_tbl.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        exams_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Type", "Owner", "Exam  period"
            }
        ));
        jScrollPane2.setViewportView(exams_tbl);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Materials");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Exams");

        courses_type_scrl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courses_type_scrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        courses_type_scrl.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courses_type_scrlItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Exam ID");

        exam_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        start_exam_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        start_exam_btn.setText("Start Exam");
        start_exam_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_exam_btnActionPerformed(evt);
            }
        });

        scrl_massage_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ques_text_area.setColumns(20);
        ques_text_area.setRows(5);
        jScrollPane3.setViewportView(ques_text_area);

        f_Rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        s_Rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fo_Rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        th_Rbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pre_ques_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pre_ques_btn.setText("Previous");
        pre_ques_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_ques_btnActionPerformed(evt);
            }
        });

        next_ques_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        next_ques_btn.setText("Next");
        next_ques_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_ques_btnActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit_btn.setText("Submit Exam");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        start_exam_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ques_move_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Your Grade");

        grade_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        grade_msg_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Material URL");

        show_videos_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_videos_btn.setText("Show material videos");
        show_videos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_videos_btnActionPerformed(evt);
            }
        });

        video_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(video_tbl);
        if (video_tbl.getColumnModel().getColumnCount() > 0) {
            video_tbl.getColumnModel().getColumn(0).setMinWidth(50);
            video_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            video_tbl.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        video_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Videos");

        add_favorite_material_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_favorite_material_btn.setText("Add Material to favorite");
        add_favorite_material_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_favorite_material_btnActionPerformed(evt);
            }
        });

        show_video_material_url_area.setColumns(20);
        show_video_material_url_area.setRows(5);
        jScrollPane5.setViewportView(show_video_material_url_area);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Num of Video");

        add_video_favorite_num_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_video_favorite_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_video_favorite_btn.setText("Add Video to favorite");
        add_video_favorite_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_video_favorite_btnActionPerformed(evt);
            }
        });

        add_video_favorite_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(courses_type_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(courses_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(submit_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ques_move_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(437, 437, 437))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(show_subjects_btn)
                                .addGap(144, 144, 144)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(show_videos_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_video_favorite_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ques_num_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(grade_msg_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(pre_ques_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(next_ques_btn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(th_Rbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(f_Rbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(s_Rbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(fo_Rbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(grade_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(scrl_massage_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(51, 51, 51)
                                    .addComponent(exam_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(start_exam_btn))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(start_exam_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(add_favorite_material_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(video_massege_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(add_video_favorite_num_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_video_favorite_btn)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courses_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courses_type_scrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(scrl_massage_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(show_subjects_btn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exam_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(start_exam_btn)
                        .addComponent(show_videos_btn)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(start_exam_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(ques_num_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f_Rbtn)
                            .addComponent(s_Rbtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fo_Rbtn)
                            .addComponent(th_Rbtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pre_ques_btn)
                            .addComponent(next_ques_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ques_move_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grade_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grade_msg_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_favorite_material_btn)
                            .addComponent(video_massege_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(add_video_favorite_num_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_video_favorite_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_video_favorite_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Courses", jPanel4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Materials");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Videos");

        favorite_material_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Owner", "URL"
            }
        ));
        jScrollPane6.setViewportView(favorite_material_tbl);
        if (favorite_material_tbl.getColumnModel().getColumnCount() > 0) {
            favorite_material_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            favorite_material_tbl.getColumnModel().getColumn(0).setPreferredWidth(1);
            favorite_material_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            favorite_material_tbl.getColumnModel().getColumn(1).setMinWidth(80);
            favorite_material_tbl.getColumnModel().getColumn(1).setPreferredWidth(1);
            favorite_material_tbl.getColumnModel().getColumn(1).setMaxWidth(80);
        }

        favorite_videol_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "URL"
            }
        ));
        jScrollPane7.setViewportView(favorite_videol_tbl);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Delete Favorite Subject");

        delete_favorite_subject_url_area.setColumns(20);
        delete_favorite_subject_url_area.setRows(5);
        jScrollPane8.setViewportView(delete_favorite_subject_url_area);

        delete_favorite_subjrct_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete_favorite_subjrct_btn.setText("Delete");
        delete_favorite_subjrct_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_favorite_subjrct_btnActionPerformed(evt);
            }
        });

        delete_favorite_subject_massege_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Subject URL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(delete_favorite_subjrct_btn)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addComponent(delete_favorite_subject_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_favorite_subjrct_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_favorite_subject_massege_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("favorites", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_subjects_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_subjects_btnActionPerformed
        String name = "", id = "";
        if (courses_scrl.getSelectedItem().equals("Select Course")) {
            scrl_massage_lbl.setText("Select course first");
            return;
        } else {
            name = courses_scrl.getSelectedItem().toString();
        }

        DefaultTableModel t = (DefaultTableModel) materials_tbl.getModel();
        t.setRowCount(0);
        DefaultTableModel tt = (DefaultTableModel) exams_tbl.getModel();
        tt.setRowCount(0);

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id FROM course WHERE name = ?;");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getString("id");
            }
            PreparedStatement pss = conn.prepareStatement("SELECT exam.id, e_type, required_time, f_name, l_name FROM exam, s_user WHERE s_user.id = contributor_id and course_id = ?;");
            pss.setInt(1, Integer.parseInt(id));
            ResultSet rss = pss.executeQuery();
            while (rss.next()) {
                String s[] = {rss.getString("exam.id"), rss.getString("e_type"), rss.getString("f_name") + rss.getString("l_name"), rss.getString("required_time")};
                DefaultTableModel tm = (DefaultTableModel) exams_tbl.getModel();
                tm.addRow(s);
            }
            PreparedStatement psss = conn.prepareStatement("SELECT url, material.name, f_name, l_name FROM material, s_user WHERE s_user.id = contributor_id and course_id = ?;");
            psss.setInt(1, Integer.parseInt(id));
            ResultSet rsss = psss.executeQuery();
            while (rsss.next()) {
                String s[] = {rsss.getString("material.name"), rsss.getString("f_name") + rsss.getString("l_name"), rsss.getString("url")};
                DefaultTableModel tm = (DefaultTableModel) materials_tbl.getModel();
                tm.addRow(s);
            }
            conn.close();
            ps.close();
            pss.close();
            psss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_show_subjects_btnActionPerformed

    private void start_exam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_exam_btnActionPerformed
        if (exam_id_text.getText().equals("")) {
            start_exam_massege_lbl.setText("Exam ID is required");
            return;
        }
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT question.id, q_text, fi_choice, s_choice, th_choice, fo_choice, right_choice FROM question WHERE exam_id = ?;");
            ps.setInt(1, Integer.parseInt(exam_id_text.getText()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {rs.getString("question.id"), rs.getString("q_text"), rs.getString("fi_choice"), rs.getString("s_choice"), rs.getString("th_choice"), rs.getString("fo_choice"), rs.getString("right_choice"), ""};
                ques.add(s);
            }

            ques_num_lbl.setText("Question 0 of " + (ques.size() + 1));
            ques_text_area.setText(ques.get(0)[1]);
            f_Rbtn.setText(ques.get(0)[2]);
            s_Rbtn.setText(ques.get(0)[3]);
            th_Rbtn.setText(ques.get(0)[4]);
            fo_Rbtn.setText(ques.get(0)[5]);

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_start_exam_btnActionPerformed

    private void next_ques_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_ques_btnActionPerformed

        if (f_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "1";
        } else if (s_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "2";
        } else if (th_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "3";
        } else if (fo_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "4";
        } else {
            ques.get(ques_in)[7] = "";
        }

        ques_in++;
        if (ques_in == ques.size() - 1) {
            submit_btn.setVisible(true);
        }
        if (ques.size() == ques_in) {
            ques_move_massege_lbl.setText("Last question of exam");
            ques_in--;
            return;
        }

        ques_num_lbl.setText("Question " + (ques_in + 1) + " of " + (ques.size()));
        ques_text_area.setText(ques.get(ques_in)[1]);
        f_Rbtn.setText(ques.get(ques_in)[2]);
        s_Rbtn.setText(ques.get(ques_in)[3]);
        th_Rbtn.setText(ques.get(ques_in)[4]);
        fo_Rbtn.setText(ques.get(ques_in)[5]);

        switch (ques.get(ques_in)[7]) {
            case "1":
                f_Rbtn.setSelected(true);
                break;
            case "2":
                s_Rbtn.setSelected(true);
                break;
            case "3":
                th_Rbtn.setSelected(true);
                break;
            case "4":
                fo_Rbtn.setSelected(true);
                break;
            default:
                break;
        }

        answers_btngroup.clearSelection();

    }//GEN-LAST:event_next_ques_btnActionPerformed

    private void pre_ques_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_ques_btnActionPerformed

        if (f_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "1";
        } else if (s_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "2";
        } else if (th_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "3";
        } else if (fo_Rbtn.isSelected()) {
            ques.get(ques_in)[7] = "4";
        } else {
            ques.get(ques_in)[7] = "";
        }

        ques_in--;
        if ((ques_in != ques.size() - 1)) {
            submit_btn.setVisible(false);
        }
        if (ques_in == -1) {
            ques_move_massege_lbl.setText("First question of exam");
            ques_in++;
            return;
        }

        ques_num_lbl.setText("Question " + (ques_in + 1) + " of " + (ques.size()));
        ques_text_area.setText(ques.get(ques_in)[1]);
        f_Rbtn.setText(ques.get(ques_in)[2]);
        s_Rbtn.setText(ques.get(ques_in)[3]);
        th_Rbtn.setText(ques.get(ques_in)[4]);
        fo_Rbtn.setText(ques.get(ques_in)[5]);

        switch (ques.get(ques_in)[7]) {
            case "1":
                f_Rbtn.setSelected(true);
                break;
            case "2":
                s_Rbtn.setSelected(true);
                break;
            case "3":
                th_Rbtn.setSelected(true);
                break;
            case "4":
                fo_Rbtn.setSelected(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_pre_ques_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        int g = 0;
        for (int i = 0; i < ques.size(); i++) {
            if (ques.get(i)[6].equalsIgnoreCase(ques.get(i)[7])) {
                g++;
            }
        }
        grade_lbl.setText(g + " / " + ques.size());
        if (g == ques.size()) {
            grade_msg_lbl.setText("Great Result");
        } else if (g > ques.size() / 2) {
            grade_msg_lbl.setText("Good Result");
        } else {
            grade_msg_lbl.setText("Bad Result");
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void show_videos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_videos_btnActionPerformed
        if (show_video_material_url_area.getText().equals("")) {
            video_massege_lbl.setText("Material URL is required");
            return;
        }

        DefaultTableModel t = (DefaultTableModel) video_tbl.getModel();
        t.setRowCount(0);

        int in = 1;
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT video.url FROM video WHERE material_id = ?;");
            ps.setString(1, show_video_material_url_area.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {(in++) + "", rs.getString("video.url")};
                DefaultTableModel tm = (DefaultTableModel) video_tbl.getModel();
                tm.addRow(s);
            }

            conn.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_show_videos_btnActionPerformed

    private void add_favorite_material_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_favorite_material_btnActionPerformed
        if (show_video_material_url_area.getText().equals("")) {
            video_massege_lbl.setText("Material URL is required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT count(material_url) FROM favorite_materials WHERE id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (Integer.parseInt(rs.getString("count(material_url)")) > 9) {
                    video_massege_lbl.setText("Your Material List is Full");
                    return;
                }
            }

            PreparedStatement pss = conn.prepareStatement("SELECT id, material_url FROM favorite_materials WHERE id = ? and material_url = ?;");
            pss.setInt(1, id);
            pss.setString(2, show_video_material_url_area.getText());
            ResultSet rss = pss.executeQuery();
            if (rss.next()) {
                video_massege_lbl.setText("Has been Added");
                return;
            }

            PreparedStatement psss = conn.prepareStatement("Insert INTO favorite_materials(id, material_url) VALUES (?, ?);");
            psss.setInt(1, id);
            psss.setString(2, show_video_material_url_area.getText());
            psss.executeUpdate();

            video_massege_lbl.setText("Added");
            favorite_subjects();

            conn.close();
            ps.close();
            pss.close();
            psss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_add_favorite_material_btnActionPerformed

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
            default:
                scrl_massage_lbl.setText("Select type of course first");
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

    private void add_video_favorite_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_video_favorite_btnActionPerformed
        if (add_video_favorite_num_text.getText().equals("")) {
            add_video_favorite_massege_lbl.setText("Video URL is required");
            return;
        }

        if (video_tbl.getValueAt(Integer.parseInt(add_video_favorite_num_text.getText()) - 1, 1) == null) {
            add_video_favorite_massege_lbl.setText("Number does not exist");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT count(video_url) FROM favorite_videos WHERE id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (Integer.parseInt(rs.getString("count(video_url)")) > 9) {
                    add_video_favorite_massege_lbl.setText("Your Video List is Full");
                    return;
                }
            }

            PreparedStatement pss = conn.prepareStatement("SELECT id, video_url FROM favorite_videos WHERE id = ? and video_url = ?;");
            pss.setInt(1, id);
            pss.setString(2, video_tbl.getValueAt(Integer.parseInt(add_video_favorite_num_text.getText()) - 1, 1).toString());
            ResultSet rss = pss.executeQuery();
            if (rss.next()) {
                add_video_favorite_massege_lbl.setText("Has been Added");
                return;
            }

            PreparedStatement psss = conn.prepareStatement("Insert INTO favorite_videos(id, video_url) VALUES (?, ?);");
            psss.setInt(1, id);
            psss.setString(2, video_tbl.getValueAt(Integer.parseInt(add_video_favorite_num_text.getText()) - 1, 1).toString());
            psss.executeUpdate();

            add_video_favorite_massege_lbl.setText("Added");
            favorite_subjects();

            conn.close();
            ps.close();
            pss.close();
            psss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_add_video_favorite_btnActionPerformed

    private void delete_favorite_subjrct_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_favorite_subjrct_btnActionPerformed
        if (delete_favorite_subject_url_area.getText().equals("")) {
            delete_favorite_subject_massege_lbl.setText("Subject URL is required");
            return;
        }

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id, video_url FROM favorite_videos WHERE id = ? and video_url = ?;");
            ps.setInt(1, id);
            ps.setString(2, delete_favorite_subject_url_area.getText());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PreparedStatement psss = conn.prepareStatement("DELETE FROM favorite_videos WHERE id = ? and video_url = ?;");
                psss.setInt(1, id);
                psss.setString(2, delete_favorite_subject_url_area.getText());
                psss.executeUpdate();
                delete_favorite_subject_massege_lbl.setText("Removed");
                psss.close();
            }

            PreparedStatement pss = conn.prepareStatement("SELECT id, material_url FROM favorite_materials WHERE id = ? and material_url = ?;");
            pss.setInt(1, id);
            pss.setString(1, delete_favorite_subject_url_area.getText());
            ResultSet rss = pss.executeQuery();
            while (rss.next()) {
                PreparedStatement psss = conn.prepareStatement("DELETE FROM favorite_materials WHERE id = ? and material_url = ?;");
                psss.setInt(1, id);
                psss.setString(2, delete_favorite_subject_url_area.getText());
                psss.executeUpdate();
                delete_favorite_subject_massege_lbl.setText("Removed");
                psss.close();
            }

            favorite_subjects();

            conn.close();
            ps.close();
            pss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }//GEN-LAST:event_delete_favorite_subjrct_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_favorite_material_btn;
    private javax.swing.JButton add_video_favorite_btn;
    private javax.swing.JLabel add_video_favorite_massege_lbl;
    private javax.swing.JTextField add_video_favorite_num_text;
    private javax.swing.ButtonGroup answers_btngroup;
    private javax.swing.JComboBox<String> courses_scrl;
    private javax.swing.JComboBox<String> courses_type_scrl;
    private javax.swing.JLabel delete_favorite_subject_massege_lbl;
    private javax.swing.JTextArea delete_favorite_subject_url_area;
    private javax.swing.JButton delete_favorite_subjrct_btn;
    private javax.swing.JTextField exam_id_text;
    private javax.swing.JTable exams_tbl;
    private javax.swing.JRadioButton f_Rbtn;
    private javax.swing.JTable favorite_material_tbl;
    private javax.swing.JTable favorite_videol_tbl;
    private javax.swing.JRadioButton fo_Rbtn;
    private javax.swing.JLabel grade_lbl;
    private javax.swing.JLabel grade_msg_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable materials_tbl;
    private javax.swing.JButton next_ques_btn;
    private javax.swing.JButton pre_ques_btn;
    private javax.swing.JLabel ques_move_massege_lbl;
    private javax.swing.JLabel ques_num_lbl;
    private javax.swing.JTextArea ques_text_area;
    private javax.swing.JRadioButton s_Rbtn;
    private javax.swing.JLabel scrl_massage_lbl;
    private javax.swing.JButton show_subjects_btn;
    private javax.swing.JTextArea show_video_material_url_area;
    private javax.swing.JButton show_videos_btn;
    private javax.swing.JButton start_exam_btn;
    private javax.swing.JLabel start_exam_massege_lbl;
    private javax.swing.JButton submit_btn;
    private javax.swing.JRadioButton th_Rbtn;
    private javax.swing.JLabel video_massege_lbl;
    private javax.swing.JTable video_tbl;
    // End of variables declaration//GEN-END:variables

    private void favorite_subjects() {
        String name = "";
        DefaultTableModel t = (DefaultTableModel) favorite_material_tbl.getModel();
        t.setRowCount(0);
        DefaultTableModel tt = (DefaultTableModel) favorite_videol_tbl.getModel();
        tt.setRowCount(0);

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT url, material.name, f_name, l_name FROM s_user, favorite_materials, material WHERE favorite_materials.id = ? and s_user.id = contributor_id and material.url = material_url;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String s[] = {rs.getString("material.name"), rs.getString("f_name") + rs.getString("l_name"), rs.getString("url")};
                DefaultTableModel tm = (DefaultTableModel) favorite_material_tbl.getModel();
                tm.addRow(s);
            }

            PreparedStatement pss = conn.prepareStatement("SELECT url FROM video,favorite_videos WHERE favorite_videos.id = ? and video.url = video_url;");
            pss.setInt(1, id);
            ResultSet rss = pss.executeQuery();
            while (rss.next()) {
                String s[] = {rss.getString("url")};
                DefaultTableModel tm = (DefaultTableModel) favorite_videol_tbl.getModel();
                tm.addRow(s);
            }

            conn.close();
            ps.close();
            pss.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
