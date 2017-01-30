package usuario.app.pamperme.Data;

/**
 * Created by herculanobarros on 26/01/2017.
 */

public class CriticsData {

    int idvisit;
    int idclient;
    String description;
    float evaluation;

    public CriticsData(float evaluation, int idvisit, int idclient, String description) {
        this.evaluation = evaluation;
        this.idvisit = idvisit;
        this.idclient = idclient;
        this.description = description;

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