package sample.backend.persistence.database.postgresql.table;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DbOperatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    long countByExample(DbOperatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int deleteByExample(DbOperatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer operatorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int insert(DbOperator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int insertSelective(DbOperator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    List<DbOperator> selectByExample(DbOperatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    DbOperator selectByPrimaryKey(Integer operatorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DbOperator record, @Param("example") DbOperatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DbOperator record, @Param("example") DbOperatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DbOperator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operator
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbOperator record);
}