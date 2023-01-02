public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Robert");
    persona.setEdad(33);
    persona.setTelefono("12345678");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}

class Persona{

    private String Nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
       this.Nombre = Nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}