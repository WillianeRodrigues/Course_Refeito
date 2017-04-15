package br.com.usp.willianerodrigues.course.database;

import br.com.usp.willianerodrigues.course.model.Usuario;

interface DbMethods {

    void addUser(Usuario usuario);

    void updateUser(Usuario usuario);

    Usuario buscarUsuarioPor(String coluna, String valor);

    Usuario buscarUsuarioAtivo();

}
