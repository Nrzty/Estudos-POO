package model;

import interfaces.Buscavel;
import interfaces.Notificavel;

public class Livro extends Material implements Buscavel, Notificavel
{
    private int numeroDePaginas;

    public Livro(String autor, String titulo, int numeroDePaginas)
    {
        super(titulo, autor);
        setNumeroDePaginas(numeroDePaginas);
    }

    public void setNumeroDePaginas(int numeroDePaginas)
    {
        if (numeroDePaginas <= 0)
        {
            throw new IllegalArgumentException("Não pode existir livro com número de páginas menor ou igual a zero");
        }

        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public String getDescricao() {
        return "model.Livro: " + getAutor() + " - " + getTitulo() + " (" + getNumeroDePaginas() + " páginas)";
    }

    @Override
    public boolean contemTermo(String termo) {
        return getDescricao().toLowerCase().contains(termo.toLowerCase());
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[NOTIFICAÇÃO → " + getTitulo() + " livro "+ mensagem);
    }
}
