package svm.persistence.abstraction.dao;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public class CompareObject {

    private FindQualifiers qualifier;
    private String column;
    private String value;
    private String before;

    public FindQualifiers getQualifier() {
        return qualifier;
    }

    public String getColumn() {
        return column;
    }


    public String getValue() {
        return value;
    }

    public String getBefore() {
        return before;
    }

    /**
     * @param column    PropertyName
     * @param qualifier LogicalOperator
     * @param value     ReferenceValue
     */
    public CompareObject(String column, FindQualifiers qualifier, String value) {
        this.column = column;
        this.qualifier = qualifier;
        this.value = value;
        this.before = "AND";
    }

    /**
     * @param before    BeforeString
     * @param column    PropertyName
     * @param qualifier LogicalOperator
     * @param value     ReferenceValue
     */
    public CompareObject(String before, String column, FindQualifiers qualifier, String value) {
        this.column = column;
        this.qualifier = qualifier;
        this.value = value;
        this.before = before;
    }
}
