class x {
    public static void main(String[] args) {

    /*
    See what you can do with arrays.
    https://www.programcreek.com/2013/09/top-10-methods-for-java-arrays/
    */

        // An array creates space for more than one value
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* Can also format arrays this way. Easier to read.
    String[] months = {
                       "January",
                       "February",
                       "March",
                       "April",
                       "May",
                       "June",
                       "July",
                       "August",
                       "September",
                       "October",
                       "November",
                       "December"
                      };
    */

        String birthdayMonth = "March";
        // String birthdayMonth = months[3];

        System.out.println("The first position or index of this array is " + months[0]);
        System.out.println("This array has a length of " + months.length + ".\n");

        // Prints all using for loop
        for (int month = 0; month < months.length; month++) {
            System.out.println(months[month]);
        };

        System.out.println("\r");  // Prints on next line

        // Prints all using for each
        for (String month : months) {

            System.out.println(month);
        }

        System.out.println("\r"); // Prints on next line

        // Skips birthday month
        for (String month : months) {

            if (month.equals(birthdayMonth)) {
                continue;
            }

            System.out.println(month);
        }

        System.out.println("\r");  // Prints on next line

        // Birthday month used to print sentence
        for (String month : months) {

            if (month.equals(birthdayMonth)) {
                System.out.println(month + " is my birthday month.");
            }
            else {
                System.out.println(month);
            }
        }
    }
}
