package example.collura.colluramvp.mvp.data.model.eventbus;

/**
 * Created by Betto on 26/03/2018.
 */

public class PreferencesResponse {
    private String response;

    public PreferencesResponse (String response) {
        this.response = response;
    }

    public String getResponse () {
        return response;
    }
}
