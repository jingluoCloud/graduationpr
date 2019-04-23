package pers.qyj.graduationpr.mapper;

import java.util.List;
import pers.qyj.graduationpr.pojo.ShoppingCart;
import pers.qyj.graduationpr.pojo.ShoppingCartExample;

public interface ShoppingCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    int insert(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    int insertSelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    ShoppingCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShoppingCart record);
}