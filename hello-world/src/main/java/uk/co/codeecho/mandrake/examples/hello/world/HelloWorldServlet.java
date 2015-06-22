package uk.co.codeecho.mandrake.examples.hello.world;

import uk.co.codeecho.mandrake.core.MandrakeServlet;
import uk.co.codeecho.mandrake.core.router.Router;

public class HelloWorldServlet extends MandrakeServlet{

    @Override
    public Router setupRouter() {
        return new HelloWorldRouter();
    }

}
