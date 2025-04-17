package App02_SBMS_Data_Jpa.Spring_Data_Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByename(String ename);
    public Employee findByeaddr(String eaddr);
    public List<Employee> findByEnameAndEsal(String ename, String esal);

//    public List<Employee> findByEsalGreaterThanEmployees(String esal);

    public List<Employee> findByEnameIn(List<String> ename);

    @Query(value = "Select * from emp" ,nativeQuery = true)
    public List<Employee> getAllEmployee();



}
