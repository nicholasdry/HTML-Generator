/*
 * Nicholas Dry
 * Copyright 2016
 */
package htmlgenerator;

import java.io.*;
import java.util.*;

class HTMLElements {

	private String title;
	private String header;
	private String paragraph;
	private String footer;
        
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public HTMLElements() {
		title = null;
		header = null;
		paragraph = null;
		footer = null;
	}

}


/**
 *
 * @author nicholasdry
 */
public class HTMLGeneratorGUI extends javax.swing.JFrame {

    /**
     * Creates new form HTMLGen
     */

    public static HTMLElements html = new HTMLElements();


    public HTMLGeneratorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        paragraphTextField = new javax.swing.JTextArea();
        titleText = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        headerText = new javax.swing.JLabel();
        headerTextField = new javax.swing.JTextField();
        paragraphText = new javax.swing.JLabel();
        footerText = new javax.swing.JLabel();
        footerTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paragraphTextField.setColumns(20);
        paragraphTextField.setRows(5);
        jScrollPane1.setViewportView(paragraphTextField);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(footerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(footerText)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paragraphText)
                    .addComponent(titleText)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerText))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {footerTextField, headerTextField, titleTextField});

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(footerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        html.setTitle(titleTextField.getText());
        html.setHeader(headerTextField.getText());
        html.setParagraph(paragraphTextField.getText());
        html.setFooter(footerTextField.getText());
        
        try {
            PrintWriter output = new PrintWriter("index.html", "UTF-8");
            exportHTML(output);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTMLGeneratorGUI().setVisible(true);
            }
        });
        
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

		output.write("</html>");

                output.close();

	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel footerText;
    private javax.swing.JTextField footerTextField;
    private javax.swing.JLabel headerText;
    private javax.swing.JTextField headerTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paragraphText;
    private javax.swing.JTextArea paragraphTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleText;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
