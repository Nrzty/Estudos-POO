package model;

public abstract class Material
{
    private final String titulo;
    private final String autor;

    protected Material(String titulo, String autor)
    {
        if (titulo == null || titulo.isBlank())
        {
            throw new IllegalStateException("Não pode existir livro com título vazio ou nulo!");
        }

        if (autor == null || autor.isBlank())
        {
            throw new IllegalStateException("Não pode existir autor com nome vazio ou nulo!");
        }

        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String getDescricao();
}
