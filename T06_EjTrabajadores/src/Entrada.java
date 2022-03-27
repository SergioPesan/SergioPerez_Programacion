public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("CES JPII", 10000);
        empresa.addPersona(new Asalariado("123A", "Borja", "Martin", 1000, Departamento.Comercial,12));
        empresa.addPersona(new Asalariado("123A", "Jesus", "Martin", 1000, Departamento.Comercial,12));
        empresa.addPersona(new Jefe("Isaac","Sampedro","159C",2000,Departamento.IT,9,15,15));



    }
}
