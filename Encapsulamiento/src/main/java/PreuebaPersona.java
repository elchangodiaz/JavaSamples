
public class PreuebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);

//        System.out.println("Nombre Persona: " + persona.getNombre());
//        persona.setNombre("Carlos");
//        System.out.println("Nombre perosna mod: " + persona.getNombre());
//        
//        System.out.println("Suewldo perosna: " + persona.getSueldo());
//        persona.setSueldo(1000.00);
//        System.out.println("Sueldo persona mod: " +  persona.getSueldo());
//        
//        System.out.println("Persona borrada: " + persona.getEliminado());
//        persona.setEliminado(true);
//        System.out.println("Persona borrada mod: " + persona.getEliminado());
        System.out.println("Persona: " + persona);

        persona.setNombre("Carlos");
        persona.setSueldo(1000.00);
        persona.setEliminado(true);

        System.out.println("Persona: " + persona.toString());

    }
}
