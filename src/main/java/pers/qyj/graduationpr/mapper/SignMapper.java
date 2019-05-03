package pers.qyj.graduationpr.mapper;

import java.util.List;
import pers.qyj.graduationpr.pojo.Sign;
import pers.qyj.graduationpr.pojo.SignExample;

public interface SignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    int insert(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    int insertSelective(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    List<Sign> selectByExample(SignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    Sign selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table signs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sign record);
}