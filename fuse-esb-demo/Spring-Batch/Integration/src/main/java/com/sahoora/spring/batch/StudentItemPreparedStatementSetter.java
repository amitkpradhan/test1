package com.sahoora.spring.batch;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.sahoora.spring.batch.model.Student;

public class StudentItemPreparedStatementSetter implements ItemPreparedStatementSetter<Student> {

	@Override
	public void setValues(Student student, PreparedStatement ps) throws SQLException {
		ps.setString(1, student.getStudentName());
        ps.setDate(2, new java.sql.Date(student.getDob().toDate().getTime()));
        ps.setDouble(3, student.getPercentage());
	}
}
