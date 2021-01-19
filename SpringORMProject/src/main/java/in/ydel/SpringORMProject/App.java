package in.ydel.SpringORMProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ydel.dao.StudentDao;
import com.ydel.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
		/*
		 * Student student = new Student(126, "mayuri", 3200); int r=
		 * studentDao.insert(student); System.out.println("done" +r);
		 */
    	
    	
    	// get student by id
		/*
		 * Student student = studentDao.getStudent(123);
		 * System.out.println(student.getStudeId());
		 * System.out.println(student.getStudName());
		 * System.out.println(student.getStudFees());
		 */
    	
    	
    	
    	
    	
    }
}
