import model.AudioBook;
import model.Livro;
import model.Revista;
import service.Biblioteca;

void main()
{
    Biblioteca biblioteca = new Biblioteca();

    System.out.println("--------------------------------------------------------");

    Livro livro = new Livro("Machado de Assis", "Dom Casmurro", 312);
    Revista revista = new Revista("Vários Autores", "National Geographic", 42);
    AudioBook audioBook = new AudioBook("Tolkien", "O Hobbit", 320);

    biblioteca.adicionar(livro);
    biblioteca.adicionar(revista);
    biblioteca.adicionar(audioBook);

    biblioteca.listarTodos();

    System.out.println("--------------------------------------------------------");

    biblioteca.buscar("Dom Casmurro");

    System.out.println("--------------------------------------------------------");

    biblioteca.notificarTodos("disponível para retirada");

    System.out.println("--------------------------------------------------------");

    System.out.println("Quantidade de materiais: " + biblioteca.contarMateriais());

    System.out.println("--------------------------------------------------------");

    biblioteca.listarPorTipo(Revista.class);
}
