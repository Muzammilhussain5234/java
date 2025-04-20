public class stbuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("rousten chase");
        sb.setCharAt(4, 'c');
        System.out.println(sb);
        sb.insert(2,'4' );
        System.out.println(sb);
        sb.delete(2, 6);
        System.out.println(sb);
        sb.append("  4th of july");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}