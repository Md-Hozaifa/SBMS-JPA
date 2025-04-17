package App02_SBMS_Data_Jpa.Spring_Data_Jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaApplication.class, args);

		EmployeeRepository employeeRepository=ctx.getBean(EmployeeRepository.class);
/*
		Employee employee=new Employee();
		employee.setEno(111);
		employee.setEname("Salman");
		employee.setEsal("40K");
		employee.setEaddr("HYD");
		employeeRepository.save(employee);*/

//
//		Employee e2=new Employee(222,"Md Hozaifa","30k","Lucknow");
//
//		Employee e3=new Employee(333,"Md Tabish","50k","Lucknow");
//		Employee e4=new Employee(444,"Md Talib","60k","Darbhanga");
//
//		List<Employee> employeeList=new ArrayList<>();
//		employeeList.add(e2);employeeList.add(e3);employeeList.add(e4);
//
//		employeeRepository.saveAll(employeeList);
/*
		Optional<Employee> findById =employeeRepository.findById(111);
		if(findById.isPresent()){
			System.out.println(findById.get());
		}else {
			System.out.println("Record is not available sir...");
		}*/

/*
		List<Integer> employeeList=new ArrayList<>();

		employeeList.add(111);
		employeeList.add(222);
		employeeList.add(333);


		Iterable<Employee>findAllById=employeeRepository.findAllById(employeeList);

		findAllById.forEach(s1->{
			System.out.println(s1);

		});*/

	/*	Iterable<Employee> I=employeeRepository.findAll();
		I.forEach(s->{
			System.out.println(s);
		});*/
/*
		employeeRepository.deleteById(111);
		System.out.println("Record has been deleted...");*/

//		List<Integer> employeeList=new ArrayList<>();
//
//		employeeList.add(111);
//		employeeList.add(222);
//		employeeList.add(333);
//
//
//		employeeRepository.deleteAllById(employeeList);
//
//		System.out.println("All  record given has been deleted...");
//
/*
		Employee employee=employeeRepository.findByename("Md Talib");
		System.out.println(employee);

		Employee employee1=employeeRepository.findByeaddr("Darbhanga");
		System.out.println(employee1);*/
/*
		List<Employee> list=employeeRepository.findByEnameAndEsal("Md Talib","60k");
		System.out.println(list);*/

/*
		List<Employee> employeeList=employeeRepository.findByEnameIn(Arrays.asList("Ram","Jon"));
		System.out.println(employeeList);
*/
/*
		List<Employee> list=employeeRepository.getAllEmployee();
		System.out.println(list);*/



		//Query Example code
		/*Employee employee=new Employee();

		employee.setEno(111);


		employee.setEname("Jon");
		*//*employee.setEname("Mohan");


		employee.setEsal("69");

		employee.setEaddr("Hyd");
*//*
		Example<Employee> example=Example.of(employee);

		List<Employee> employeeList=employeeRepository.findAll(example);

		for (Employee e: employeeList){
			System.out.println(e);
		}

*/

	}

}
