public class Main {
    public static void main(String[] args) {
        Cliente madre = new Cliente();
        madre.setEdadPersona(50);
        madre.setNombre("Estela");
        madre.setTelefono(553421);
        madre.setCredito(950);

        Trabajador padre =new Trabajador();
        padre.setEdadPersona(55);
        padre.setNombre("Raul");
        padre.setTelefono(884536);
        padre.setSalario(1000);

        System.out.println("Nombre:"+ madre.getNombre()+" edad:"+madre.getEdadPersona()+" telefono:"+madre.getTelefono()+" credito:"+madre.getCredito());
        System.out.println("Nombre:"+padre.getNombre()+" edad:"+padre.getEdadPersona()+" telefono:"+ padre.getTelefono()+" salario:"+padre.getSalario());
    }
}
class Persona{
     int edadPersona;
     String nombre;
     int telefono;


    public void setEdadPersona(int edadPersona){
        this.edadPersona = edadPersona;
    }

    public int getEdadPersona(){
        return this.edadPersona = edadPersona;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono = telefono;
    }

}

class Cliente extends Persona{
    int credito;
    public void setCredito(int credito){
       this.credito = credito;
    }
    public int getCredito(){
     return this.credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
      return this.salario = salario;
    }
}