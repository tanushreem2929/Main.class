class Box {
    int length;
    int breadth;
    int width;

    // Default constructor
    Box() {
        length = breadth = width = 0;
        System.out.println("Default Constructor is called");
    }

    // Constructor with one parameter
    Box(int x) {
        length = breadth = width = x;
        System.out.println("Constructor with one parameter is called");
    }

    // Constructor with two parameters
    Box(int x, int y) {
        length = breadth = x;
        width = y;
        System.out.println("Constructor with two parameters is called");
    }

    // Constructor with three parameters
    Box(int x, int y, int z) {
        length = x;
        breadth = y;
        width = z;
        System.out.println("Constructor with three parameters is called");
    }
}

class main {
    public static void main(String[] args) {

        System.out.println("Hello");

        Box b1 = new Box();
        Box b2 = new Box(3);
        Box b3 = new Box(4, 5);
        Box b4 = new Box(5, 6, 8);
    }
}