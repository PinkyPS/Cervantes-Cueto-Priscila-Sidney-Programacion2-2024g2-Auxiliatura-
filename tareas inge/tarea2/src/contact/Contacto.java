package contact;
import java.io.Serializable;

public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private Integer age;
    private String phone;

    public Contacto(String name, String phone, String email, Integer age) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email + ", Age: " + age;
    }
}

