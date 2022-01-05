package DeitelExercises;

public class BookshopTest {
    public static void main(String[] args) {

        for (BookShop bookShop: BookShop.values()){
            System.out.printf("%s%n%s%n", bookShop, bookShop.getTitle(), bookShop.getCopyrightYear());
        }
    }
}
