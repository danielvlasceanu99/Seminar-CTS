package ro.acs.cts.template.program;

import ro.acs.cts.template.clase.SpectatorNormal;
import ro.acs.cts.template.clase.SpectatorVip;
import ro.acs.cts.template.clase.Template;

public class Main {
    public static void main(String[] args) {
        Template client = new SpectatorNormal("Petrica");
        Template clientVIp = new SpectatorVip("Marcel", 2);

        client.intraPeStadion();
        clientVIp.intraPeStadion();

    }
}
