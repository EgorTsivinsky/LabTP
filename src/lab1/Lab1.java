

package lab1;

import entity.Studentyi;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Session;
import utils.NewHibernateUtil;


public class Lab1 {

    /**
     * @param args the command line arguments ndnder
     */
    public static void main(String[] args) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Tasks tasks = new Tasks(session);
        List<Studentyi> students = tasks.task1();
        for(Studentyi student : students){
            System.out.println(student.toString());
        }
        //new branch branch
        System.out.println();
        HashMap map = tasks.task2();
        System.out.println(map);
        tasks.task3();
        session.getTransaction().commit();
    }
    
}
