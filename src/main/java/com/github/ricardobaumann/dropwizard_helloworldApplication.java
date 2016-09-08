package com.github.ricardobaumann;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizard_helloworldApplication extends Application<dropwizard_helloworldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizard_helloworldApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard_helloworld";
    }

    @Override
    public void initialize(final Bootstrap<dropwizard_helloworldConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizard_helloworldConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
