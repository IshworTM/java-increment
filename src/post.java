package increment_type.src;
public class post {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("X before increment: "+x);
        int y = x++;
        System.out.println("X after increment: "+x);
        System.out.println("Y after increment: "+y);
    }
}
