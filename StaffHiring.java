public class StaffHiring extends Staff {

    // Constructor
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    // additional staff must be hired
    @Override
    public String getStaffHiringProcess() {

        if (getStaffNumber() < 20) {
            return "Hiring process must start.";
        } else {
            return "Hiring process is not required.";
        }
    }

    // Print hiring report
    public void printStaffHiring() {

        System.out.println("==========================================");
        System.out.println("          STAFF HIRING REPORT");
        System.out.println("==========================================");

        System.out.println("Staff Members : " + getStaffNumber());
        System.out.println("Location      : " + getStaffLocation());
        System.out.println("Hiring Process: " + getStaffHiringProcess());

        System.out.println("==========================================");
    }
}
