public class Issue1{
    public static void main(String[] args){
        Empleado object = new Empleado("Juan", 2000000);
        System.out.println("El salario mensual es de: " + object.getSalario());
        System.out.println("El salario anual es de: " + object.calcularSalario());
    }
}

class Empleado{
    public String nombre;
    private int salario;

    Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }

    public int calcularSalario(){
        int salarioAnual = this.salario * 12;
        return salarioAnual;
    }
}