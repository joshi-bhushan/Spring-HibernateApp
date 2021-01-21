package in.ydel.SpringORMProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go= true;
		while(go)
		{
			System.out.println("press 1 for  add new student");
			System.out.println("press 2 for  add new student");
			System.out.println("press 3 for  add new student");
			System.out.println("press 4 for  add new student");
			System.out.println("press 5 for  add new student");
			System.out.println("press 6 for  add new student");
			
			try {
				int input =	Integer.parseInt(br.readLine());
				
				switch (input) {
				case 1:
					
					// add new student
					System.out.println("Enter the student id:");
					int studId = Integer.parseInt(br.readLine());
					System.out.println("Enter the student Name:");
					String studName = br.readLine();
					System.out.println("Enter the student fees:");
					float studFees = Float.parseFloat(br.readLine());
					
					Student  s= new Student();
					 s.setStudeId(studId);
					 s.setStudName(studName);
					 s.setStudFees(studFees);
					 
					 int r = studentDao.insert(s);
					 System.out.println(r+"Student addedd");
					 System.out.println("****************************************************");
					 System.out.println();
					 
					break;

				case 2:
					// get All student
					
					List<Student> studentAll = studentDao.getAll();
				for (Student student : studentAll) {
					System.out.print("Id"+student.getStudeId());
					System.out.print("Name"+student.getStudName());
					System.out.println("Fees"+student.getStudFees());
				}
					
					break;
				case 3:
				
					// get student byID
					System.out.println("Enter the student Id");
					int stId= Integer.parseInt(br.readLine());
					Student student1 = studentDao.getStudent(stId);
					System.out.println("Id :"+student1.getStudeId());
					System.out.println("Name :"+ student1.getStudName());
					System.out.println("Fees :"+ student1.getStudFees());
					System.out.println("-------------------------------------------------------");
					
					break;
				case 4:
					// delete student
					System.out.println("Enter the student Id");
					int id= Integer.parseInt(br.readLine());
					studentDao.deleteStudentByid(id);
					System.out.println("Student deleted..........");
					
					break;
				case 5:
					// update student
					
					System.out.println("Enter the student Id");
					int sid= Integer.parseInt(br.readLine());
					System.out.println("Before update...............");
					Student student = studentDao.getStudent(sid);
					System.out.println("Id "+student.getStudeId());
					System.out.println("Id "+student.getStudName());
					System.out.println("Id "+student.getStudFees());
					
					break;
				case 6:
					// exit
					go = false;
					break;
				}
			
			
		}
			catch (Exception e) {
				System.out.println("invalid input tyr another one !");
				System.out.println(e.getMessage());
			}
		}
    	
		System.out.println("Thanku for my using my application");
    	System.out.println("See you seen.....!");
    	
    	
    }
}
