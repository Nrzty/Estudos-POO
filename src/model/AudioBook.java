package model;

public class AudioBook extends Material
{
    private int duracaoEmMinutos;

    public AudioBook(String autor, String titulo, int duracaoEmMinutos)
    {
        super(titulo, autor);
        setDuracaoEmMinutos(duracaoEmMinutos);
    }

    public int getDuracaoEmMinutos()
    {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        if (duracaoEmMinutos <= 0)
        {
            throw new IllegalArgumentException("Não pode existir livro com número de páginas menor ou igual a zero");
        }

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String getDescricao() {
        return "model.AudioBook: " + getTitulo() + " - " + getAutor() + " (" + getDuracaoEmMinutos() + " min)";
    }
}
