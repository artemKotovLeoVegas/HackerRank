package com.project;

import com.project.internal.Player;

import java.util.Comparator;

public class SortingComparator implements Comparator<Player> {
    public int compare(Player a, Player b) {
        int result = Integer.compare(b.score, a.score);
        if (result != 0) {
            return result;
        }
        return a.name.compareTo(b.name);
    }
}
