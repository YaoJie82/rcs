package com.liguang.rcs.db.dao;

import com.liguang.rcs.db.domain.RcsSysLog;
import com.liguang.rcs.db.domain.RcsSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcsSysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    long countByExample(RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int deleteByExample(RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int insert(RcsSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int insertSelective(RcsSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    RcsSysLog selectOneByExample(RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    RcsSysLog selectOneByExampleSelective(@Param("example") RcsSysLogExample example, @Param("selective") RcsSysLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<RcsSysLog> selectByExampleSelective(@Param("example") RcsSysLogExample example, @Param("selective") RcsSysLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    List<RcsSysLog> selectByExample(RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    RcsSysLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") RcsSysLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    RcsSysLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    RcsSysLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RcsSysLog record, @Param("example") RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RcsSysLog record, @Param("example") RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RcsSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RcsSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") RcsSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rcs_sys_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}