package hw_seminar_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{
    private Hero hero;
    private List<T> teamHero = new ArrayList<>();

    public Team(Hero hero) {
        this.hero = hero;
    }

    public Team(List<T> teamHero) {
        this.teamHero = teamHero;
    }

    public void addHero(T pers) {
        teamHero.add(pers);
    }

    @Override
    public Iterator<T> iterator() {
        return teamHero.iterator();
    }

    @Override
    public String toString() {
        return "Team " + hero.getName() + "'s - " +
                hero + "\n" +
                "team:" + "\n" + teamHero;
    }

    public Integer getTeamHp() {
        int teamHp = hero.getHealthPoint();
        for (T member: this) {
            teamHp += member.getHealthPoint();
        }
        return teamHp;
    }

}
