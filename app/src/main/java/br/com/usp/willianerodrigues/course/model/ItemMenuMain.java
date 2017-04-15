package br.com.usp.willianerodrigues.course.model;

public class ItemMenuMain {

    private int drawable_enable;
    private int drawable_disable;
    private String nome;
    private boolean level_open;

    public ItemMenuMain(int drawable_enable, int drawable_disable, String nome, boolean level_open) {
        this.drawable_enable = drawable_enable;
        this.drawable_disable = drawable_disable;
        this.nome = nome;
        this.level_open = level_open;
    }

    public int getDrawable_enable() {
        return drawable_enable;
    }

    public void setDrawable_enable(int drawable_enable) {
        this.drawable_enable = drawable_enable;
    }

    public int getDrawable_disable() {
        return drawable_disable;
    }

    public void setDrawable_disable(int drawable_disable) {
        this.drawable_disable = drawable_disable;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLevel_open() {
        return level_open;
    }

    public void setLevel_open(boolean level_open) {
        this.level_open = level_open;
    }
}
