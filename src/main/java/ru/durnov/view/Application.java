package ru.durnov.view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import ru.durnov.dao.EmployeeDaoService;
import ru.durnov.dao.EmployeeService;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        EmployeeService employeeService = new EmployeeDaoService();
        EmployeeListVbox employeeListVbox = new EmployeeListVbox(employeeService);
        Scene scene = new Scene(employeeListVbox, 1300, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Программа учета кадров");
        primaryStage.show();
    }
}
