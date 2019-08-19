package beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Stu {

	private int stu_id; // 图书ISBN编号
	private String stu_name; // 图书名称
	private String stu_pwd; // 图书出版社
	private int stu_grade; // 图书价格
	private int stu_class; // 图书简介
	private String stu_major; // 图书作者
	//private List<Bookphoto> photolist; // 图片列表

	
	
	public Stu() {
		
	}

	public Stu(int stu_id, String stu_name, String stu_pwd, int stu_grade, int stu_class, String stu_major) {
		//super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_pwd = stu_pwd;
		this.stu_grade = stu_grade;
		this.stu_class = stu_class;
		this.stu_major = stu_major;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_pwd() {
		return stu_pwd;
	}

	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}

	public int getStu_grade() {
		return stu_grade;
	}

	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}

	public int getStu_class() {
		return stu_class;
	}

	public void setStu_class(int stu_class) {
		this.stu_class = stu_class;
	}

	public String getStu_major() {
		return stu_major;
	}

	public void setStu_major(String stu_major) {
		this.stu_major = stu_major;
	}

	

}
