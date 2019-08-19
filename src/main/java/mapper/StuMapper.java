package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Stu;

@Repository
public interface StuMapper {

//	@Insert("insert into user_login (uphone,upassword) values (#{uphone},#{upassword})")
//	public int addUserlogin(Userlogin userlogin);

	@Update("update stu set stu_pwd=#{stu_pwd} where stu_id=#{stu_id}")
	public int updateStulogin(int stu_id,String stu_pwd);

	@Select("select * from stu where stu_id=#{stu_id} and stu_pwd=#{stu_pwd}")
	public Stu getStulogin(int stu_id, String stu_pwd);
	
	@Select("select * from stu where stu_id=#{stu_id}")
	public Stu getStuById(int stu_id);

	@Insert("insert into stu (stu_id,stu_name,stu_major,stu_pwd,stu_class,stu_grade) values (#{stu_id},#{stu_name},#{stu_major},#{stu_pwd},#{stu_class},#{stu_grade})")
	public int addStu(Stu stu);

}
