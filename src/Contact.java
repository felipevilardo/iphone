public class Contact {
    // Atributos privados a respeito de informações de contato
    // Nome da pessoa de contato
    private String name;

    // Sobrenome da pessoa de contato
    private String lastname;

    // Apelido da pessoa de contato
    private String aka;

    // Número de telefone da pessoa de contato
    private int number;

    // Construtor para inicializar um contato
    public Contact(String name, String lastname, String aka, int number) {
        this.name = name;
        this.lastname = lastname;
        this.aka = aka;
        this.number = number;
    }

    // Método para obter informação do contato
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAka() {
        return aka;
    }

    public int getNumber() {
        return number;
    }

    // Método para exibir informações do contato
    public void displayContactInfo() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("AKA: " + aka);
        System.out.println("Number: " + number);
    }
}
