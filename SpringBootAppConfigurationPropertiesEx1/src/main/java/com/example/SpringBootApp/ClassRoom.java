package com.example.SpringBootApp;

public class ClassRoom {
	
	private int roomNo;
	
	private String teacherName;
	
	private String strengths;

	public ClassRoom() {
		super();
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getStrengths() {
		return strengths;
	}

	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}

	@Override
	public String toString() {
		return "ClassRoom [roomNo=" + roomNo + ", teacherName=" + teacherName + ", strengths=" + strengths + "]";
	}
	
	

}
