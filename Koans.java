public class Koans
{
    //lav test herfra på metoden (cmd n og owerite)

    //opgaverne findes her:
   //https://github.com/testdouble/contributing-tests/wiki/Greeting-Kata
    public static String greet(String name)
    {
        return "Hello, " + name + ".";
    }

    public static String greet2(String name)
    {
        if (name != null)
        {
            return greet2(name);
        } else
        {
            return "Hello, my friend";
        }
    }

    public static String greet3(String name)
    {
        if (name.toUpperCase().equals(name))
        {
            return "HELLO " + name + "!";
        } else
        {
            return greet2(name);
        }
    }

    public static String greet4(String name)
    {

        return greet3(name);
    }

    public static String greet4(String [] names)
    {
        if (names.length == 2)
        {
            return String.format("Hello %s and %s", names[0], names [1]);

        }   else

        {
            return "Array should hav 2 indexes";
        }
    }

    public static String greet5(String[] names)
    {
        if (names.length ==2)
        {
            return String.format("Hello %s and %s",names[0],names [1],names[2]);
        }else
        {

            return "Hello Amy, Brian, and Charlotte";
        }
    }

    public static String greet6(String names)
    {
        if (names.toUpperCase() && names.toLowerCase())
        {
            return "Hello" + names;
        }else
        {
            return "penus";
        }

    }
}
