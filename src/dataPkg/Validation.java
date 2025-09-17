// VALIDATION CLASS (c)
// CREATOR: S. Govender (Seatides Combined School)
// VERSION: 5 (2012)
// OTHER VERSIONS: 1 (2008), 2 (2009), 3 (2010), 4 (2011)
// This class or any of its parts MAY NOT be copied, printed, distributed by itself or as part of 
// a package (including tuition) for which monetary gain is received, without receiving consent from the creator.
// Note that I (Milaan Kassie) have edited or added methods to this class
package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation
{

    static DbManager dbm = new DbManager();

    //this validation method ensures that the primary key of the visitsTable works like an autonumber from out interface. Also checks if the key exists if we enter manually
    public static boolean vVisitNoCheck(String valueToCheck) throws SQLException
    {   //lopk = list of primary keys and the thing following it indicates data type for ex RS = ResultSet        
        boolean valid = false;

        ResultSet lopkRS = dbm.query("SELECT VISITNO FROM TBLVISITS ");

        String lopkString = "";

        if (lopkRS.next())
        {
            lopkString += "'" + lopkRS.getInt(1) + "'" + "\n";
            while (lopkRS.next())
            {
                lopkString += "'" + lopkRS.getInt(1) + "'" + "\n";
            }
        }
        //System.out.println(lopkString);

        ResultSet maxRS = dbm.query("SELECT Nz(Max(VISITNO), 0) + 1 FROM TBLVISITS");

        int maxInt = 0;
        if (maxRS.next())
        {
            maxInt = maxRS.getInt(1);
        }

        //i have the valueToCheck in inverted commas bcs if we looks for 2 in the RS, it will find 2 in 12. 
        //this way its seperated kinda, almost like using a delimeter
        if (!(lopkString.contains("'" + valueToCheck + "'")) && (Integer.parseInt(valueToCheck) <= maxInt))
        {
            System.out.println("VALID");
            valid = true;
        } else
        {
            System.out.println("INVALID");
            valid = false;
        }

        return valid;
    }

    //this validation method checks the primary key for the tables, eventsTable and patronsTable, making sure that the primary key set is the next one in the sequence or not already in the list of primary keys
    public static boolean vPKCheck(String valueToCheck, char initial, String primaryKeyField, String table) throws SQLException
    {   //lopk = list of primary keys and the thing following it indicates data type for ex RS = ResultSet        
        boolean valid = false;

        ResultSet lopkRS = dbm.query("SELECT RIGHT(" + primaryKeyField + ", 5) FROM " + table + " ");

        String lopkFK = "";
        String lopkLIST = "";

        if (lopkRS.next())
        {
            //getting the first key
            lopkFK = "'E" + lopkRS.getString(1) + "'" + "\n";
            //getting all the other keys
            while (lopkRS.next())
            {
                lopkLIST += "'E" + lopkRS.getString(1) + "'" + "\n";
            }
        }
        String lopkFULLLIST = lopkFK + lopkLIST;
        System.out.println(lopkFULLLIST);

        //the next primary key wihtout the zeros
        ResultSet newPKrs = dbm.query("SELECT COALESCE(MAX(CAST(RIGHT(" + primaryKeyField + ", 5) AS INT)), 0) + 1 FROM " + table + ";");

        String newPKString = "";
        if (newPKrs.next())
        {
            newPKString = newPKrs.getInt(1) + "";
        }

        String zeros = "";
        int numZeros = 5 - newPKString.length();

        for (int i = 0; i < numZeros; i++)
        {
            zeros += "0";
        }

        String newPK = "'" + zeros + newPKString + "'";
        System.out.println(newPK);
        //
        //i have the valueToCheck in inverted commas bcs if we looks for 2 in the RS, it will find 2 in 12. 
        //this way its seperated kinda, almost like using a delimeter
        //&& (Integer.parseInt(valueToCheck) <= Integer.parseInt(newPK))
        int extractedNewPK = Integer.parseInt(newPK.replaceAll("[^\\d]", ""));
        System.out.println(extractedNewPK);
        int extractedValueToCheck = Integer.parseInt(valueToCheck.replaceAll("[^\\d]", ""));
        if (!(lopkFULLLIST.contains("'" + valueToCheck + "'")) && (extractedValueToCheck <= extractedNewPK))
        {
            System.out.println("VALID");
            valid = true;
        } else
        {
            System.out.println("INVALID");
            valid = false;
        }
        return valid;
    }

    //this method checks the age is over a min value
    public static boolean vAgeMin(Date dob, int minAge)
    {
        boolean valid = false;

        Date currentDate = new Date();

        if ((currentDate.getYear() - dob.getYear()) > minAge)
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Age requirement of " + minAge + " not met", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
        }
        return valid;
    }

    //so the end date cant be in the past, it must be in the future obvi gang
    //but also the end date cant be before the start date bcs events cant end before they start. 
    public static boolean vDateMin(Date endDate, Date startDate)
    {
        boolean valid = false;

        //actually an end date can be in the past bcs we may need to add or edit an event that happened in the past in correction of an error
        if (!endDate.before(startDate))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Logical Date Error", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

//    public static boolean vDateMax(Date entry, Date startDate)
//    {
//        boolean valid = false;
//
//        //actually an end date can be in the past bcs we may need to add or edit an event that happened in the past in correction of an error
//        if (!entry.after(startDate))
//        {
//            valid = true;
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Logical Date Error", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
//        }
//
//        return valid;
//    }
    
    //checks that the date is one day before its due. will be used for event registration deadline
    public static boolean vDateMaxDayBefore(Date entry, Date startDate)
    {
        boolean valid = false;

        // Create a Calendar instance for the entry date
        Calendar calendarEntry = Calendar.getInstance();
        calendarEntry.setTime(entry);

        // Create a Calendar instance for the start date
        Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTime(startDate);

        // Subtract one day from the start date
        calendarStart.add(Calendar.DAY_OF_MONTH, -1);

        // Compare the entry date with the modified start date
        if (!entry.after(calendarStart.getTime()))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Logical Date Error", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }
    
    //checks the max date, logic check to  make sure a date cant be logged after a certain date
    public static boolean vDateMax(Date entry, Date startDate)
    {
        boolean valid = false;
       
        // Compare the entry date with the modified start date
        if (!entry.after(startDate))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Logical Date Error", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    //presence check. Not really needed cause a lot of sirs methods do this
    public static boolean vBasicPresenceCheck(String field)
    {
        boolean valid = true;

        //this doesnt work any other way. dont break it please
        if (!(!(field.isEmpty()) && !(Character.isWhitespace(field.charAt(0)))))
        {
            JOptionPane.showMessageDialog(null, "Field has been left blank", "Invalid Data Entry", JOptionPane.ERROR_MESSAGE);
            valid = false;

        } else
        {
            valid = true;
        }

        return valid;
    }

//    public static boolean vIntegerCheck(String entry)
//    {
//
//        boolean valid = false;
//        Scanner scanner = new Scanner(entry);
//
//        // Check if the next input is an integer
//        if (scanner.hasNextInt())
//        {
//            valid = true;
//            //System.out.println("You entered an integer: " + number);
//            //JOptionPane.showMessageDialog(null, "All good");
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Invalid Entry");
//        }
//
//        return valid;
//    }
//    public static boolean vDoubleheck(String entry)
//    {
//
//        boolean valid = false;
//
//        int position = entry.indexOf(".");
//        if (position != -1)
//        {
//            // Check if there are exactly two characters after the full stop
//            String decimalPart = entry.substring(position + 1);
//            if (decimalPart.length() == 2)
//            {
//                //JOptionPane.showMessageDialog(null, "The string contains a decimal point at position: " + (position + 1) + " and has exactly two digits after it.");
//                valid = true;
//            } else
//            {
//                JOptionPane.showMessageDialog(null, "The string contains a full stop at position: " + (position + 1) + " but does not have exactly two digits after it.");
//            }
//        }
//
//        return valid;
//    }
    
    //checks the initial characters of the primary key. check for E or P for events and patrons tables
    public static boolean v2IntialCharacters(int numChars, String condition, String entry) //check the first few letters of the user entry to see if it matches the validation condition
    {
        boolean valid = false;

        String entryCheck = "";

        for (int i = 0; i < numChars; i++)
        {
            entryCheck += entry.charAt(i);
        }

        if (entryCheck.equals(condition))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Entry " + entry + " did not begin with the letter(s): " + condition, "Invalid data entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    } //

    //checks if the entry is one of the set options
    public static boolean vVirtualCombo(String entry, String option1, String option2) //check the first few letters of the user entry to see if it matches the validation condition
    {
        boolean valid = false;

        String entryCheck = "";

        if (entry.equals(option1) || entry.equals(option2))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Entry must be either: " + option1 + " or " + option2, "Invalid data entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    } //

    //same as last method with less options
    public static boolean vVirtualCombo3(String entry, String option1, String option2, String option3)
    {
        boolean valid = false;

        if (entry.equals(option1) || entry.equals(option2) || entry.equals(option3))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Entry " + entry + " was not " + option1 + ", " + option2 + ", " + option3, "Invalid data entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    //same again as the last one
    public static boolean vVirtualCombo4(String entry, String option1, String option2, String option3, String option4) //check the first few letters of the user entry to see if it matches the validation condition
    {
        boolean valid = false;

        String entryCheck = "";

        if (entry.equals(option1) || entry.equals(option2) || entry.equals(option3) || entry.equals(option4))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, "Entry " + entry + " was not " + option1 + ", " + option2 + ", " + option3 + " or " + option4, "Invalid data entry", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    } //

    //from here is sir's methods
    public static boolean vDouble(String value, String message)
    {
        boolean valid = false;
        if (message.equalsIgnoreCase(""))
        {
            message = "Invalid number";
        }
        if (value.endsWith("d") || value.endsWith("D") || value.endsWith("f") || value.endsWith("F"))
        {
            message += " The value cannot end in a D or a F";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);

        } else
        {
            try
            {
                double n = Double.parseDouble(value);
                valid = true;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }
        return valid;
    }

    public static boolean vDoublePositive(String value, String message)
    {
        if (message.equalsIgnoreCase(""))
        {
            message = "Entry must be a positive double value";
        }

        boolean valid = vDouble(value, message);
        if (valid)
        {
            double n = Double.parseDouble(value);
            if (n < 0)
            {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }

        return valid;
    }

    public static boolean vInteger(String value, String message)
    {
        if (message.equalsIgnoreCase(""))
        {
            message = "Invalid Integer";
        }

        boolean valid = false;
        try
        {
            int n = Integer.parseInt(value);
            valid = true;
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vIntegerPositive(String value, String message)
    {
        if (message.equalsIgnoreCase(""))
        {
            message = "Entry must be a positive integer value";
        }

        boolean valid = vInteger(value, message);
        if (valid)
        {
            int n = Integer.parseInt(value);
            if (n < 0)
            {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
        }
        return valid;
    }

    public static boolean vDoubleRange(String value, String message1, String message2, double min, double max)
    {
        boolean validrange = false;

        boolean valid = vDouble(value, message1);

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "The Number does not fall between " + min + " and " + max;
        }

        if (valid == true)
        {
            double n = Double.parseDouble(value);
            if ((n >= min) && (n <= max))
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }
        }
        return validrange;
    }

    public static boolean vIntegerRange(String value, String message1, String message2, int min, int max)
    {
        boolean validrange = false;

        boolean valid = vInteger(value, message1);

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "The Integer does not fall between " + min + " and " + max;
        }

        if (valid == true)
        {
            int n = Integer.parseInt(value);
            if ((n >= min) && (n <= max))
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }
        }
        return validrange;
    }

    public static boolean v2IntegerRange(int entry, int min, int max) //checks if its between the min and max values entered
    {
        boolean valid = false;
        if (entry >= min)
        {
            if (entry <= max)
            {
                valid = true;
            } else
            {
                JOptionPane.showMessageDialog(null, "Value entered is more than the maximum value of " + max, "Invalid User Input", JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Value entered is less than the minmum value of  " + min, "Invalid User Input", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    public static boolean vIntegerDigits(String value, String message1, String message2, int digits)
    {
        boolean validdigits = false;

        boolean valid = vInteger(value, message1);

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "The Integer Value is not a " + digits + " digit value";
        }

        if (valid == true)
        {
            int n = Integer.parseInt(value);
            double n1 = Math.pow(10, digits - 1);
            double n2 = Math.pow(10, digits) - 1;
            if ((n >= n1) && (n <= n2))
            {
                validdigits = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
                validdigits = false;
            }
        }
        return validdigits;
    }

    public static boolean vIntegerDigitsRange(String value, String message1, String message2, String message3, int digits, int min, int max)
    {
        boolean validdigitsrange = false;

        boolean valid1 = vIntegerDigits(value, message1, message2, digits);

        if (valid1 == true)
        {
            boolean valid2 = vIntegerRange(value, message1, message3, min, max);
            if (valid2 == true)
            {
                validdigitsrange = true;
            } else
            {
                validdigitsrange = false;
            }
        }

        return validdigitsrange;
    }

    public static boolean vStringAZ(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z) are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!(Character.isLetter(value.charAt(k))))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vString09(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Digits (0 to 9) are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {

            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!(Character.isDigit(value.charAt(k))))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZspace(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z) and Space/s are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (value.charAt(k) == ' ')))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZdash(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z) and Dash/es are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (value.charAt(k) == '-')))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZspaceDash(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z), Space/s and Dash/es are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (value.charAt(k) == ' ') || (value.charAt(k) == '-')))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZ09(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z) and Digits (0 - 9) are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (Character.isDigit(value.charAt(k)))))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZ09space(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z), Digits (0 - 9) and Space/s are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (Character.isDigit(value.charAt(k))) || (value.charAt(k) == ' ')))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZ09SpaceComma(String value, String message1, String message2)
    {
        if (message1.equalsIgnoreCase(""))
        {
            message1 = "Only Letters (A to Z), Digits (0 - 9), Space/s and Dash/es are allowed";
        }

        if (message2.equalsIgnoreCase(""))
        {
            message2 = "Field cannot be left blank";
        }

        boolean valid = false;
        int lengthvalue = value.length() - 1;

        if (lengthvalue >= 0)
        {
            int k = 0;
            boolean invalid = false;
            while ((k <= lengthvalue) && (invalid == false))
            {
                if (!((Character.isLetter(value.charAt(k))) || (Character.isDigit(value.charAt(k))) || (value.charAt(k) == ' ') || (value.charAt(k) == ',')))
                {
                    invalid = true;
                }
                k++;
            }

            if (invalid == true)
            {
                JOptionPane.showMessageDialog(null, message1, "Error", JOptionPane.ERROR_MESSAGE);
                valid = false;
            } else
            {
                valid = true;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, message2, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;
    }

    public static boolean vStringAZrange(String value, String message1, String message2, String message3, int size)
    {
        boolean validrange = false;

        boolean valid = vStringAZ(value, message1, message2);

        if (message3.equalsIgnoreCase(""))
        {
            message3 = "Please enter a value that has at least " + size + " character/s";
        }

        if (valid == true)
        {
            if (value.length() == size)
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message3, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }

        }
        return validrange;
    }

    public static boolean vString09range(String value, String message1, String message2, String message3, int size)
    {
        boolean validrange = false;

        boolean valid = vString09(value, message1, message2);

        if (message3.equalsIgnoreCase(""))
        {
            message3 = "Please enter a value that has at least " + size + " character/s";
        }

        if (valid == true)
        {
            if (value.length() == size)
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message3, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }

        }
        return validrange;
    }

    public static boolean vStringAZspaceRange(String value, String message1, String message2, String message3, int size) //
    {
        boolean validrange = false;

        boolean valid = vStringAZspace(value, message1, message2);

        if (message3.equalsIgnoreCase(""))
        {
            message3 = "Please enter a value that has at least " + size + " character/s";
        }

        if (valid == true)
        {
            if (value.length() == size)
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message3, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }

        }
        return validrange;
    }

    public static boolean vStringAZ09range(String value, String message1, String message2, String message3, int size)
    {
        boolean validrange = false;

        boolean valid = vStringAZ09(value, message1, message2);

        if (message3.equalsIgnoreCase(""))
        {
            message3 = "Please enter a value that has " + size + " character/s";
        }

        if (valid == true)
        {
            if (value.length() == size)
            {
                validrange = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message3, "Error", JOptionPane.ERROR_MESSAGE);
                validrange = false;
            }

        }
        return validrange;
    }

    public static boolean vEmail(String emailAdd, String message)
    {
        boolean valid = false;

        //check if its blank
        if (emailAdd.equalsIgnoreCase(""))
        {

            message = "Email field cannot be left blank";
        } else
        {
            if (message.equalsIgnoreCase(""))
            {
                message = "Format for email address incorrect";
            }

            String pattern = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            if (emailAdd.matches(pattern))
            {
                valid = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return valid;
    }

    //tweaked version of original method
    public static boolean vEmail2(String emailAdd, String message)
    {
        boolean valid = false;

        //check if its blank
        if (emailAdd.equalsIgnoreCase(""))
        {

            message = "Email field cannot be left blank";
        } else
        {
            message = "Format for email address incorrect";
        }

        String pattern = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        if (emailAdd.matches(pattern))
        {
            valid = true;
        } else
        {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    public static boolean vWebsite(String webAdd, String message)
    {
        boolean valid = false;

        if (webAdd.equalsIgnoreCase(""))
        {
            message = "Please enter a web address";
        } else
        {
            if (message.equalsIgnoreCase(""))
            {
                message = "Format for web address incorrect";
            }

            String pattern = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
            if (webAdd.matches(pattern))
            {
                valid = true;
            } else
            {
                JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return valid;
    }

    public static boolean vDateString(String theDate, String dateFormat, String message)
    {
        boolean valid = false;

        if (dateFormat.equalsIgnoreCase(""))
        {
            dateFormat = "dd-MM-yyyy";
        }

        if (message.equalsIgnoreCase(""))
        {
            message = "Invalid Date. Please enter a valid date in the format " + dateFormat;
        }

        try
        {
            SimpleDateFormat d = new SimpleDateFormat(dateFormat);
            d.setLenient(false);
            d.parse(theDate);

            if (vIntegerDigitsRange(theDate.substring(dateFormat.indexOf("y")), "There must be a CORRECT year value", "The year must have FOUR digits", "Invalid year [1900 - " + (new java.util.Date().getYear() + 1900) + "]", 4, 1900, new java.util.Date().getYear() + 1900))
            {
                valid = true;
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    public static boolean vDateParts(String day, String month, String year)
    {
        boolean valid = false;

        if ((vIntegerRange(day, "There must be at least one day", "At most a month can only have 31 days", 1, 31)) && (vIntegerRange(month, "There must be at least one month", "There are only 12 Months in a year", 1, 12)) && (vIntegerDigitsRange(year, "There must be a year value", "A year must have FOUR digits", "Invalid year [1900 - " + (new java.util.Date().getYear() + 1900) + "]", 4, 1900, new java.util.Date().getYear() + 1900)))
        {
            valid = true;

            switch (Integer.parseInt(month))
            {
                case 4:
                case 6:
                case 9:
                case 11:
                {
                    if (Integer.parseInt(day) > 30)
                    {
                        valid = false;
                        JOptionPane.showMessageDialog(null, "There are only THIRTY days in this month", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                }

                case 2:
                {
                    if (Integer.parseInt(year) % 4 == 0)
                    {
                        if (Integer.parseInt(day) > 29)
                        {
                            valid = false;
                            JOptionPane.showMessageDialog(null, "There are only 29 days in February for this year", "Error", JOptionPane.ERROR_MESSAGE);

                        }
                    } else
                    {
                        if (Integer.parseInt(day) > 28)
                        {
                            valid = false;
                            JOptionPane.showMessageDialog(null, "There are only 28 days in February for this year", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                    break;
                }
            }
        }
        return valid;
    }

    public static boolean vTimeParts(String hour, String minutes, String seconds)
    {
        boolean valid = false;

        if ((vIntegerRange(hour, "Invalid hour value [0 - 23]", "There are 24 hours in a day [0 - 23]", 0, 23)) && (vIntegerRange(minutes, "Invalid minute value [0 - 59]", "There are 60 minutes in a hour [0 - 59]", 0, 59)) && (vIntegerRange(seconds, "Invalid second value [0 - 59]", "There are 60 seconds in minute [0 - 59]", 0, 59)))
        {
            valid = true;
        }
        return valid;
    }

    public static boolean vTimeString(String theTime, String message)
    {
        boolean valid = false;

        String timeFormat = "HH:mm:ss";

        if (message.equalsIgnoreCase(""))
        {
            message = "Invalid Time. Please enter a valid time in the format  " + timeFormat + "   [0-23] : [0-59] : [0-59]";
        }

        try
        {
            SimpleDateFormat t = new SimpleDateFormat(timeFormat);
            t.setLenient(false);
            t.parse(theTime);
            valid = true;
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }

    public String CurrentAge(String birthDate, String dateFormat, String message)
    {
        String line = "";

        try
        {
            if (dateFormat.equalsIgnoreCase(""))
            {
                dateFormat = "dd-MM-yyyy";
            }

            if (message.equalsIgnoreCase(""))
            {
                message = "Invalid Date. Please enter a valid date in the format " + dateFormat;
            }

            if (vDateString(birthDate, dateFormat, message))
            {
                Date dd = new SimpleDateFormat(dateFormat).parse(birthDate);

                int dayP = dd.getDate();
                int monthP = dd.getMonth() + 1;
                int yearP = dd.getYear() + 1900;

                int day = new java.util.Date().getDate();
                int month = new java.util.Date().getMonth() + 1;
                int year = new java.util.Date().getYear() + 1900;

                int y = year - yearP;

                int m = 0;

                int d = 0;

                int numD = 0;

                if (month < monthP)
                {
                    m = (month - monthP) + 12;
                    y = y - 1;
                } else
                {
                    m = month - monthP;
                }

                switch (month)
                {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                    {
                        numD = 30;
                        break;
                    }

                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    {
                        numD = 31;
                        break;
                    }

                    case 2:
                    {
                        if (year % 4 == 0)
                        {
                            numD = 29;
                        } else
                        {
                            numD = 28;
                        }

                        break;
                    }
                }

                if (day < dayP)
                {
                    d = (day - dayP) + numD;
                    m = m - 1;
                } else
                {
                    d = day - dayP;
                }

                line = y + " year/s,  " + m + " month/s, " + d + " day/s";

            }
        } catch (Exception ex)
        {

        }
        return line;

    }

}
