package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new ProxyProject("https://github.com/IlkinJava/step_lessons");
        project.run();
    }
}
