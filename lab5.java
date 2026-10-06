enum Branch {
    BTCE,
    BEIS,
    BTRE,
    BTEE
}

public class lab5 {
    public static void main(String[] args) {
        Branch myBranch = Branch.BTCE;
        System.out.println("My branch is: " + myBranch);

        switch (myBranch) {
            case BTCE:
                System.out.println("Branch: BTCE - Computer Engineering.");
                break;
            case BEIS:
                System.out.println("Branch: BEIS - Information Science.");
                break;
            case BTRE:
                System.out.println("Branch: BTRE - Renewable Energy.");
                break;
            case BTEE:
                System.out.println("Branch: BTEE - Electrical Engineering.");
                break;
        }
    }
}