package com.company;

public class CocheCRUDImpl implements CocheCRUD{

    public void save(){
        System.out.println("Metodo save");
    }

    public void findAll(){
        System.out.println("Metodo findAll");
    }

    public void delete(){
        System.out.println("Metodo delete");
    }

    String save = "Guardar";
    String findAll = "Buscar";
    String delete = "Borrar";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
