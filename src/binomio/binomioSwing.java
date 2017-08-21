/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.sin;
import java.math.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class binomioSwing extends JFrame implements ActionListener {
        
    JPanel panelNumeros;
    JTextField pantallaNom;
    JTextField pantallaAPat;
    JTextField pantallaAMat;
    JTextField pantallaEsc;
    
    JButton btng;
    
    public binomioSwing(){
        setSize(500, 600);
		setTitle("");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		// Vamos a dibujar sobre el panel
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(null);
                
                // Ponemos los campos de texto
		pantallaNom = new JTextField("Nombre", 20);
		pantallaNom.setBorder(new EmptyBorder(4, 4, 4, 4));
                pantallaNom.setBounds(100, 115, 290, 65);
		pantallaNom.setFont(new Font("Arial", Font.BOLD, 25));
		pantallaNom.setHorizontalAlignment(JTextField.RIGHT);
		pantallaNom.setBackground(Color.WHITE);
		panel.add(pantallaNom);
                
                pantallaAPat = new JTextField("Paterno", 20);
		pantallaAPat.setBorder(new EmptyBorder(4, 4, 4, 4));     
                pantallaAPat.setBounds(100, 215, 290, 65);
		pantallaAPat.setFont(new Font("Arial", Font.BOLD, 25));
		pantallaAPat.setHorizontalAlignment(JTextField.RIGHT);
		pantallaAPat.setBackground(Color.WHITE);
		panel.add(pantallaAPat);
                
                
                pantallaAMat = new JTextField("Materno", 20);
		pantallaAMat.setFont(new Font("Arial", Font.BOLD, 25));
                pantallaAMat.setBorder(new EmptyBorder(4, 4, 4, 4)); 
                pantallaAMat.setBounds(100, 315, 290, 65);
		pantallaAMat.setHorizontalAlignment(JTextField.RIGHT);
		pantallaAMat.setBackground(Color.WHITE);
		panel.add(pantallaAMat);
                
                pantallaEsc = new JTextField("Escuela", 20);
		pantallaEsc.setFont(new Font("Arial", Font.BOLD, 25));
                pantallaEsc.setBorder(new EmptyBorder(4, 4, 4, 4)); 
                pantallaEsc.setBounds(100, 415, 290, 65);
		pantallaEsc.setHorizontalAlignment(JTextField.RIGHT);
		pantallaEsc.setBackground(Color.WHITE);
		panel.add(pantallaEsc);
                
                btng = new JButton("guardar");
                btng.setBounds(210, 515, 90, 55);
		btng.setForeground(Color.RED);
                btng.addActionListener(this);
                panel.add(btng);
                
		validate();
    }
    
        // Usamos el metodo principal para obtener los valores de los campos y guardarlos en la base
    private void operacionPulsado(String tecla) {
        
        String nombre=pantallaNom.getText();
        String aPat=pantallaAPat.getText();
        String aMat=pantallaAMat.getText();
        String escuela=pantallaEsc.getText();
        
		 if (tecla.equals("guardar")) {
			Personas nuevo = new Personas();
                        nuevo.agregarResp(nombre, aPat, aMat, escuela);
                        pantallaNom.setText("nombre");
                        pantallaAPat.setText("Paterno");
                        pantallaAMat.setText("Materno");
                        pantallaEsc.setText("Escuela");
		}

	}
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== btng){
        operacionPulsado("guardar");
    } 
}
}
