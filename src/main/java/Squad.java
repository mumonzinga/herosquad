package main.java;

import java.util.ArrayList;
import java.util.List;
public class Squad {
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<main.java.Hero> mHeroes;

    public Squad(String name, int size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<main.java.Hero>();
    }

    public String getName() {
        return mName;
    }

    public int getSize() {
        return mSize;
    }

    public String getCause() {
        return mCause;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return mId;
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    public List<main.java.Hero> getHeroes() {
        return mHeroes;
    }

    public void addHero(main.java.Hero hero) {
        mHeroes.add(hero);
    }

    public static boolean heroAlreadyExists(main.java.Hero newHero) {
        boolean exists = false;
        for (Squad squad : instances) {
            for (main.java.Hero hero : squad.getHeroes()) {
                if (hero.getName().equals(newHero.getName())) {
                    exists = true;
                }
            }
        }
        return exists;
    }
}
