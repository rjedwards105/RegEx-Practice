public class Driver
{
    public static void main(String[] args)
    {
        Athlete kobe = new Athlete("Kobe", "Bryant", "24", "jjones@agents.com");
        Athlete bryce = new Athlete("Bryce", "Harper", "34", "kbrown@agents.com");
        System.out.println(kobe.toString());
        System.out.println(bryce.toString());


        //First Name Test
        System.out.println("Set the athlete's first name to: ");
        System.out.println("First Name: \"Lebron\"");
        kobe.setFirstName("Lebron");
        System.out.println("First Name: \"Russel\"");
        kobe.setFirstName("Russel");
        System.out.println("First Name: \"Jeff\"");
        kobe.setFirstName("Jeff");
        System.out.println("First Name: \"Karl\"");
        kobe.setFirstName("Karl");
        System.out.println("First Name: \"Winslow\"");
        kobe.setFirstName("Winslow");
        System.out.println("Set the athlete's first name to: " + kobe.getFirstName());
        System.out.println(" ");


        //Last Name Test
        System.out.println("Set the athlete's last name to: ");
        System.out.println("Last Name: \"James\"");
        kobe.setLastName("James");
        System.out.println("Last Name: \"Westbrook\"");
        kobe.setLastName("Westbrook");
        System.out.println("Last Name: \"Towns\"");
        kobe.setLastName("Towns");
        System.out.println("Last Name: \"Bonds\"");
        kobe.setLastName("Bonds");
        System.out.println("Last Name: \"Phelps\"");
        kobe.setLastName("Phelps");
        System.out.println("Set the athlete's last name to: " + kobe.getLastName());
        System.out.println("");


        //Jersey Number Test
        System.out.println("Set the athlete's jersey number to: ");
        System.out.println("\"10\"");
        kobe.setJerseyNumber("10");
        System.out.println("\"95\"");
        kobe.setJerseyNumber("95");
        System.out.println("\"0\"");
        kobe.setJerseyNumber("0");
        System.out.println("\"50\"");
        kobe.setJerseyNumber("50");
        System.out.println("\"12\"");
        kobe.setJerseyNumber("12");
        System.out.println("Set the athlete's jersey number to: " + kobe.getJerseyNumber());
        System.out.println("");

        //Agent Email Test
        System.out.println("Set athlete's agent's email to: ");
        System.out.println("\"john@agents.com\"");
        kobe.setAgentEmail("john@agents.com");
        System.out.println("\"kyle@agents.com\"");
        kobe.setAgentEmail("kyle@agents.com");
        System.out.println("\"jeff@agents.com\"");
        kobe.setAgentEmail("jeff@agents.com");
        System.out.println("\"karl@agents.com\"");
        kobe.setAgentEmail("karl@agents.com");
        System.out.println("\"andrew@agents.com\"");
        kobe.setAgentEmail("andrew@agents.com");
        System.out.println("\"agent\"");
        kobe.setAgentEmail("agent@agents.com");
        System.out.println("Set athlete's agent's email to: " + kobe.getAgentEmail());
        System.out.println("");

        System.out.println("Output: ");
        System.out.println(kobe.toString());
    }//end main
}
