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
        materiais.stream()
                 .map(Material::getDescricao)
                 .forEach(System.out::println);
    }

    public void buscar(String termo)
    {
        materiais.stream()
                 .filter(material -> material instanceof Buscavel buscavel && buscavel.contemTermo(termo))
                 .forEach(material -> System.out.println(material.getDescricao()));
    }

    public long contarMateriais()
    {
        return materiais.stream().count();
    }

    public void listarPorTipo(Class<?> tipo)
    {
        materiais.stream()
                 .filter(tipos -> tipos.getClass().equals(tipo))
                 .forEach(material -> System.out.println(material.getDescricao()));
    }

    public void notificarTodos(String mensagem)
    {
        materiais.stream()
                .filter(Notificavel.class::isInstance)
                .map(Notificavel.class::cast)
                .forEach(notificavel -> notificavel.notificar(mensagem));
    }
}
