package br.com.usp.willianerodrigues.course.database;

import java.util.ArrayList;
import java.util.List;

class DbCode {

    List<String> createTables() {

        List<String> tables = new ArrayList<>();

        tables.add("usuario (_id integer primary key autoincrement," +
                "nome varchar, sobrenome varchar, usuario varchar(20) not null, senha varchar(16) not null," +
                "status varchar(5) not null)");

        tables.add("ranking (_id integer primary key autoincrement," +
                "idUser integer, conteudo integer, pontuacao integer," +
                "FOREIGN KEY(idUser) REFERENCES usuario(_id))");

        tables.add("pergunta (_id integer primary key," +
                "conteudo vachar, tipo varchar," +
                "title varchar, subtitle varchar)");

        tables.add("alternativas (_id integer primary key autoincrement," +
                "idPergunta integer, texto varchar, resposta varchar(5)," +
                "FOREIGN KEY(idPergunta) REFERENCES pergunta(_id))");

        return tables;

    }

}
