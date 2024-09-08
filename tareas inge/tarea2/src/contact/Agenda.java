package contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contacto> contactos;
    private static final String ARCHIVO_CONTACTOS = "contactos.dat";

    public Agenda() {
        contactos = new ArrayList<>();
        cargarContactos();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        guardarContactos();
    }

    public void eliminarContacto(String name) {
        contactos.removeIf(c -> c.getName().equalsIgnoreCase(name));
        guardarContactos();
    }

    public List<Contacto> obtenerContactos() {
        return contactos;
    }

    private void guardarContactos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_CONTACTOS))) {
            oos.writeObject(contactos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarContactos() {
        File archivo = new File(ARCHIVO_CONTACTOS);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_CONTACTOS))) {
                contactos = (List<Contacto>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

