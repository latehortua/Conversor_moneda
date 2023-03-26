package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import operaciones.Calculo_moneda;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMoneda extends JFrame {

    double valor, resultado;
    int opcion;
	private JPanel contentPane;
	private JTextField txtCampNum1;
	private JTextField txtCampNum2;
    private JButton btnConvierte;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JComboBox<String> cbConversion;
    
	public VentanaMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("CONVERSOR MONEDAS");
		setResizable(false);
		setLocationRelativeTo(null);	}
	
	private void iniciarComponentes() {
		setBounds(100, 100, 439, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblTitulo = new JLabel("Conversor de Monedas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblTitulo.setBounds(90, 11, 209, 30);
		contentPane.add(lblTitulo);
		   
		JLabel lblNewLabel_1 = new JLabel("Valor a convertir");
		lblNewLabel_1.setBounds(156, 110, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		btnConvierte = new JButton("Convertir");
		btnConvierte.setBounds(163, 187, 89, 23);
		contentPane.add(btnConvierte);
		btnConvierte.setText("Convertir");
        btnConvierte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btnConvierteAction(e);}});
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(71, 294, 89, 23);
		contentPane.add(btnLimpiar);
		btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	btnLimpiarAction(e);}});
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(235, 294, 89, 23);
		contentPane.add(btnSalir);		
		btnSalir.setText("Salir");
		btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
            	ventanaprincipal.setVisible(true);
            	VentanaMoneda.this.dispose();;}});		
		
		txtCampNum1 = new JTextField();
		txtCampNum1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		txtCampNum1.setBounds(116, 135, 183, 30);
		contentPane.add(txtCampNum1);
		txtCampNum1.setColumns(10);
		
		txtCampNum2 = new JTextField();
		txtCampNum2.setEditable(false);
		txtCampNum2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		txtCampNum2.setColumns(10);
		txtCampNum2.setBounds(116, 232, 183, 30);
		contentPane.add(txtCampNum2);
		
		cbConversion = new JComboBox<String>();
        String arreglo[] = new String[] {"Peso Colombiano a Dolar", "Peso Colombiano a Euros", "Peso Colombiano a Libras Esterlinas", "Peso Colombiano a Yen Japonés", "Peso Colombiano a Won sul-coreano", "Dólar a Peso Colombiano", "Euros a Peso Colombiano", "Libras Esterlinas a Peso Colombiano", "Yen Japonés a Peso Colombiano", "Won sul-coreano a Peso Colombiano"};
		System.out.println(opcion);
		cbConversion.setModel(new DefaultComboBoxModel(arreglo));
		cbConversion.setMaximumRowCount(10);
		cbConversion.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		cbConversion.setBounds(61, 62, 281, 35);
		contentPane.add(cbConversion);
		

	}
	
	private void btnLimpiarAction(ActionEvent e) {	
	    txtCampNum1.setText("");
	    txtCampNum2.setText("");
	}
	
	private void btnConvierteAction(ActionEvent e) {
		
	valor = Double.parseDouble(txtCampNum1.getText());
	
	opcion = cbConversion.getSelectedIndex();
	
	Calculo_moneda calculo_moneda = new Calculo_moneda();
	
	calculo_moneda.setValor(valor);
	calculo_moneda.setOpcion(opcion);
	resultado = calculo_moneda.convertir();
	txtCampNum2.setText(Double.toString(resultado));    
	
	}

}