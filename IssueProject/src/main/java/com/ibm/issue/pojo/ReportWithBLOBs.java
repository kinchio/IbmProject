package com.ibm.issue.pojo;

import java.io.Serializable;

public class ReportWithBLOBs extends Report implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column report.solution
     *
     * @mbg.generated
     */
    private String solution;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.content
     *
     * @return the value of report.content
     *
     * @mbg.generated
     */
    
    private String flag;
    
    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	
	
	public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.content
     *
     * @param content the value for report.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column report.solution
     *
     * @return the value of report.solution
     *
     * @mbg.generated
     */
    public String getSolution() {
        return solution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column report.solution
     *
     * @param solution the value for report.solution
     *
     * @mbg.generated
     */
    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", content=").append(content);
        sb.append(", solution=").append(solution);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}