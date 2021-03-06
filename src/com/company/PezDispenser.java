package com.company;

public class PezDispenser {

    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;

    public PezDispenser(String characterName){
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill(){
        addPez(MAX_PEZ);
    }

    public void addPez(int pezAmount){
        int newAmount = pezCount + pezAmount;
        if(newAmount > MAX_PEZ){
            throw new IllegalArgumentException(
                    "TOO MANY PEZ!!! CUT THE SH*T!!!"
            );
        } else {
            pezCount = newAmount;
        }
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }

    public String getCharacterName (){
        return characterName;
    }

    public int getPezCount() {
        return pezCount;
    }
}

