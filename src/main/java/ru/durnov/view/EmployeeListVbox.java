package ru.durnov.view;

import javafx.scene.layout.VBox;
import ru.durnov.dao.EmployeeService;

public class EmployeeListVbox extends VBox {
    private final EmployeeService employeeService;

    public EmployeeListVbox(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
}
