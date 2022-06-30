package ehealthcare.OOPs_project.src;
import java.util.*;
// import ehealthcare.OOPs_project.src.bin.*;
public class Patient {
    
    public static Scanner sc = new Scanner(System.in);
    public String name;
    public String address;
    public String patientID;
    public String contact_no;
    protected String type;      // types bifurcates between RegularPatient and AddmittedPatient
    protected String status;    // 2 status possible for RegularPatient appointed, examined
                                // 3 types possible for AddmittedPatient toAdmit, Addmitted, Released

    protected int age;
    protected String sex;
    public String DoctorAppointed;

    Patient(String patientID, String name, String type) {
        this.name = name;
        this.patientID = patientID;
    }

    // I think we also need a function for generting patientID if possible
    
    // an abstract function to print detail for the patient
    void printPatientDetail(){


    }
    public static void displayPatientDetails(){
        RegularPatient.displayAddmittedDetails();
        AddmittedPatient.displayAddmittedDetails();
    }
    
    
    // functions to take input from user for Name, Age, Sex, Contact_No, Address, PatientID
    void setName() {
        System.out.print("Enter the name of Patient: ");
        name = sc.nextLine();
    }

    void setAge() {
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }

    void setSex() {
        System.out.print("Enter sex: ");
        sex = sc.next();
    }

    void setContact_No() {
        System.out.print("Enter contact number: ");
        contact_no = sc.next();
    }

    void setAddress() {
        System.out.print("Enter address: ");
        address = sc.next();
    }

    void setPatientID() {
        System.out.println("Enter patientID: ");
        patientID = sc.next();
    }

}

class RegularPatient extends Patient {
    public static ArrayList<RegularPatient> rpList = new ArrayList<>();
    static {
		rpList.add(new RegularPatient("001", "Rahul", RegularPatient.type));
		rpList.add(new RegularPatient("002", "Aakash", RegularPatient.type));
	}
    
    protected String DoctorName;
    String Symptoms;
    String Dignosis;
    String Medicines;
    protected int Fees;
    static String type = "RegularPatient";
    
/********************************************************************************************************************************************/

    @Override       // It will Override the abstract printPatientDetail method
    void printPatientDetail() {     // It will print all the details of the particular patient
        System.out.println("Patient ID : " + patientID);
        System.out.println("Patient name : " + name);
        System.out.println("Patient age : " + age);
        System.out.println("Patient sex : " + sex);
        System.out.println("Patient type : " + type);
        System.out.println("Patient status : " + status);
        System.out.println("DoctorAppointed : " + DoctorAppointed);
        if (this.status == "examined") {
            System.out.println("Digonosis" + Dignosis);
            System.out.println("Medicines" + Medicines);
            System.out.println("Charges " + Fees);
        }
        System.out.println("Patient address : " + address);
        System.out.println("Patient contact_no : " + contact_no);
    }

    public static void displayAddmittedDetails() {
	    for (int i=0; i < rpList.size(); i++) {
	        Patient tempPatient = rpList.get(i);
	        System.out.println("Patient ID : " + tempPatient.patientID + "   Patient Name : " + tempPatient.name + "   Type : " + tempPatient.type);
	    }
	}

/********************************************************************************************************************************************/
    RegularPatient( String patientID, String name,String type) {
        super(patientID, name,  type);
    }

}

class AddmittedPatient extends Patient {
    
    public static ArrayList<AddmittedPatient> apList = new ArrayList<>();
    static {
        apList.add(new AddmittedPatient("001", "Jay", AddmittedPatient.type));
        apList.add(new AddmittedPatient("002", "Jaya", AddmittedPatient.type));
    }

    // Attributes
    String DoctorAppointed;
    Date dateOfAdmission;
    String Symptoms;
    String Dignosis;
    int billAmount;
    int DocFees=500;    //intitially it it decided same for all doctor
    int RoomCharge=3500; //per-day charge
    
    
    static String type = "AddmittedPatient";
    /********************************************************************************************************************************************/
    
    @Override       // It will Override the abstract printPatientDetail method
    void printPatientDetail() {     // It will print all the details of the particular patient
        System.out.println("Patient ID : " + patientID);
        System.out.println("Patient name : " + name);
        System.out.println("Patient age : " + age);
        System.out.println("Patient sex : " + sex);
        System.out.println("Patient type : " + type);
        System.out.println("Date of Addmissioin : " + dateOfAdmission.toString());
        System.out.println("DoctorAppointed : " + DoctorAppointed);
        System.out.println("Patient status : " + status);
        if (status == "released") {
            System.out.println("Bill :" + billAmount);
        }
        System.out.println("Patient address : " + address);
        System.out.println("Patient contact_no : " + contact_no);
        
    }

    void setDate(){
        Calendar c1=  Calendar.getInstance();
        System.out.println("Date of Admission: "+ c1.get(Calendar.YEAR)+ " "+ c1.get(Calendar.MONTH)+ " " +c1.get(Calendar.DATE));
        
    }
    
    // appointDoctor function will appointDoctor to the patient
    void appointDoctor(){
        DoctorAppointed = DoctorInfo.DoctorAllotment();
    }

    //Fuction that print the basic details of all patient
    public static void displayAddmittedDetails() {
	    for (int i=0; i < apList.size(); i++) {
	        Patient tempPatient = apList.get(i);
	        System.out.println("Patient ID : " + tempPatient.patientID + "   Patient Name : " + tempPatient.name + "   Type : " + tempPatient.type);
	    }
	}

    //Make functions of Symptoms, Diagnosis, Medicines
   
    AddmittedPatient(String patientID, String name, String type) {
        super(patientID, name, type);
    }

}