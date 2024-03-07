public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        // Constructor por defecto
    }

    public Fecha(String s) {
        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);
        String sAño = s.substring(pos2 + 1);
        año = Integer.parseInt(sAño);
        
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
    }

    public Fecha(int d, int m, int a) {
        dia = d;
        if (m < 1 || m > 12) {
            mes = 1;
        } else {
            mes = m;
        }
        año = a;
    }

    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}