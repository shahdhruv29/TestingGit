package ehealthcare.OOPs_project;
import ehealthcare.OOPs_project.src.*;
import java.util.*;


class Main {

    public static void main(String[] args) {
        System.out.println("\n\t******************************E-HealthCare-Management-Sytem***********************************\n");
		boolean check = true;
		Scanner sc=new Scanner(System.in);
		while(check==true)
		{
	        System.out.print("\t**********************************************************************************************\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                  1. ENTER PATIENTS DETAILS                                                 *\n");
	        System.out.print("\t*                  2. PRINT PATIENT DETAILS                                                  *\n");
	        System.out.print("\t*                  3. PRINT DOCTOR DETAILS                                                   *\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                  4. PRINT BILL                                                             *\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                  5. EXIT                                                                   *\n");
	        System.out.print("\t**********************************************************************************************\n");	
		    int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("ENTERING PATIENTS DETAILS");
                    break;
                case 2:
                    System.out.println("PRINTING PATIENT DETAILS");
                    Patient.displayPatientDetails();
                    break;
                case 3:
                    System.out.println("PRINTING DOCTOR DETAILS");
                    DoctorInfo.DisplayDoctorDetails();
                    break;
                case 4:
                    System.out.println("PRINTING BILL");
                    break;
                case 5:
                    check=false;
                    break;
            }
            
            
        }
        sc.close();
}
}