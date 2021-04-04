package server.fix.hnx;

import java.io.File;

import org.quickfixj.codegenerator.MessageCodeGenerator;
import org.quickfixj.codegenerator.MessageCodeGenerator.Task;

public class Customizing {
    public static void main(String[] args) {
    
        String basePackage = "hnx.quickfix";
        Task task = new Task();
        task.setName("Custom HNX");
        task.setSpecification(new File("src/main/resources/HNXFIX.xml"));
        task.setTransformDirectory(new File("src/main/resources/transform"));
        task.setOutputBaseDirectory(new File("src/main/resources/output-src"));
        task.setOverwrite(true);
        task.setMessagePackage(basePackage + ".messages");
        task.setFieldPackage(basePackage + ".fields");
        MessageCodeGenerator codeGenerator = new MessageCodeGenerator();
        codeGenerator.generate(task);
    }
}
