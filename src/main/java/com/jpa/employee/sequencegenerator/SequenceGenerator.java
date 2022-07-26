package com.jpa.employee.sequencegenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SequenceGenerator implements IdentifierGenerator {
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "EMP";
		String suffix = "";
		try {
			Connection connection = session.connection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select empid_seq.nextval from dual");
			if (resultSet.next()) {
				Integer seqval = resultSet.getInt(1);
				suffix = String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}}

	