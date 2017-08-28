import java.util.Scanner;
import java.util.Arrays;

public class Question3
{
    public static void main (String [] args)
    {
        char[] staffPositionCode = new char[2];
        String[] StaffNames = new String[2];
        int[] staffNumleaves = new int[2];
        char[] positionCode = {'T', 'M', 'S', 'J'};
        int[] numleaves = {52, 28, 21, 14};
        int count = 0;
        char code = ' ';
        int option;

        Scanner scanOption = new Scanner(System.in);
        do {
            displayMenu();
            System.out.print("Enter option: ");
            option = scanOption.nextInt();
            switch(option) {
                case 1: 
                    if (count==2)
                        System.out.println("No more staff can be added.");
                    else {
                        scanOption.nextLine();
                        System.out.print("Enter name of stuff to add: ");
                        String addedName = scanOption.nextLine();
                        System.out.print("Enter position code of staff to add (T, M, S or J): ");
                        code = scanOption.next().charAt(0);
                        count = addStaff(addedName, code, StaffNames, staffPositionCode, staffNumleaves, count, positionCode, numleaves);
                    }
                    break;
                case 2: 
                    scanOption.nextLine();
                    System.out.print("Enter name of staff to remove: ");
                    String removeName = scanOption.nextLine();
                    boolean isRemoved = removeStaff(removeName, StaffNames, staffPositionCode, staffNumleaves, count);
                    if (isRemoved)
                        count--;
                    break;
                case 3:
                scanOption.nextLine();
                    System.out.print("Enter name of staff taking leave: ");
                    String staff = scanOption.nextLine();
                    System.out.print("Enter number of days to apply leave for: ");
                    int numOfLeaves = scanOption.nextInt();
                    int checkLeaveApproved = takeLeave(staff, numOfLeaves, StaffNames, staffNumleaves, count);
                    if ((checkLeaveApproved>=0) && (checkLeaveApproved!=Integer.MAX_VALUE)) 
                        System.out.println(staff + " has " + checkLeaveApproved + " day(s) of leave left");
                    else if (checkLeaveApproved<0) {
                        System.out.println("Applying " + numOfLeaves + "days will result in " + String.valueOf(checkLeaveApproved) + " days leave!");
                        System.out.println(staff + " can apply only " + (checkLeaveApproved+numOfLeaves) + " day(s) of leave");
                    }
                    break;
                case 4: 
                    listStaffWithLeave(StaffNames, staffNumleaves, count);
                    break;
                default: 
                    System.out.println("Closing application");
                    System.exit(0);
                break;
            }
        } while(option!=0);
    }

    public static int search(String name, String[] staffNames, int count) 
    {
        for (int index=0; index<count; index++) {
            if (name.equals(staffNames[index]))
                return index;
        }
        return -1;
    }
    
    public static int addStaff(String name, char positioncode, String[] staffNames, char[] staffPositionCode, int[] staffNumleaves, int count, char[] position, int[] numleaves)
    {
        if (search(name, staffNames, count) != -1) //name exists in staffNames
            System.out.println(name + " is already a staff!");
        else { //name doesn't exists in staffNames
            staffNames[count] = name;
            staffPositionCode[count] = positioncode;
            for (int findCode=0; findCode<4; findCode++) {
                if (positioncode == position[findCode]) { 
                    staffNumleaves[count] = numleaves[findCode];
                    System.out.println("Successfully added " + name + " with " + numleaves[findCode] + " days of leaves!");
                }
            }
            count++;
        }
        return count;
    }

    public static boolean removeStaff(String name, String[] staffNames, char[] staffPositionCode, int[] staffNumleaves, int count)
    {
        if (search(name, staffNames, count) == -1) { //name doesn't exists in staffNames
            System.out.println("Can't remove " + name + ": Reason: Not a staff");
            return false;
        }
        else {
            for (int staffIndex=search(name, staffNames, count)+1; staffIndex<count; staffIndex++) {
                staffNames[staffIndex-1] = staffNames[staffIndex];
                staffPositionCode[staffIndex-1] = staffPositionCode[staffIndex];
                staffNumleaves[staffIndex-1] = staffNumleaves[staffIndex];
            }
            System.out.println("Successfully removed: " + name);
            return true;
        }
    }

    public static int takeLeave(String name, int numDays, String[] staffNames, int[] staffNumleaves, int count)
    {
        if (search(name, staffNames, count) == -1) { //name doesn't exists in staffNames
            System.out.println("Can't apply leave " + name + ": Reason: Not a staff");
            return Integer.MAX_VALUE;
        }
        else {
            if (numDays > staffNumleaves[search(name, staffNames, count)]) {
                System.out.println("Can't apply leave " + name + ": Reason: Insufficient leave");
                return (staffNumleaves[search(name, staffNames, count)] - numDays); //return negative value
            }
            else {
                staffNumleaves[search(name, staffNames, count)] = staffNumleaves[search(name, staffNames, count)] - numDays;
                System.out.println("Successful leave application for " + name);
                return staffNumleaves[search(name, staffNames, count)]; // return remaining leaves
            }
        }
    }

    public static void listStaffWithLeave(String[] staffNames, int[] staffNumleaves, int count)
    {
        System.out.println("List of Staff who can Take Leave");
        for (int displayIndex=0; displayIndex<count; displayIndex++) {
            System.out.printf("%-5s %5d days %n", staffNames[displayIndex], staffNumleaves[displayIndex]);
        }
        System.out.println("End of List");
    }

    public static void displayMenu()
    {
        System.out.println("Menu");
        System.out.println("1. Add Staff");
        System.out.println("2. Remove Staff");
        System.out.println("3. Take Leave");
        System.out.println("4. List Staff Leave Details");
        System.out.println("0. Exit");
    }
}
