package exe_biblioteca_prof;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private int id;
    private String name;
    private List<LoanItem> loans;

      public LibraryUser() {
       this.loans = new ArrayList<LoanItem>();
    }

    //construtor
    public LibraryUser(int id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<LoanItem>();
    }

    //Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LoanItem> getLoans() {
        return loans;
    }
    public void addLoanItem(int id, int days, Book book){
          if (this.loans.size() < 5) {
              this.loans.add(new LoanItem(id, book, days));
              System.out.println("livro Emprestado com Sucesso");
          }
    }

    //Remover item
    public void removeLoanItem(int id) {
        //percorrer o vetor
        boolean removeu = false;
        for (LoanItem loans : loans) {
            if (loans.getId() == id) { //achou para remoção
                this.loans.remove(loans);
                removeu = true;
                System.out.println("O livro emrpestado foi removido com sucesso.");
                break; // para de percorreu
            }
        }
        if (!removeu) {
            System.out.println("Item não existe.");
        }
    }

    // Remover todos itens
    public void clearLoan(){
          this.loans.clear();
          System.out.println("Todos itens removidos.");
    }

    //Quanto não tem elemento no vetor
    public boolean isEmpty(){
          return this.loans.isEmpty();
    }

    //calcular número de dias
    public int totalBorrowed(){
          int soma = 0;
          for(LoanItem loans: this.loans){
              soma += loans.getDays();
          }
          return soma;
    }

    //toString
    @Override
    public String toString() {
        return "LibraryUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }

    public void ListBooks(){
         for(LoanItem loans: this.loans){
            System.out.println(loans.getBook().getTitle());
          }
    }
}



