package exe_biblioteca;

public class MainLibrary {
    public static void main(String[] args) {
        Book obj1 = new Book("X", "Anne", 2010);
        Book obj2= new Book("Y", "Louis", 2021);
        Book obj3 = new Book("Z", "Sheldon", 1930);

        LibraryUser objLibraryUser = new LibraryUser("Ana");

        objLibraryUser.addLoan(obj1, 5);
        objLibraryUser.addLoan(obj2, 7);
        objLibraryUser.addLoan(obj3, 2);

        objLibraryUser.listBooks();

        System.out.println(objLibraryUser.toString());

        objLibraryUser.totalDaysBorrowed();

        objLibraryUser.removeLoanBookTitle("Z");
        System.out.println(objLibraryUser.toString());

        objLibraryUser.totalDaysBorrowed();

        objLibraryUser.clearLoans();

        objLibraryUser.isEmpty();
    }
}
