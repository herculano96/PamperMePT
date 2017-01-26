package usuario.app.pamperme;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class CriticsActivity {

    int idvisit;
    int idclient;
    String description;
    float evaluation;

    public CriticsActivity(float evaluation, int idvisit, int idclient, String description) {
        this.evaluation = evaluation;
        this.idvisit = idvisit;
        this.idclient = idclient;
        this.description = description;
    }

    public int getIdvisit() {
        return idvisit;
    }

    public void setIdvisit(int idvisit) {
        this.idvisit = idvisit;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(float evaluation) {
        this.evaluation = evaluation;
    }
}
