package model;

import interfaces.Buscavel;

public class Revista extends Material implements Buscavel
{
    private int edicao;

    public Revista(String autor, String titulo, int edicao)
    {
        super(titulo, autor);
        setEdicao(edicao);
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if (edicao <= 0)
        {
            throw new IllegalArgumentException("Edição da revista deve ser maior que zero");
        }

        this.edicao = edicao;
    }

    @Override
    public String getDescricao() {
        return "model.Revista: " + getTitulo() + " - " + getAutor() + " (Edição " + getEdicao() + ")";
    }

    @Override
    public boolean contemTermo(String termo) {
        return getDescricao().toLowerCase().contains(termo.toLowerCase());
    }
}
