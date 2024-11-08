package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 316, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 219, 300, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(6, 4, 0, 0));
		
		JButton porcentaje = new JButton("%");
		panel.add(porcentaje);
		JButton limpiarTodo = new JButton("CE");
		panel.add(limpiarTodo);
		JButton limpiar = new JButton("C");
		panel.add(limpiar);
		JButton borrar = new JButton("⌫");
		panel.add(borrar);
		JButton fraccion = new JButton("1/x");
		panel.add(fraccion);
		JButton elevarCuadrado = new JButton("x 2");
		panel.add(elevarCuadrado);
		JButton raizCuadrada = new JButton("√x");
		panel.add(raizCuadrada);
		JButton dividir = new JButton("÷");
		panel.add(dividir);
		JButton siete = new JButton("7");
		panel.add(siete);
		JButton ocho = new JButton("8");
		panel.add(ocho);
		JButton nueve = new JButton("9");
		panel.add(nueve);
		JButton multiplicar = new JButton("x");
		panel.add(multiplicar);
		JButton b = new JButton("4");
		panel.add(b);
		JButton cinco = new JButton("5");
		panel.add(cinco);
		JButton seis = new JButton("6");
		panel.add(seis);
		JButton resta = new JButton("-");
		panel.add(resta);
		JButton uno = new JButton("1");
		panel.add(uno);
		JButton g = new JButton("New button");
		panel.add(uno);	
		JButton dos = new JButton("2");
		panel.add(dos);
		JButton tres = new JButton("3");
		panel.add(tres);
		JButton suma = new JButton("+");
		panel.add(suma);
		JButton cambiarSigno = new JButton("+/-");
		panel.add(cambiarSigno);
		JButton cero = new JButton("0");
		panel.add(cero);
		JButton coma = new JButton(",");
		panel.add(coma);
		JButton igual = new JButton("=");
		panel.add(igual);
	}
}
