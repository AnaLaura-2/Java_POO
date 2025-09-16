package exe_biblioteca;

public class LoanItem {
    private Book book;
    private int days;

    public LoanItem() {
    }

    public LoanItem(Book book, int days) {
        this.book = book;
        this.days = days;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "\nLoanItem{" +
                "book=" + book +
                ", days=" + days +
                '}';
    }
}
