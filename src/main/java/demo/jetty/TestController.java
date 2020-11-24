package demo.jetty;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/test")
public class TestController {

    @Get("/name")
    @Produces(MediaType.TEXT_PLAIN)
    public String name() {
        return "test";
    }

}
