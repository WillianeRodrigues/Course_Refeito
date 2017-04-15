package br.com.usp.willianerodrigues.course;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import br.com.usp.willianerodrigues.course.model.ItemMenuMain;
import br.com.usp.willianerodrigues.course.model.Usuario;

public class CourseApplication extends Application {

    private Usuario usuario;

    //private DbController controller;
    private List<ItemMenuMain> itemMenuMain;

    @Override
    public void onCreate() {
        super.onCreate();
        //controller = new DbController(getBaseContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuario = usuario;
    }

    public void atualizarUsuario(Usuario usuario) {
        usuario = usuario;
    }

    public Usuario buscarUsername(String username) {
        return usuario;
    }

    public Usuario buscarUserActive() {
        return null;
    }

    public List<ItemMenuMain> getItemMenuMain() {
        List<ItemMenuMain> itemMenuMains = new ArrayList<>();
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_pc, R.drawable.ico_pc_disable, getResources().getString(R.string.know_computer), true));
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_windows, R.drawable.ico_windows_disable, getResources().getString(R.string.operational_systems), false));
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_notepad, R.drawable.ico_notepad_disable, getResources().getString(R.string.text_editors), false));
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_sheet, R.drawable.ico_sheet_disable, getResources().getString(R.string.sheet_editors), false));
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_presentation, R.drawable.ico_presentation_disable, getResources().getString(R.string.publishers_presentations), false));
        itemMenuMains.add(new ItemMenuMain(R.drawable.ico_web, R.drawable.ico_web_disable, getResources().getString(R.string.internet), false));
        return itemMenuMains;
    }
}
