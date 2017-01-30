package usuario.app.pamperme.Data;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class ClientData {
    String name;
    String residency;
    int age;
    int children;

    public ClientData(String name, String residency, int age, int children) {
        this.name = name;
        this.residency = residency;
        this.age = age;
        this.children = children;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
}