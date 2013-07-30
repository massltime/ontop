package it.unibz.krdb.obda.model.impl;

import it.unibz.krdb.obda.model.OBDAQuery;
import it.unibz.krdb.obda.model.OBDAQueryModifiers;
import it.unibz.krdb.obda.model.OBDASQLQuery;

public class SQLQueryImpl implements OBDAQuery, OBDASQLQuery {

	private static final long serialVersionUID = -1910293716786132196L;
	
	private final String sqlQuery;

	protected SQLQueryImpl(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	@Override
	public String toString() {
		if ((sqlQuery == null) || (sqlQuery.equals(""))) {
			return "";
		}
		return sqlQuery;
	}

	@Override
	public SQLQueryImpl clone() {
		SQLQueryImpl clone = new SQLQueryImpl(new String(sqlQuery));
		return clone;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public OBDAQueryModifiers getQueryModifiers() {
		return new OBDAQueryModifiers();
	}

	@Override
	public void setQueryModifiers(OBDAQueryModifiers modifiers) {
		// NO-OP
	}
}