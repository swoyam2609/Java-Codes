package ApnaCollegeCourse.L13StringBuilder;

public class code2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append
        stringBuilder.append(" World");

        // Insert
        stringBuilder.insert(5, " Awesome");

        // Delete
        stringBuilder.delete(11, 17);

        // Reverse
        stringBuilder.reverse();

        //Relacing
        stringBuilder.replace(6, 11, "Universe");

        System.out.println(stringBuilder.toString());

    }
}
