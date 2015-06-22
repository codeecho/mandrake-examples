package uk.co.codeecho.mandrake.examples.hello.world.spring;

import static uk.co.codeecho.mandrake.core.request.HttpMethod.GET;

public class HelloWorldRouter extends uk.co.codeecho.mandrake.core.router.Router{

    public HelloWorldRouter() {
        route(GET, "/").response(200, "Hello World");
    }

}
