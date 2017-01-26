package usuario.app.pamperme;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class BabysittersActivity {
    String name;
    String adress;
    int age;
    float evaluation;
    float price;
    int availability;

    public BabysittersActivity(int availability, String name, String adress, int age, float evaluation, float price) {
        this.availability = availability;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.evaluation = evaluation;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(float evaluation) {
        this.evaluation = evaluation;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
