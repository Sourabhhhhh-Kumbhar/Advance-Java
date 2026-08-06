enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class EnumSwitch
{
    public static void main(String[]args)
    {
         TrafficLight light = TrafficLight.RED;

        switch (light)
        {
            case RED:
                System.out.println("RED");
                break;

                case YELLOW:
                    System.out.println("YELLOW");
                    break;

                    case GREEN:
                        System.out.println("GREEN");
                        break;

        }
    }
}
