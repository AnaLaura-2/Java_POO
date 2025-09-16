package exe_biblioteca_prof;

public class LoanItem {
    private int id;
    private Book book;
    private int days;

    // Construtor vazio
    public LoanItem() {
    }

    // Construtor completo *agregação: livro pode vir pornto, não vamos cria-lo.
    public LoanItem(int id, Book book, int days) {
        this.id = id;
        this.book = book;
        //se fosse seria = new.book(parametros para criar)
        this.days = days;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    // toString
    @Override
    public String toString() {
        return "LoanItem{" +
                "id=" + id +
                ", book=" + book +
                ", days=" + days +
                '}';
    }
}
