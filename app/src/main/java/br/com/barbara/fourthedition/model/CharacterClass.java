package br.com.barbara.fourthedition.model;

/**
 * Created by Estevan on 08/12/2017.
 */

public class CharacterClass {
    private final Role role;
    private final PowerSource powerSource;

    public CharacterClass(Role role, PowerSource powerSource) {
        this.role = role;
        this.powerSource = powerSource;
    }

    public Role getRole() {
        return role;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }
}
