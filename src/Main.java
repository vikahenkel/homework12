public class Main {
    public static void main(String[] args) {
        Author günzburg = new Author("Susanne", "Günzburg");
        Author michel = new Author("Alexandra", "Michel");

        Book amore = new Book("Amore", 2016, günzburg);
        Book dance = new Book("Dance", 1998, michel);

        System.out.println(amore.getTitle()+ " " + amore.getYearOfPublication()+ " " + amore.getAuthor().getName()+ " "+ amore.getAuthor().getSurname()+ " ");
        System.out.println(dance.getTitle()+ " " + dance.getYearOfPublication()+ " " + dance.getAuthor().getName()+ " "+ dance.getAuthor().getSurname() + " ");

        amore.setYearOfPublication(2018);

        System.out.println("amore.getYearOfPublication() = " + amore.getYearOfPublication());
    }
}