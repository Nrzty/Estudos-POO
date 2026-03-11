package service;

import interfaces.Buscavel;
import interfaces.Notificavel;
import model.Material;

import java.util.ArrayList;

public class Biblioteca
{
    private final ArrayList<Material> materiais = new ArrayList<>();

    public void adicionar(Material material)
    {
        if (material == null)
        {
            throw new IllegalStateException("O material não pode ser nulo!");
        }

        materiais.add(material);
    }

    public void listarTodos()
    {
        for (Material material : materiais)
        {
            System.out.println(material.getDescricao());
        }
    }

    public boolean buscar(String termo)
    {
        for (Material material : materiais)
        {
            if (material instanceof Buscavel buscavel)
            {
                if (buscavel.contemTermo(termo))
                {
                    System.out.println(material.getDescricao());
                }
            }
        }

        return false;
    }

    public void notificarTodos(String mensagem)
    {
        for (Material material : materiais)
        {
            if (material instanceof Notificavel notificavel)
            {
                notificavel.notificar(mensagem);
            }
        }
    }
}
