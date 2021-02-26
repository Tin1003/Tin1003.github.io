import java.util.jar.Attributes.Name;





public class App {
    public static void main(String[] args) throws Exception {
        student student = new student();
        student.Name = "Tin";
        student.MSSV = 1003 ;
        student.DLT = 9;
        student.DTH = 10;
        System.out.println( " Điểm trung bình của"  + student.DTB ( student.DTH, student.DLT) );

        student student2 = new student(1003, "Tin", 10, 10);
        student student3 = new student();
        student3.Name = "SV1";
        student3.Age = 20;
        student3.address = "HG";
        
        student student4 = new student();
        student4.Name = "SV2";
        student4.Age  = 21;
        student4.address = "HN";      
       
        student student5 = new student();
        student5.Name = "SV3";
        student5.Age = 28;
        student5.address = "HN";

        student student6 = new student("SV6", "HN", 21);
        

       
    }
}
