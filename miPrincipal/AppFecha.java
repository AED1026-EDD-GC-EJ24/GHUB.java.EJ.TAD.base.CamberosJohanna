
public class AppFecha {

    public static void menu() {
        System.out.println("====================================");
        System.out.println("    Operaciones con Fechas        ");
        System.out.println("====================================");
        
        Fecha f = new Fecha(2,20,1970);
		Fecha f1 = new Fecha(2,20,1970);
		
		System.out.println("Dia = "+f.getDia());
		System.out.println("Mes = "+f.getMes());
		System.out.println("Año = "+f.getAnio());
		System.out.println(f);
		
		if (f.equals(f1))
			System.out.println("Son iguales");
		else
			System.out.println("Son Diferentes");
    }
}