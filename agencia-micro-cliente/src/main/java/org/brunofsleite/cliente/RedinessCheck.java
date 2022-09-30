package org.brunofsleite.cliente;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class RedinessCheck implements HealthCheck {
    @Override
    public HealthCheckResponse call() {

        if(Cliente.listAll() == null) {
            return HealthCheckResponse.down("I'm not ready");
        } else {
            return HealthCheckResponse.up("I'm ready");
        }
    }
}
