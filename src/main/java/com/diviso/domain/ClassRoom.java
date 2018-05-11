package com.diviso.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ClassRoom {

	private List<Object> studentsList;
	private Set<Object> studentsSet;
	@Override
	public String toString() {
		return "ClassRoom [studentsList=" + studentsList + ", \nstudentsSet=" + studentsSet + ",\n studentsMap="
				+ studentsMap + ", \nprops=" + props + "]";
	}
	private Map<Long, Object> studentsMap;
	private Properties props;
	public List<Object> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Object> studentsList) {
		this.studentsList = studentsList;
	}
	public Set<Object> getStudentsSet() {
		return studentsSet;
	}
	public void setStudentsSet(Set<Object> studentsSet) {
		this.studentsSet = studentsSet;
	}
	public Map<Long, Object> getStudentsMap() {
		return studentsMap;
	}
	public void setStudentsMap(Map<Long, Object> studentsMap) {
		this.studentsMap = studentsMap;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}}
