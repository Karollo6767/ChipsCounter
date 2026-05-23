package org.example;

public interface ChipsCounter {

    int chips = 20;

    public void add();
    public void subtract();

    public void setChips(int chips);
    public int getChips();

    public void showStartNumberOfChips();
    public void showAddedCount();
    public void showSubtractedCount();
}