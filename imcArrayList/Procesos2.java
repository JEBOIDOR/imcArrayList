package imcArrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos2 {

	ArrayList<String> nombre;
	ArrayList<Double> altura;
	ArrayList<Integer> peso;
	ArrayList<Double> imc;
	ArrayList<String> telefono;
	
	public Procesos2() {
		
		nombre = new ArrayList<>();
		altura = new ArrayList<>();
		peso = new ArrayList<>();
		imc = new ArrayList<>();
		telefono = new ArrayList<>();
	}
	
	public void iniciar() {
		
		String val;
		
		do {
			
		pedirDatos();
		clasificacionImc();
		
		val = JOptionPane.showInputDialog("¿desea ingresar mas usuarios?");
		
		}while(val.equalsIgnoreCase("SI"));
	

	}
	
	public void pedirDatos() {
		
		JOptionPane.showMessageDialog(null, "Ingrese los datos de el usuario");
		
		String nombreUsuario = JOptionPane.showInputDialog("nombre de usuario");
		nombre.add(nombreUsuario);
		
		double alturaUsuario = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura de: " + nombreUsuario));
		altura.add(alturaUsuario);
		
		int pesoUsuario = Integer.parseInt(JOptionPane.showInputDialog("peso de: " + nombreUsuario));
		peso.add(pesoUsuario);
		
		double imcUsuario = pesoUsuario/(alturaUsuario*alturaUsuario);
		
		System.out.println(imcUsuario);
		imc.add(imcUsuario);
		
	}
		
	public void clasificacionImc() {
		
		for(int i = 0; i < nombre.size(); i++) {
			
			if(imc.get(i) < 18) {
				
				System.out.println(nombre.get(i) + " ESTADO:  anorexia");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 18 && imc.get(i) < 20) {
				
				System.out.println(nombre.get(i)  + " ESTADO: Delgadez");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 20 && imc.get(i) < 27) {
				
				System.out.println(nombre.get(i)  + " ESTADO: Normalidad");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 27 && imc.get(i) < 30) {
				
				System.out.println(nombre.get(i) + " ESTADO: Obesidad I");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 30 && imc.get(i) < 35) {
				
				System.out.println(nombre.get(i) + " ESTADO: Obesisdad II");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 35 && imc.get(i) < 40) {
				
				System.out.println(nombre.get(i)  + " ESTADO: Obesidad III" );
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}else if(imc.get(i) >= 40) {
				
				System.out.println(nombre.get(i) + " ESTADO: Obesidad Morbida");
				System.out.println("TELEFONO:" + telefono.get(i));
				
			}
			
		}
		
	
	}
	
	

}
