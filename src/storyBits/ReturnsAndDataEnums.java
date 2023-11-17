package storyBits;

public enum ReturnsAndDataEnums {
    STORY_PROMPT(2),
    ENDING(3),
    STORY_CHOICE(3),
    COMBAT_PROMPT(5), // IT MAY BE 6 IF LEVEL IS SPECIFIED!
    MINMAL_CONF_LINES(2),
    FULL_CONF_LINES(15);
    public final int val;
    ReturnsAndDataEnums(int val) {
        this.val = val;
    }
}