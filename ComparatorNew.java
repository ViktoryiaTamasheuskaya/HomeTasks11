package Task;
import java.util.Comparator;

public class ComparatorNew implements Comparator<Books> {

    @Override
    public int compare(Books first, Books second) {
        double firstPrice = first.getPrice();
        double secondPrice = second.getPrice();

        int firstYearPublished = first.getYear();
        int secondYearPublished = second.getYear();

        if(firstPrice < secondPrice) {
            return -1;

        } else if (firstPrice > secondPrice) {
            return 1;
        } else {

            if (firstYearPublished < secondYearPublished) {
                return -1;
            } else if (firstYearPublished > secondYearPublished) {
                return 1;
            } else {
                return 0;
            }

        }

    }

}
