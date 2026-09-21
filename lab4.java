enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class lab4 {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY:
                System.out.println("It is the first working day.");
                break;
            case TUESDAY:
                System.out.println("It is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("It is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("It is Thursday.");
                break;
            case FRIDAY:
                System.out.println("It is Friday.");
                break;
            case SATURDAY:
                System.out.println("It is Saturday.");
                break;
            case SUNDAY:
                System.out.println("It is Sunday.");
                break;
        }
    }
}