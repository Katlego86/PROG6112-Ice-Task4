public class HomeMakeoverReport {

    public static void main(String[] args) {

        // Single-dimensional array containing the six months
        String[] months = {
            "JANUARY",
            "FEBRUARY",
            "MARCH",
            "APRIL",
            "MAY",
            "JUNE"
        };

        // Two-dimensional array containing:
        // Bathroom, Kitchen and Garden makeover numbers
        int[][] makeovers = {
            {8, 2, 5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };

        // Display report heading
        System.out.println("==============================================");
        System.out.println("       MONTHLY HOME MAKEOVER REPORT");
        System.out.println("==============================================");

        System.out.printf("%-12s %-12s %-12s %-12s %-10s%n",
                "MONTH", "BATHROOMS", "KITCHENS", "GARDEN", "TOTAL");

        System.out.println("--------------------------------------------------------------");

        // Process each month
        for (int i = 0; i < months.length; i++) {

            // Calculate the total makeovers for the month
            int total = 0;

            for (int j = 0; j < makeovers[i].length; j++) {
                total += makeovers[i][j];
            }

            // Display the monthly information
            System.out.printf("%-12s %-12d %-12d %-12d %-10d",
                    months[i],
                    makeovers[i][0],
                    makeovers[i][1],
                    makeovers[i][2],
                    total);

            // Display three stars when the total is 15 or more
            if (total >= 15) {
                System.out.print(" ***");
            }

            System.out.println();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Report completed successfully.");
    }
}
