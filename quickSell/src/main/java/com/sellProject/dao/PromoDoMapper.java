package com.sellProject.dao;

import com.sellProject.dataobject.PromoDo;

public interface PromoDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    int insert(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    int insertSelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    PromoDo selectByPrimaryKey(Integer id);



    PromoDo selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    int updateByPrimaryKeySelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Oct 23 23:41:21 CST 2019
     */
    int updateByPrimaryKey(PromoDo record);
}