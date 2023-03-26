package Gui;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private JButton btnDivisas;
    private JButton btnTemperaturas;
    private JButton btnSalir;

	public VentanaPrincipal() {
		InicializarVentanas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CONVERSORES");
		setLocationRelativeTo(null);	
	}

	private void InicializarVentanas() {
		setBounds(100, 100, 435, 286);
		getContentPane().setLayout(null);		
		JLabel lblTitulo = new JLabel("TIPOS DE CONVERSORES");
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(34, 11, 326, 37);
		getContentPane().add(lblTitulo);
		
		btnDivisas = new JButton("CAMBIO DE DIVISAS");
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMoneda ventanamoneda = new VentanaMoneda();	
				ventanamoneda.setVisible(true);
				VentanaPrincipal.this.dispose();
			}
		});
		btnDivisas.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		btnDivisas.setBounds(71, 67, 250, 23);
		getContentPane().add(btnDivisas);
		
		btnTemperaturas = new JButton("TEMPERATURAS");
		btnTemperaturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTemperatura ventatemperatura = new VentanaTemperatura();		
				ventatemperatura.setVisible(true);
				VentanaPrincipal.this.dispose();
			}
		});
		btnTemperaturas.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		btnTemperaturas.setBounds(71, 119, 250, 23);
		getContentPane().add(btnTemperaturas);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VentanaPrincipal.this.dispose();}});
		btnSalir.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		btnSalir.setBounds(267, 180, 119, 23);
		getContentPane().add(btnSalir);
		getContentPane().add(btnSalir);
		

	}	


}
