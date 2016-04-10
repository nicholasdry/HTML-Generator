/*
 * Nicholas Dry
 * Copyright 2016
 */
package htmlgenerator;

import java.io.*;
import java.util.*;

public class HTMLGeneratorGUI extends javax.swing.JFrame {

    /**
     * Creates new form HTMLGen
     */

    public static HTMLElements html = new HTMLElements();
    public static CSSElements css = new CSSElements();


    public HTMLGeneratorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpWindow = new javax.swing.JFrame();
        htmlTagLabel = new javax.swing.JLabel();
        addCSSWindow = new javax.swing.JFrame();
        cssFileName = new javax.swing.JLabel();
        cssFileField = new javax.swing.JTextField();
        cssAddButton = new javax.swing.JButton();
        addJSWindow = new javax.swing.JFrame();
        jsFileName = new javax.swing.JLabel();
        jsFileField = new javax.swing.JTextField();
        jsAddButton = new javax.swing.JButton();
        aboutWindow = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createCSSWindow = new javax.swing.JFrame();
        bgHexColor = new javax.swing.JLabel();
        hexColor = new javax.swing.JTextField();
        fileNameLabel = new javax.swing.JLabel();
        createCSSFileName = new javax.swing.JTextField();
        cssSaveButton = new javax.swing.JButton();
        alignCenter = new javax.swing.JCheckBox();
        alignLeft = new javax.swing.JCheckBox();
        alignRight = new javax.swing.JCheckBox();
        paragraphScollPane = new javax.swing.JScrollPane();
        paragraphTextField = new javax.swing.JTextArea();
        titleText = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        headerText = new javax.swing.JLabel();
        headerTextField = new javax.swing.JTextField();
        paragraphText = new javax.swing.JLabel();
        footerText = new javax.swing.JLabel();
        footerTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        htmlFormatting = new javax.swing.JCheckBox();
        fileName = new javax.swing.JTextField();
        fileNameTag = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        fileClose = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        addCSS = new javax.swing.JMenuItem();
        addJS = new javax.swing.JMenuItem();
        createCSS = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        htmlTagGuide = new javax.swing.JMenuItem();
        aboutButton = new javax.swing.JMenuItem();

        helpWindow.setTitle("HTML Tags");
        helpWindow.setMinimumSize(new java.awt.Dimension(400, 400));

        htmlTagLabel.setText("Useful HTML Tags:");

        javax.swing.GroupLayout helpWindowLayout = new javax.swing.GroupLayout(helpWindow.getContentPane());
        helpWindow.getContentPane().setLayout(helpWindowLayout);
        helpWindowLayout.setHorizontalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpWindowLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(htmlTagLabel)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        helpWindowLayout.setVerticalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpWindowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(htmlTagLabel)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        addCSSWindow.setMinimumSize(new java.awt.Dimension(400, 150));

        cssFileName.setText("Enter Name of CSS File:");

        cssAddButton.setText("Link");
        cssAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cssAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCSSWindowLayout = new javax.swing.GroupLayout(addCSSWindow.getContentPane());
        addCSSWindow.getContentPane().setLayout(addCSSWindowLayout);
        addCSSWindowLayout.setHorizontalGroup(
            addCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCSSWindowLayout.createSequentialGroup()
                .addGroup(addCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCSSWindowLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cssFileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cssFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCSSWindowLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cssAddButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        addCSSWindowLayout.setVerticalGroup(
            addCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCSSWindowLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cssFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cssFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cssAddButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        addJSWindow.setMinimumSize(new java.awt.Dimension(400, 150));

        jsFileName.setText("Enter Name of JS File:");

        jsAddButton.setText("Link");
        jsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addJSWindowLayout = new javax.swing.GroupLayout(addJSWindow.getContentPane());
        addJSWindow.getContentPane().setLayout(addJSWindowLayout);
        addJSWindowLayout.setHorizontalGroup(
            addJSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJSWindowLayout.createSequentialGroup()
                .addGroup(addJSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addJSWindowLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jsFileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addJSWindowLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jsAddButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        addJSWindowLayout.setVerticalGroup(
            addJSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJSWindowLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addJSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsAddButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        aboutWindow.setMinimumSize(new java.awt.Dimension(500, 250));

        jLabel2.setText("Copyright 2016 Nicholas Dry");

        jLabel3.setText("HTML Generator");

        jLabel4.setText("http://www.nicholasdry.com");

        javax.swing.GroupLayout aboutWindowLayout = new javax.swing.GroupLayout(aboutWindow.getContentPane());
        aboutWindow.getContentPane().setLayout(aboutWindowLayout);
        aboutWindowLayout.setHorizontalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutWindowLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        aboutWindowLayout.setVerticalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutWindowLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        createCSSWindow.setMinimumSize(new java.awt.Dimension(200, 500));
        createCSSWindow.setSize(new java.awt.Dimension(500, 500));

        bgHexColor.setText("Background Hex Color:");

        fileNameLabel.setText("File Name:");

        createCSSFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCSSFileNameActionPerformed(evt);
            }
        });

        cssSaveButton.setText("Save");
        cssSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cssSaveButtonActionPerformed(evt);
            }
        });

        alignCenter.setText("Align Center");
        alignCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignCenterActionPerformed(evt);
            }
        });

        alignLeft.setText("Align Left");

        alignRight.setText("Align Right");

        javax.swing.GroupLayout createCSSWindowLayout = new javax.swing.GroupLayout(createCSSWindow.getContentPane());
        createCSSWindow.getContentPane().setLayout(createCSSWindowLayout);
        createCSSWindowLayout.setHorizontalGroup(
            createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCSSWindowLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCSSWindowLayout.createSequentialGroup()
                        .addComponent(alignCenter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alignLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alignRight))
                    .addGroup(createCSSWindowLayout.createSequentialGroup()
                        .addComponent(fileNameLabel)
                        .addGap(29, 29, 29)
                        .addComponent(createCSSFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cssSaveButton))
                    .addGroup(createCSSWindowLayout.createSequentialGroup()
                        .addComponent(bgHexColor)
                        .addGap(18, 18, 18)
                        .addComponent(hexColor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        createCSSWindowLayout.setVerticalGroup(
            createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCSSWindowLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bgHexColor)
                    .addComponent(hexColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alignCenter)
                    .addComponent(alignLeft)
                    .addComponent(alignRight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addGroup(createCSSWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileNameLabel)
                    .addComponent(createCSSFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cssSaveButton))
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paragraphTextField.setColumns(20);
        paragraphTextField.setRows(5);
        paragraphScollPane.setViewportView(paragraphTextField);

        titleText.setText("Website Title");

        headerText.setText("Website Header");

        paragraphText.setText("Website Text");

        footerText.setText("Website Footer");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        htmlFormatting.setText("HTML Formatting");
        htmlFormatting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlFormattingActionPerformed(evt);
            }
        });

        fileNameTag.setText("File Name");

        file.setText("File");

        fileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.META_MASK));
        fileNew.setText("New");
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        file.add(fileNew);

        fileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.META_MASK));
        fileSave.setText("Save");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        file.add(fileSave);

        fileClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_MASK));
        fileClose.setText("Close");
        fileClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCloseActionPerformed(evt);
            }
        });
        file.add(fileClose);

        menuBar.add(file);

        edit.setText("Edit");

        addCSS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.META_MASK));
        addCSS.setText("Add CSS..");
        addCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCSSActionPerformed(evt);
            }
        });
        edit.add(addCSS);

        addJS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.META_MASK));
        addJS.setText("Add JavaScript..");
        addJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJSActionPerformed(evt);
            }
        });
        edit.add(addJS);

        createCSS.setText("Create CSS File");
        createCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCSSActionPerformed(evt);
            }
        });
        edit.add(createCSS);

        menuBar.add(edit);

        help.setText("Help");

        htmlTagGuide.setText("HTML Tag Guide");
        htmlTagGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlTagGuideActionPerformed(evt);
            }
        });
        help.add(htmlTagGuide);

        aboutButton.setText("About...");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        help.add(aboutButton);

        menuBar.add(help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileNameTag)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(htmlFormatting)
                    .addComponent(saveButton)
                    .addComponent(footerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footerText)
                    .addComponent(paragraphScollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paragraphText)
                    .addComponent(titleText)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerText))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fileName, footerTextField, headerTextField, titleTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(headerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paragraphText)
                .addGap(18, 18, 18)
                .addComponent(paragraphScollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(htmlFormatting)
                .addGap(18, 18, 18)
                .addComponent(fileNameTag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        html.setTitle(titleTextField.getText());
        html.setHeader(headerTextField.getText());
        html.setParagraph(paragraphTextField.getText());
        html.setFooter(footerTextField.getText());

        // Grabs the file name for the output
        String file = fileName.getText();
       
        // 
        if (htmlFormatting.isSelected()) {
            try {
                PrintWriter output = new PrintWriter(file, "UTF-8");
                exportHTMLFormatted(output);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                PrintWriter output = new PrintWriter(file, "UTF-8");
                exportHTML(output);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void htmlFormattingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlFormattingActionPerformed
        
    }//GEN-LAST:event_htmlFormattingActionPerformed

    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        
        titleTextField.setText("");
        headerTextField.setText("");
        paragraphTextField.setText("");
        fileName.setText("");
        footerTextField.setText("");
    }//GEN-LAST:event_fileNewActionPerformed

    private void fileCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fileCloseActionPerformed

    private void htmlTagGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlTagGuideActionPerformed
        helpWindow.setVisible(true);
    }//GEN-LAST:event_htmlTagGuideActionPerformed

    private void addCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCSSActionPerformed
        
        addCSSWindow.setVisible(true);
        
    }//GEN-LAST:event_addCSSActionPerformed

    private void cssAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cssAddButtonActionPerformed
        
        css.setFileName(cssFileField.getText());
        addCSSWindow.setVisible(false);
        
    }//GEN-LAST:event_cssAddButtonActionPerformed

    private void jsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsAddButtonActionPerformed
        
        html.setJavaScript(jsFileField.getText());
        addJSWindow.setVisible(false);
        
    }//GEN-LAST:event_jsAddButtonActionPerformed

    private void addJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJSActionPerformed
        
        addJSWindow.setVisible(true);
        
    }//GEN-LAST:event_addJSActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        
        aboutWindow.setVisible(true);
        
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveActionPerformed
        html.setTitle(titleTextField.getText());
        html.setHeader(headerTextField.getText());
        html.setParagraph(paragraphTextField.getText());
        html.setFooter(footerTextField.getText());

        // Grabs the file name for the output
        String file = fileName.getText();
       
        // 
        if (htmlFormatting.isSelected()) {
            try {
                PrintWriter output = new PrintWriter(file, "UTF-8");
                exportHTMLFormatted(output);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                PrintWriter output = new PrintWriter(file, "UTF-8");
                exportHTML(output);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_fileSaveActionPerformed

    private void createCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCSSActionPerformed
        
        createCSSWindow.setVisible(true);
        
    }//GEN-LAST:event_createCSSActionPerformed

    private void createCSSFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCSSFileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createCSSFileNameActionPerformed

    private void cssSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cssSaveButtonActionPerformed
        
       // First grab the background color;
       css.setBackgroundColor(Integer.parseInt(hexColor.getText()));
       
       //System.out.println(createCSSFileName.getText());
       
       String file = createCSSFileName.getText();
       
       css.setFileName(file);
       
       //System.out.println(css.getFileName());
       
       // Now collect which alginment is chosen
       
       if (alignCenter.isSelected()) {
           css.setAlign("center");
       } else if (alignRight.isSelected()) {
           css.setAlign("right");
       } else if (alignLeft.isSelected()) {
           css.setAlign("left");
       } 
       
        // 
        try {
            PrintWriter output = new PrintWriter(file, "UTF-8");
            exportCSS(output);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        createCSSWindow.setVisible(false);
        
    }//GEN-LAST:event_cssSaveButtonActionPerformed

    private void alignCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alignCenterActionPerformed

    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTMLGeneratorGUI().setVisible(true);
            }
        });

    }

    private static void exportCSS(PrintWriter output) {

		// adds in copyright info
		output.println("/* Created with HTMLGenerator https://github.com/nicholasdry/HTMLGenerator */");
		output.println();

		output.printf("body { background-color: #%d }", css.getBackgroundColor());
                output.println();
                
                if (css.getAlign() != null) {
                    output.printf("* { text-align: %s }", css.getAlign());
                    output.println();
                } else {
                    System.out.println("ERROR");
                }
		
                System.out.println(css.getBackgroundColor());

                output.close();
        
    }
    
    private static void exportHTML(PrintWriter output) {

		output.println("<html>");
		output.println();

		// adds in copyright info
		output.println("<!-- Created with HTMLGenerator https://github.com/nicholasdry/HTMLGenerator -->");
		output.println();

		// adds the title of the webpage
		output.printf("<title>%s</title>", html.getTitle());
		output.println();
                
                // adds the css to the webpage
                output.printf("<link rel=\"stylesheet\" type=\"text/css\" href=\"%s\">", css.getFileName());
		output.println();
                
                // adds the JS to the webpage
                output.printf("<script src='%s'></script>", html.getJavaScript());
		output.println();

                output.println("<body>");
                output.println();
                
		// adds the header of the page
		output.printf("<h1>%s</h1>", html.getHeader());
		output.println();

		// add the paragraph text of the webpage
		output.printf("<p>%s</p>", html.getParagraph());
		output.println();

		// add the footer of the webpage
		output.printf("<footer>%s</footer>", html.getFooter());
		output.println();
		output.println();

                output.println("</body>");
                output.println();
                
		output.write("</html>");

                output.close();

	}
    
    private static void exportHTMLFormatted(PrintWriter output) {
                output.println("<html>");
		output.println();

		// adds in copyright info
		output.println("<!-- Created with HTMLGenerator https://github.com/nicholasdry/HTMLGenerator -->");
		output.println();

		// adds the title of the webpage
		output.printf("<title>%s</title>", html.getTitle());
		output.println();
                
                // adds the css to the webpage
                output.printf("<link rel='stylesheet/css' href='%s'>%s</link>", css.getFileName());
		output.println();
                
                // adds the JS to the webpage
                output.printf("<script src='%s'></script>", html.getJavaScript());
		output.println();

		// adds the header of the page
		output.printf("<h1>%s</h1>", html.getHeader());
		output.println();

		// add the paragraph text of the webpage
		output.printf("%s", html.getParagraph());
		output.println();

		// add the footer of the webpage
		output.printf("<footer>%s</footer>", html.getFooter());
		output.println();
		output.println();

		output.write("</html>");

                output.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JFrame aboutWindow;
    private javax.swing.JMenuItem addCSS;
    private javax.swing.JFrame addCSSWindow;
    private javax.swing.JMenuItem addJS;
    private javax.swing.JFrame addJSWindow;
    private javax.swing.JCheckBox alignCenter;
    private javax.swing.JCheckBox alignLeft;
    private javax.swing.JCheckBox alignRight;
    private javax.swing.JLabel bgHexColor;
    private javax.swing.JMenuItem createCSS;
    private javax.swing.JTextField createCSSFileName;
    private javax.swing.JFrame createCSSWindow;
    private javax.swing.JButton cssAddButton;
    private javax.swing.JTextField cssFileField;
    private javax.swing.JLabel cssFileName;
    private javax.swing.JButton cssSaveButton;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem fileClose;
    private javax.swing.JTextField fileName;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel fileNameTag;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JLabel footerText;
    private javax.swing.JTextField footerTextField;
    private javax.swing.JLabel headerText;
    private javax.swing.JTextField headerTextField;
    private javax.swing.JMenu help;
    private javax.swing.JFrame helpWindow;
    private javax.swing.JTextField hexColor;
    private javax.swing.JCheckBox htmlFormatting;
    private javax.swing.JMenuItem htmlTagGuide;
    private javax.swing.JLabel htmlTagLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jsAddButton;
    private javax.swing.JTextField jsFileField;
    private javax.swing.JLabel jsFileName;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane paragraphScollPane;
    private javax.swing.JLabel paragraphText;
    private javax.swing.JTextArea paragraphTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleText;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
