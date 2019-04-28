package pers.qyj.graduationpr.pojo;

import java.util.Date;

public class ResourceSign {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.sign
     *
     * @mbg.generated
     */
    private String sign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.osign
     *
     * @mbg.generated
     */
    private String osign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.reid
     *
     * @mbg.generated
     */
    private Integer reid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.arrival_date
     *
     * @mbg.generated
     */
    private Date arrivalDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.depature_date
     *
     * @mbg.generated
     */
    private Date depatureDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_sign.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.sign
     *
     * @return the value of resource_sign.sign
     *
     * @mbg.generated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.sign
     *
     * @param sign the value for resource_sign.sign
     *
     * @mbg.generated
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.osign
     *
     * @return the value of resource_sign.osign
     *
     * @mbg.generated
     */
    public String getOsign() {
        return osign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.osign
     *
     * @param osign the value for resource_sign.osign
     *
     * @mbg.generated
     */
    public void setOsign(String osign) {
        this.osign = osign == null ? null : osign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.reid
     *
     * @return the value of resource_sign.reid
     *
     * @mbg.generated
     */
    public Integer getReid() {
        return reid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.reid
     *
     * @param reid the value for resource_sign.reid
     *
     * @mbg.generated
     */
    public void setReid(Integer reid) {
        this.reid = reid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.arrival_date
     *
     * @return the value of resource_sign.arrival_date
     *
     * @mbg.generated
     */
    public Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.arrival_date
     *
     * @param arrivalDate the value for resource_sign.arrival_date
     *
     * @mbg.generated
     */
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.depature_date
     *
     * @return the value of resource_sign.depature_date
     *
     * @mbg.generated
     */
    public Date getDepatureDate() {
        return depatureDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.depature_date
     *
     * @param depatureDate the value for resource_sign.depature_date
     *
     * @mbg.generated
     */
    public void setDepatureDate(Date depatureDate) {
        this.depatureDate = depatureDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_sign.status
     *
     * @return the value of resource_sign.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_sign.status
     *
     * @param status the value for resource_sign.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}