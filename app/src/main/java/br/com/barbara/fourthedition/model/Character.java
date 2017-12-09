package br.com.barbara.fourthedition.model;

/**
 * Created by Estevan on 08/12/2017.
 */

public class Character {
    private final Race race;
    private final CharacterClass charClass;

    public Character(Race race, CharacterClass charClass) {
        this.race = race;
        this.charClass = charClass;
    }

    public Race getRace() {
        return race;
    }

    public CharacterClass getCharClass() {
        return charClass;
    }
}
