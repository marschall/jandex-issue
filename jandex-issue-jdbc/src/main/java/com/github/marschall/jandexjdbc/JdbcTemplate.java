package com.github.marschall.jandexjdbc;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.jdbc.support.JdbcAccessor;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;


@Service
public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {

  @Autowired(required = false)
  private org.springframework.jdbc.core.JdbcTemplate delegate;

  @Autowired
  public JdbcTemplate(DataSource dataSource) {
  }

  @Override
  public void setDataSource(DataSource dataSource) {
    this.delegate.setDataSource(dataSource);
  }

  @Override
  public DataSource getDataSource() {
    return this.delegate.getDataSource();
  }

  @Override
  public void setDatabaseProductName(String dbName) {
    this.delegate.setDatabaseProductName(dbName);
  }

  @Override
  public void setExceptionTranslator(
          SQLExceptionTranslator exceptionTranslator) {
    this.delegate.setExceptionTranslator(exceptionTranslator);
  }

  @Override
  public SQLExceptionTranslator getExceptionTranslator() {
    return this.delegate.getExceptionTranslator();
  }

  @Override
  public void setLazyInit(boolean lazyInit) {
    this.delegate.setLazyInit(lazyInit);
  }

  @Override
  public boolean isLazyInit() {
    return this.delegate.isLazyInit();
  }

  @Override
  public void afterPropertiesSet() {
    this.delegate.afterPropertiesSet();
  }

  public void setIgnoreWarnings(boolean ignoreWarnings) {
    this.delegate.setIgnoreWarnings(ignoreWarnings);
  }

  public boolean isIgnoreWarnings() {
    return this.delegate.isIgnoreWarnings();
  }

  public int getFetchSize() {
    return this.delegate.getFetchSize();
  }

  public void setMaxRows(int maxRows) {
    this.delegate.setMaxRows(maxRows);
  }

  public int getMaxRows() {
    return this.delegate.getMaxRows();
  }

  public void setQueryTimeout(int queryTimeout) {
    this.delegate.setQueryTimeout(queryTimeout);
  }

  public int getQueryTimeout() {
    return this.delegate.getQueryTimeout();
  }

  public void setSkipResultsProcessing(boolean skipResultsProcessing) {
    this.delegate.setSkipResultsProcessing(skipResultsProcessing);
  }

  public boolean isSkipResultsProcessing() {
    return this.delegate.isSkipResultsProcessing();
  }

  public void setSkipUndeclaredResults(boolean skipUndeclaredResults) {
    this.delegate.setSkipUndeclaredResults(skipUndeclaredResults);
  }

  public boolean isSkipUndeclaredResults() {
    return this.delegate.isSkipUndeclaredResults();
  }

  public void setResultsMapCaseInsensitive(boolean resultsMapCaseInsensitive) {
    this.delegate.setResultsMapCaseInsensitive(resultsMapCaseInsensitive);
  }

  public boolean isResultsMapCaseInsensitive() {
    return this.delegate.isResultsMapCaseInsensitive();
  }

  @Override
  public <T> T execute(ConnectionCallback<T> action)
          throws DataAccessException {
    return this.delegate.execute(action);
  }

  @Override
  public <T> T execute(StatementCallback<T> action) throws DataAccessException {
    return this.delegate.execute(action);
  }

  @Override
  public void execute(String sql) throws DataAccessException {
    this.delegate.execute(sql);
  }

  @Override
  public <T> T query(String sql, ResultSetExtractor<T> rse)
          throws DataAccessException {
    return this.delegate.query(sql, rse);
  }

  @Override
  public void query(String sql, RowCallbackHandler rch)
          throws DataAccessException {
    this.delegate.query(sql, rch);
  }

  @Override
  public <T> List<T> query(String sql, RowMapper<T> rowMapper)
          throws DataAccessException {
    return this.delegate.query(sql, rowMapper);
  }

  @Override
  public Map<String, Object> queryForMap(String sql)
          throws DataAccessException {
    return this.delegate.queryForMap(sql);
  }

  @Override
  public <T> T queryForObject(String sql, RowMapper<T> rowMapper)
          throws DataAccessException {
    return this.delegate.queryForObject(sql, rowMapper);
  }

  @Override
  public <T> T queryForObject(String sql, Class<T> requiredType)
          throws DataAccessException {
    return this.delegate.queryForObject(sql, requiredType);
  }

  @Override
  public <T> List<T> queryForList(String sql, Class<T> elementType)
          throws DataAccessException {
    return this.delegate.queryForList(sql, elementType);
  }

  @Override
  public List<Map<String, Object>> queryForList(String sql)
          throws DataAccessException {
    return this.delegate.queryForList(sql);
  }

  @Override
  public SqlRowSet queryForRowSet(String sql) throws DataAccessException {
    return this.delegate.queryForRowSet(sql);
  }

  @Override
  public int update(String sql) throws DataAccessException {
    return this.delegate.update(sql);
  }

  @Override
  public int[] batchUpdate(String... sql) throws DataAccessException {
    return this.delegate.batchUpdate(sql);
  }

  @Override
  public <T> T execute(PreparedStatementCreator psc,
          PreparedStatementCallback<T> action) throws DataAccessException {
    return this.delegate.execute(psc, action);
  }

  @Override
  public <T> T execute(String sql, PreparedStatementCallback<T> action)
          throws DataAccessException {
    return this.delegate.execute(sql, action);
  }

  public <T> T query(PreparedStatementCreator psc, PreparedStatementSetter pss,
          ResultSetExtractor<T> rse) throws DataAccessException {
    return this.delegate.query(psc, pss, rse);
  }

  @Override
  public <T> T query(PreparedStatementCreator psc, ResultSetExtractor<T> rse)
          throws DataAccessException {
    return this.delegate.query(psc, rse);
  }

  @Override
  public <T> T query(String sql, PreparedStatementSetter pss,
          ResultSetExtractor<T> rse) throws DataAccessException {
    return this.delegate.query(sql, pss, rse);
  }

  @Override
  public <T> T query(String sql, Object[] args, int[] argTypes,
          ResultSetExtractor<T> rse) throws DataAccessException {
    return this.delegate.query(sql, args, argTypes, rse);
  }

  @Override
  public <T> T query(String sql, Object[] args, ResultSetExtractor<T> rse)
          throws DataAccessException {
    return this.delegate.query(sql, args, rse);
  }

  @Override
  public <T> T query(String sql, ResultSetExtractor<T> rse, Object... args)
          throws DataAccessException {
    return this.delegate.query(sql, rse, args);
  }

  @Override
  public void query(PreparedStatementCreator psc, RowCallbackHandler rch)
          throws DataAccessException {
    this.delegate.query(psc, rch);
  }

  @Override
  public void query(String sql, PreparedStatementSetter pss,
          RowCallbackHandler rch) throws DataAccessException {
    this.delegate.query(sql, pss, rch);
  }

  @Override
  public void query(String sql, Object[] args, int[] argTypes,
          RowCallbackHandler rch) throws DataAccessException {
    this.delegate.query(sql, args, argTypes, rch);
  }

  @Override
  public void query(String sql, Object[] args, RowCallbackHandler rch)
          throws DataAccessException {
    this.delegate.query(sql, args, rch);
  }

  @Override
  public void query(String sql, RowCallbackHandler rch, Object... args)
          throws DataAccessException {
    this.delegate.query(sql, rch, args);
  }

  @Override
  public <T> List<T> query(PreparedStatementCreator psc, RowMapper<T> rowMapper)
          throws DataAccessException {
    return this.delegate.query(psc, rowMapper);
  }

  @Override
  public <T> List<T> query(String sql, PreparedStatementSetter pss,
          RowMapper<T> rowMapper) throws DataAccessException {
    return this.delegate.query(sql, pss, rowMapper);
  }

  @Override
  public <T> List<T> query(String sql, Object[] args, int[] argTypes,
          RowMapper<T> rowMapper) throws DataAccessException {
    return this.delegate.query(sql, args, argTypes, rowMapper);
  }

  @Override
  public <T> List<T> query(String sql, Object[] args, RowMapper<T> rowMapper)
          throws DataAccessException {
    return this.delegate.query(sql, args, rowMapper);
  }

  @Override
  public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... args)
          throws DataAccessException {
    return this.delegate.query(sql, rowMapper, args);
  }

  @Override
  public <T> T queryForObject(String sql, Object[] args, int[] argTypes,
          RowMapper<T> rowMapper) throws DataAccessException {
    return this.delegate.queryForObject(sql, args, argTypes, rowMapper);
  }

  @Override
  public <T> T queryForObject(String sql, Object[] args, RowMapper<T> rowMapper)
          throws DataAccessException {
    return this.delegate.queryForObject(sql, args, rowMapper);
  }

  @Override
  public <T> T queryForObject(String sql, RowMapper<T> rowMapper,
          Object... args) throws DataAccessException {
    return this.delegate.queryForObject(sql, rowMapper, args);
  }

  @Override
  public <T> T queryForObject(String sql, Object[] args, int[] argTypes,
          Class<T> requiredType) throws DataAccessException {
    return this.delegate.queryForObject(sql, args, argTypes, requiredType);
  }

  @Override
  public <T> T queryForObject(String sql, Object[] args, Class<T> requiredType)
          throws DataAccessException {
    return this.delegate.queryForObject(sql, args, requiredType);
  }

  @Override
  public <T> T queryForObject(String sql, Class<T> requiredType, Object... args)
          throws DataAccessException {
    return this.delegate.queryForObject(sql, requiredType, args);
  }

  @Override
  public Map<String, Object> queryForMap(String sql, Object[] args,
          int[] argTypes) throws DataAccessException {
    return this.delegate.queryForMap(sql, args, argTypes);
  }

  @Override
  public Map<String, Object> queryForMap(String sql, Object... args)
          throws DataAccessException {
    return this.delegate.queryForMap(sql, args);
  }

  @Override
  public <T> List<T> queryForList(String sql, Object[] args, int[] argTypes,
          Class<T> elementType) throws DataAccessException {
    return this.delegate.queryForList(sql, args, argTypes, elementType);
  }

  @Override
  public <T> List<T> queryForList(String sql, Object[] args,
          Class<T> elementType) throws DataAccessException {
    return this.delegate.queryForList(sql, args, elementType);
  }

  @Override
  public <T> List<T> queryForList(String sql, Class<T> elementType,
          Object... args) throws DataAccessException {
    return this.delegate.queryForList(sql, elementType, args);
  }

  @Override
  public List<Map<String, Object>> queryForList(String sql, Object[] args,
          int[] argTypes) throws DataAccessException {
    return this.delegate.queryForList(sql, args, argTypes);
  }

  @Override
  public List<Map<String, Object>> queryForList(String sql, Object... args)
          throws DataAccessException {
    return this.delegate.queryForList(sql, args);
  }

  @Override
  public SqlRowSet queryForRowSet(String sql, Object[] args, int[] argTypes)
          throws DataAccessException {
    return this.delegate.queryForRowSet(sql, args, argTypes);
  }

  @Override
  public SqlRowSet queryForRowSet(String sql, Object... args)
          throws DataAccessException {
    return this.delegate.queryForRowSet(sql, args);
  }

  @Override
  public int update(PreparedStatementCreator psc) throws DataAccessException {
    return this.delegate.update(psc);
  }

  @Override
  public int update(PreparedStatementCreator psc, KeyHolder generatedKeyHolder)
          throws DataAccessException {
    return this.delegate.update(psc, generatedKeyHolder);
  }

  @Override
  public int update(String sql, PreparedStatementSetter pss)
          throws DataAccessException {
    return this.delegate.update(sql, pss);
  }

  @Override
  public int update(String sql, Object[] args, int[] argTypes)
          throws DataAccessException {
    return this.delegate.update(sql, args, argTypes);
  }

  @Override
  public int update(String sql, Object... args) throws DataAccessException {
    return this.delegate.update(sql, args);
  }

  @Override
  public int[] batchUpdate(String sql, BatchPreparedStatementSetter pss)
          throws DataAccessException {
    return this.delegate.batchUpdate(sql, pss);
  }

  @Override
  public int[] batchUpdate(String sql, List<Object[]> batchArgs)
          throws DataAccessException {
    return this.delegate.batchUpdate(sql, batchArgs);
  }

  @Override
  public int[] batchUpdate(String sql, List<Object[]> batchArgs, int[] argTypes)
          throws DataAccessException {
    return this.delegate.batchUpdate(sql, batchArgs, argTypes);
  }

  @Override
  public <T> int[][] batchUpdate(String sql, Collection<T> batchArgs,
          int batchSize, ParameterizedPreparedStatementSetter<T> pss)
          throws DataAccessException {
    return this.delegate.batchUpdate(sql, batchArgs, batchSize, pss);
  }

  @Override
  public <T> T execute(CallableStatementCreator csc,
          CallableStatementCallback<T> action) throws DataAccessException {
    return this.delegate.execute(csc, action);
  }

  @Override
  public <T> T execute(String callString, CallableStatementCallback<T> action)
          throws DataAccessException {
    return this.delegate.execute(callString, action);
  }

  @Override
  public Map<String, Object> call(CallableStatementCreator csc,
          List<SqlParameter> declaredParameters) throws DataAccessException {
    return this.delegate.call(csc, declaredParameters);
  }

}
