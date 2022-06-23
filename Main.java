import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

class Patient {
    
    public static Scanner sc = new Scanner(System.in);
    public String name;
    public String address;
    public String patientID;
    public String contact_no;

    protected int age;
    protected String sex;

    

    void getName() {
        System.out.print("Enter the name of Patient: ");
        name = sc.nextLine();
    }

    void getAge() {
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }

    void getSex() {
        System.out.print("Enter sex: ");
        sex = sc.next();
    }

    void getContact_No() {
        System.out.print("Enter contact number: ");
        contact_no = sc.next();
    }

    void getAddress() {
        System.out.print("Enter address: ");
        address = sc.next();
    }

    void getPatientID() {
        System.out.println("Enter patientID: ");
        patientID = sc.next();
    }

}

class RegularPatient extends Patient {
    protected String DoctorName;
    String Symptoms;
    String Dignosis;
    String Medicines;
    protected int Fees;


}

class AddmittedPatient extends Patient {
    String DoctorAppointed;
    Date dateOfAdmission;
    String Symptoms;
    String Dignosis;
    int DocFees=500;
    int RoomCharge=3500; //per-day charge

    void setDate(){
        Calendar c1=  Calendar.getInstance();
        System.out.println("Date of Admission: "+ c1.get(Calendar.YEAR)+ " "+ c1.get(Calendar.MONTH)+ " " +c1.get(Calendar.DATE));
        

    }
    void getDoctor(){
        Random r= new Random();
        int idx= r.nextInt(3);
        DoctorAppointed=DoctorName.name[idx];
        System.out.println("The appointed doctor is "+ DoctorAppointed);
    }

    //Make functions of Symptoms, Diagnosis, Medicines

 







}

class DoctorName{
    //This array is decalred static so that the Patient class can access it.
    static String name[]= {"Dr. Das", "Dr. Patel", "Dr. Shah"};
    String spec="Heart Surgeon";

}


class Bill{
    int no_of_days_stayed;

    void calcBill(){
        System.out.println("No. of days the patient stayed: ");
        


    }

    void printBill(){



    }







}


class Main {
   
    public static void main(String[] args) {
        
        AddmittedPatient p = new AddmittedPatient();
        // p.getName();
        // p.getAge();
        // p.getContact_No();
        // p.getAddress();
        // p.getPatientID();
        // p.getSex();
        p.getDoctor();
        p.setDate();


    }
}