public class AppCadena {
    public static void menu() throws PosicionIlegalException {
        System.out.println("==================================");
        System.out.println("    Operaciones con Cadena        ");
        System.out.println("==================================");
        
        Cadena c = new Cadena();
        
        c.agregarFinal('L');
        c.agregarFinal('u');
        c.agregarFinal('c');
        c.agregarFinal('i');
        c.agregarFinal('a');
        
        System.out.println("valor de c: " + c);
        
        System.out.println("Invertida: " + c.invertir());
        
      
        
        
    }
}