package br.com.usp.willianerodrigues.course.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.usp.willianerodrigues.course.model.Usuario;

public class DbController implements DbMethods {

    private DbCore dbCore;
    private SQLiteDatabase db;

    public DbController(Context context) {
        dbCore = new DbCore(context);
    }

    @Override
    public void addUser(Usuario usuario) {
        db = dbCore.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", "" + usuario.getNome());
        values.put("sobrenome", "" + usuario.getSobrenome());
        values.put("username", "" + usuario.getUsername());
        values.put("senha", "" + usuario.getSenha());
        values.put("status", "" + String.valueOf(usuario.isStatus()));

        db.insert("usuario", null, values);

        db.close();
    }

    @Override
    public void updateUser(Usuario usuario) {
        db = dbCore.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", "" + usuario.getNome());
        values.put("sobrenome", "" + usuario.getSobrenome());
        values.put("username", "" + usuario.getUsername());
        values.put("senha", "" + usuario.getSenha());
        values.put("status", "" + String.valueOf(usuario.isStatus()));

        db.update("usuario", values, "_id = ?", new String[]{"" + usuario.getId()});

        db.close();
    }

    @Override
    public Usuario buscarUsuarioPor(String coluna, String valor) {
        db = dbCore.getReadableDatabase();

        Usuario user = null;
        String[] coluns = new String[]{"_id", "nome", "sobrenome", "usuario", "senha", "status"};
        Cursor cursor = db.query("usuario", coluns, coluna + "= ?", new String[]{"" + valor}, null, null, null, "1");

        if (cursor.getCount() == 1) {
            cursor.moveToFirst();
            user = new Usuario();
            user.setId(cursor.getInt(0));
            user.setNome(cursor.getString(1));
            user.setSobrenome(cursor.getString(2));
            user.setUsername(cursor.getString(3));
            user.setSenha(cursor.getString(4));
            user.setStatus(Boolean.parseBoolean(cursor.getString(5)));
        }

        cursor.close();
        return user;
    }

    @Override
    public Usuario buscarUsuarioAtivo() {
        db = dbCore.getReadableDatabase();

        Usuario user = null;
        String[] coluns = new String[]{"_id", "nome", "sobrenome", "usuario", "senha", "status"};
        Cursor cursor = db.query("usuario", coluns, "status = ?", new String[]{"" + true}, null, null, null, "1");

        if (cursor.getCount() == 1) {
            cursor.moveToFirst();
            user = new Usuario();
            user.setId(cursor.getInt(0));
            user.setNome(cursor.getString(1));
            user.setSobrenome(cursor.getString(2));
            user.setUsername(cursor.getString(3));
            user.setSenha(cursor.getString(4));
            user.setStatus(Boolean.parseBoolean(cursor.getString(5)));
        }

        cursor.close();
        return user;
    }
}
