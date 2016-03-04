package cvdtc.dongle.dao;

import java.util.Collection;
import java.util.List;

import mobi.chouette.dao.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	protected Class<T> type;

	public GenericDAOImpl(Class<T> type) {
		this.type = type;
	}

	public T find(final Object id) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public List<T> find(final String hql, final List<Object> values) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public List<T> findAll(final Collection<Long> ids) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public List<T> findAll() {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public T findByObjectId(final String objectId) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public List<T> findByObjectId(final Collection<String> objectIds) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void create(final T entity) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public T update(final T entity) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void delete(final T entity) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void detach(final T entity) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public int deleteAll() {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public int truncate() {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void evictAll() {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void flush() {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void detach(Collection<?> list) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void copy(String value) {
		throw new UnsupportedOperationException("unimplemented method");
	}

	public void deleteChildren(List<String> list) {
		throw new UnsupportedOperationException("unimplemented method");
	}
	
	public void clear() {
		throw new UnsupportedOperationException("unimplemented method");
	}
}
