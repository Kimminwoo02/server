package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit {
    public void onStartup(ServletContext servletContext);
}
