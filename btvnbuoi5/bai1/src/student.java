import java.util.jar.Attributes.Name;

public class student {
    public int MSSV;
    public String Name;
    public float DLT;
    public float DTH;

    public student(){
        System.out.println("Goi toi constructor");
    }

    public student(int MSSV, String Name, float DLT, float DTH){
        this.Name = Name;
        this.MSSV = MSSV;
        this.DLT = DLT;
        this.DTH = DTH;
    }
    public float DTB( float DTH, float DLT){
        return (float)(DTH + DLT)/2;
       
    }
  public  String address;
  public float Age;
   
  public student(String Name, String address, float Age ){
      this.Name = Name;
      this.address = address;
      this.Age = Age;
  }

   
    
}
