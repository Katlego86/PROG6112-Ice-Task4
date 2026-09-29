public abstract class Staff implements iStaff {

    // Variables to store staff data
    private int staffNumber;
    private String staffLocation;

    // Constructor
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // staff number
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // staff location
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Abstract method
    @Override
    public abstract String getStaffHiringProcess();
}
