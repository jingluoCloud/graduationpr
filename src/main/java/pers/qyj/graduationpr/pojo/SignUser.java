package pers.qyj.graduationpr.pojo;

public class SignUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_user.sign
     *
     * @mbg.generated
     */
    private String sign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_user.user_lastname
     *
     * @mbg.generated
     */
    private String userLastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_user.user_firstname
     *
     * @mbg.generated
     */
    private String userFirstname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_user.id
     *
     * @return the value of sign_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_user.id
     *
     * @param id the value for sign_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_user.sign
     *
     * @return the value of sign_user.sign
     *
     * @mbg.generated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_user.sign
     *
     * @param sign the value for sign_user.sign
     *
     * @mbg.generated
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_user.user_lastname
     *
     * @return the value of sign_user.user_lastname
     *
     * @mbg.generated
     */
    public String getUserLastname() {
        return userLastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_user.user_lastname
     *
     * @param userLastname the value for sign_user.user_lastname
     *
     * @mbg.generated
     */
    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname == null ? null : userLastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_user.user_firstname
     *
     * @return the value of sign_user.user_firstname
     *
     * @mbg.generated
     */
    public String getUserFirstname() {
        return userFirstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_user.user_firstname
     *
     * @param userFirstname the value for sign_user.user_firstname
     *
     * @mbg.generated
     */
    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname == null ? null : userFirstname.trim();
    }
}