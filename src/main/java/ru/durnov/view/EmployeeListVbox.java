package ru.durnov.view;

import javafx.scene.layout.VBox;
import ru.durnov.dao.EmployeeService;
import ru.durnov.view.filters.FilterList;
import ru.durnov.view.filters.FilterPane;

public class EmployeeListVbox extends VBox {
    private final EmployeeService employeeService;
    private final FilterPane filterPane;


    public EmployeeListVbox(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.filterPane = new FilterPane(new FilterList().filterList(), this);
    }

    public void filterView() {
    }

    public void defaultView() {
    }
}
