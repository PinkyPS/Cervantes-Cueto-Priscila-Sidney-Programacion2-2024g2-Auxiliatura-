package contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. List Contacts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Age: ");
                    Integer age = Integer.parseInt(scanner.nextLine());
                    Contacto contacto = new Contacto(name, phone, email, age);
                    agenda.agregarContacto(contacto);
                    System.out.println("Contact added.");
                    break;

                case "2":
                    System.out.print("Name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    agenda.eliminarContacto(nameToDelete);
                    System.out.println("Contact deleted.");
                    break;

                case "3":
                    System.out.println("List of contacts:");
                    for (Contacto c : agenda.obtenerContactos()) {
                        System.out.println(c);
                    }
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }
}
