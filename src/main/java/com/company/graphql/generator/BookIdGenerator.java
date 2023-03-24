package com.company.graphql.generator;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;

@SuppressWarnings("deprecation")
public class BookIdGenerator implements IdentifierGenerator, Configurable {

	private static Long ID = 0L;

	private String getBookId() {
		final String bookId = "BW-BK-1706" + ID++;
		return bookId;
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return this.getBookId();
	}

}
