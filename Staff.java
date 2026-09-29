public abstract class Staff implements iStaff {

    // Variables to store staff information
    private int staffNumber;
    private String staffLocation;

    // Constructor
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Get the staff number
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // Get the staff location
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Abstract method for the hiring process
    @Override
    public abstract String getStaffHiringProcess();
}
