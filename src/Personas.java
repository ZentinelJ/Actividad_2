public class Personas {

        private String nombre;
        private String apellido;
        private String genero;
        private int edad;

        public Personas (String nombre, String apellido, String genero, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
        }

        public  String getNombre () {
            return nombre;
        }

        public  String getGenero() {
            return genero;
        }

        public int getEdad () {
            return edad;
        }
    }
