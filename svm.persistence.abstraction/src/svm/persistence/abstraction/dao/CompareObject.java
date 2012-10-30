package svm.persistence.abstraction.dao;

/**
 * ProjectTeam: Team C
 * Date: 30.10.12
 */
public class CompareObject {

    private FindQualifiers qualifier;
    private String column;
    private String value;

    public FindQualifiers getQualifier() {
        return qualifier;
    }

    public String getColumn() {
        return column;
    }


    public String getValue() {
        return value;
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
    }
}
