package svm.persistence.abstraction.dao;

/**
 * ProjectTeam: Team C
 * Date: 28.10.12
 */
public enum FindQualifiers {
    LIKE("like"),
    EQUALS("="),
    GREATER(">"),
    GREATER_EQUALS(">="),
    SMALLER("<"),
    SMALLER_EQUALS("<="),
    NOT_EQUALS("!=");

    /**
     * @param text
     */
    private FindQualifiers(final String text) {
        this.text = text;
    }

    private final String text;

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
