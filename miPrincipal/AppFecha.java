public class AppFecha {

    public static void menu() {
        System.out.println("====================================");
        System.out.println("    Operaciones con Fechas        ");
        System.out.println("====================================");
        
        Fecha f = new Fecha(2,12,2010);
		Fecha f1 = new Fecha(2,12,2010);
		
		System.out.println("Dia = "+f.getDia());
		System.out.println("Mes = "+f.getMes());
		System.out.println("Año = "+f.getAño());
		System.out.println(f);
		
		if (f.equals(f1))
			System.out.println("Son iguales");
		else
			System.out.println("Son Diferentes");
    }
}