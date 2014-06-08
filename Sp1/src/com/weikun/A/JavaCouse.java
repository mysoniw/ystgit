package com.weikun.A;

public class JavaCouse implements ITrade {
	private ITeach teacher;
	
	public void setTeacher(ITeach teacher) {
		this.teacher = teacher;
	}

	@Override
	public void javaCourse() {
		// TODO Auto-generated method stub
		this.teacher.teacher("Spring");
	}

}
