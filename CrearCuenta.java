package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		//Variable                valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 500;
		//primeraCuenta.pais = "Peru"; No compila por que pais no esta definido en la clase Cuenta 
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.agencia);
		
		System.out.println("para ver a que ubicacion de memoria estan referenciando ambas cuentas ");
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Soy el mismo objeto");
		}else {
			System.out.println("Son diferentes");
		}
	}
}
