package board;

import board.card.CardStack;
import board.card.ChanceStack;
import board.card.ChestStack;
import board.cell.*;

public class Board {
    private ChanceStack chanceCards = new ChanceStack();
    private ChestStack chestCards = new ChestStack();

    private Cell[] cells;

    Board() {
        cells = new Cell[]{
                new CornerCell("Go"),
                new Property("Vine Street", 0, ColorGroup.BROWN),
                new Chest("Vine Street"),
                new Property("Coventry Street", 0, ColorGroup.BROWN),
                new Tax("Income Tax", 100),
                new Station("Marylebone Station", 0),
                new Property("Leicester square", 0, ColorGroup.BLUE_LIGHT),
                new Chance("Chance"),
                new Property("Bow street", 0, ColorGroup.BLUE_LIGHT),
                new Property("Whitechapel road", 0, ColorGroup.BLUE_LIGHT),
                new CornerCell("Jail"),
                new Property("The angel islington", 0, ColorGroup.PINK),
                new Utility("Electric Company", 0),
                new Property("Trafalgar square", 0, ColorGroup.PINK),
                new Property("Northumrld avenue", 0, ColorGroup.PINK),
                new Station("Fenchurch st. station", 0),
                new Property("M'orough street", 0, ColorGroup.ORANGE),
                new Chest("Community Chest"),
                new Property("Fleet street", 0, ColorGroup.ORANGE),
                new Property("Old kent road", 0, ColorGroup.ORANGE),
                new CornerCell("Free Parking"),
                new Property("Whiteall", 0, ColorGroup.RED),
                new Chance("Chance"),
                new Property("Pentonville road", 0, ColorGroup.RED),
                new Property("Pall Mall", 0, ColorGroup.RED),
                new Station("Kings cross station", 0),
                new Property("BOND STREET", 0, ColorGroup.YELLOW),
                new Property("STRAND", 0, ColorGroup.YELLOW),
                new Utility("Water works", 0),
                new Property("Regent street", 0, ColorGroup.YELLOW),
                new CornerCell("go to jail"),
                new Property("Euston road", 0, ColorGroup.GREEN),
                new Property("Piccadilly", 0, ColorGroup.GREEN),
                new Chest("Community Chest"),
                new Property("Oxford Street", 0, ColorGroup.GREEN),
                new Station("Liverpool st. station", 0),
                new Chance("Chance"),
                new Property("Park lane", 0, ColorGroup.BLUE_DARK),
                new Tax("Super tax", 0),
                new Property("Mayfair", 0, ColorGroup.BLUE_DARK),
        };
    }
}
