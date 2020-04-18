import java.util.*;
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void addEmployee(Employee e);
    public void updateEmployee(Employee e);
    public void deleteEmployee(Employee e);
}