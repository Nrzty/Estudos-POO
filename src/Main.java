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

    if (biblioteca.buscar("Dom"))
    {
        System.out.println("Contém o termo");
    }

    System.out.println("--------------------------------------------------------");

    biblioteca.notificarTodos("disponível para retirada");
}
