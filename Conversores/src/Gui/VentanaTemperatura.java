package Gui;

import operaciones.Calculo_temperatura;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class VentanaTemperatura extends JFrame {

	private JSlider sldValor;
	private JLabel lblValor;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox cboDE;
	private JLabel lblResultado;
	private JComboBox cboA;
	String de = "C°", a = "C°";
    private JButton btnSalir;
    double valor, resultado;

	public VentanaTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		setTitle("CONVERSOR DE TEMPERATURA");
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	private void iniciarComponentes() {
		setBounds(100, 100, 487, 369);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(40, 29, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblValor = new JLabel("1");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValor.setBounds(366, 41, 95, 42);
		getContentPane().add(lblValor);	
		
		lblResultado = new JLabel("1");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(66, 204, 319, 42);
		getContentPane().add(lblResultado);
		
		sldValor = new JSlider();
		sldValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valor = sldValor.getValue();
				lblValor.setText(" "+valor);
				convertirTemperatura();
			}
		});
		sldValor.setPaintTicks(true);
		sldValor.setPaintLabels(true);
		sldValor.setValue(1);
		sldValor.setMinimum(1);
		sldValor.setBounds(49, 69, 306, 26);
		getContentPane().add(sldValor);
		
		lblNewLabel_1 = new JLabel("DE:");
		lblNewLabel_1.setBounds(27, 154, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("A:");
		lblNewLabel_2.setBounds(278, 154, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		cboDE = new JComboBox();
		cboDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				de = cboDE.getSelectedItem().toString();
				convertirTemperatura();
			}			
		});
		cboDE.setModel(new DefaultComboBoxModel(new String[] {"C°", "F°", "K°"}));
		cboDE.setBounds(66, 150, 105, 22);
		getContentPane().add(cboDE);
		
		cboA = new JComboBox();
		cboA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = cboA.getSelectedItem().toString();
				convertirTemperatura();				
			}
		});
		cboA.setModel(new DefaultComboBoxModel(new String[] {"C°", "F°", "K°"}));
		cboA.setBounds(308, 150, 105, 22);
		getContentPane().add(cboA);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		btnSalir.setBounds(324, 296, 89, 23);
		btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            	
            	VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
            	ventanaprincipal.setVisible(true);
            	VentanaTemperatura.this.dispose();;}});	
		getContentPane().add(btnSalir);
	}

	public void convertirTemperatura() {
			
	Calculo_temperatura calculo_temperatura = new Calculo_temperatura();
	
	calculo_temperatura.setValor(valor);;
	calculo_temperatura.setDe(de);
	calculo_temperatura.setA(a);
	resultado = calculo_temperatura.convertirTemperatura();
	DecimalFormat resuelto = new DecimalFormat("#.00");
	lblResultado.setText(valor + " "+de+" -> "+resuelto.format(resultado) + " "+a);
	}

}
