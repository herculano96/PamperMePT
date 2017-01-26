package usuario.app.pamperme;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class ClientActivity {
    String name;
    String residency;
    int age;
    int children;

    public ClientActivity(String name, String residency, int age, int children) {
        this.name = name;
        this.residency = residency;
        this.age = age;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
}
