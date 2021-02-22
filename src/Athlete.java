import java.util.Scanner;

public class Athlete
{

    private String firstName;
    private String lastName;
    private String jerseyNumber;
    private String agentEmail;
    private final Scanner scan = new Scanner(System.in);

    public Athlete(String firstName, String lastName, String jerseyNumber, String agentEmail)
    {
        this.firstName = checkFirstName(firstName);
        this.lastName = checkLastName(lastName);
        this.jerseyNumber = checkJerseyNumber(jerseyNumber);
        this.agentEmail = checkAgentEmail(agentEmail);
    }


    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getJerseyNumber()
    {
        return jerseyNumber;
    }
    public String getAgentEmail()
    {
        return agentEmail;
    }



    public void setFirstName(String firstName)
    {
        this.firstName = checkFirstName(firstName);
    }

    public void setLastName(String lastName)
    {
        this.lastName = checkLastName(lastName);
    }

    public void setJerseyNumber(String jerseyNumber)
    {
        this.jerseyNumber = checkJerseyNumber(jerseyNumber);
    }

    public void setAgentEmail(String agentEmail)
    {
        this.agentEmail = checkAgentEmail(agentEmail);
    }



    private String checkFirstName(String fullName)
    {
        while(!fullName.matches("[A-Z][A-Za-z]+"))
        {
            System.out.println("First Name: Invalid input, try again");
            fullName = scan.next();
        }
        return fullName;
    }

    private String checkLastName(String fullName)
    {
        while(!fullName.matches("[A-Z]([A-Za-z]|-)+"))
        {
            System.out.println("last Name: Invalid input, try again");
            fullName = scan.next();
        }
        return fullName;
    }


    private String checkJerseyNumber(String num)
    {
        while(!num.matches("[0-9]{1,2}"))
        {
            System.out.println("Jersey Number: Invalid input, try again");
            num = scan.next();
        }
        return num;
    }


    private String checkAgentEmail(String agentEmail)
    {
        while(!agentEmail.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
            System.out.println("Agent Email: Invalid input, try again");
            agentEmail = scan.next();
        }
        return agentEmail;
    }


    public String toString()
    {
        String output;
        output  = "Full Name: " + firstName + " " + lastName;
        output += "\nJersey Number: " + jerseyNumber;
        output += "\nAgent Email: " + agentEmail;
        output += "\n";
        return output;
    }
}