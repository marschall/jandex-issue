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
import org.springframework.jdbc.support.nativejdbc.NativeJdbcExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;


@Service
public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {
  
  @Autowired(required = false)
  private org.springframework.jdbc.core.JdbcTemplate delegate;
  
  @Autowired
  public JdbcTemplate(DataSource dataSource) {
    
  }

  public void setDataSource(DataSource dataSource) {
    delegate.setDataSource(dataSource);
  }

  public DataSource getDataSource() {
    return delegate.getDataSource();
  }

  public void setDatabaseProductName(String dbName) {
    delegate.setDatabaseProductName(dbName);
  }

  public void setExceptionTranslator(SQLExceptionTranslator exceptionTranslator) {
    delegate.setExceptionTranslator(exceptionTranslator);
  }

  public SQLExceptionTranslator getExceptionTranslator() {
    return delegate.getExceptionTranslator();
  }

  public void setLazyInit(boolean lazyInit) {
    delegate.setLazyInit(lazyInit);
  }

  public boolean isLazyInit() {
    return delegate.isLazyInit();
  }

  public void afterPropertiesSet() {
    delegate.afterPropertiesSet();
  }

  public void setNativeJdbcExtractor(NativeJdbcExtractor extractor) {
    delegate.setNativeJdbcExtractor(extractor);
  }

  public NativeJdbcExtractor getNativeJdbcExtractor() {
    return delegate.getNativeJdbcExtractor();
  }

  public void setIgnoreWarnings(boolean ignoreWarnings) {
    delegate.setIgnoreWarnings(ignoreWarnings);
  }

  public boolean isIgnoreWarnings() {
    return delegate.isIgnoreWarnings();
  }

  public void setFetchSize(int fetchSize) {
    delegate.setFetchSize(fetchSize);
  }

  public int getFetchSize() {
    return delegate.getFetchSize();
  }

  public void setMaxRows(int maxRows) {
    delegate.setMaxRows(maxRows);
  }

  public int getMaxRows() {
    return delegate.getMaxRows();
  }

  public void setQueryTimeout(int queryTimeout) {
    delegate.setQueryTimeout(queryTimeout);
  }

  public int getQueryTimeout() {
    return delegate.getQueryTimeout();
  }

  public void setSkipResultsProcessing(boolean skipResultsProcessing) {
    delegate.setSkipResultsProcessing(skipResultsProcessing);
  }

  public boolean isSkipResultsProcessing() {
    return delegate.isSkipResultsProcessing();
  }

  public void setSkipUndeclaredResults(boolean skipUndeclaredResults) {
    delegate.setSkipUndeclaredResults(skipUndeclaredResults);
  }

  public boolean isSkipUndeclaredResults() {
    return delegate.isSkipUndeclaredResults();
  }

  public void setResultsMapCaseInsensitive(boolean resultsMapCaseInsensitive) {
    delegate.setResultsMapCaseInsensitive(resultsMapCaseInsensitive);
  }

  public boolean isResultsMapCaseInsensitive() {
    return delegate.isResultsMapCaseInsensitive();
  }

  public <T> T execute(ConnectionCallback<T> action) throws DataAccessException {
    return delegate.execute(action);
  }

  public <T> T execute(StatementCallback<T> action) throws DataAccessException {
    return delegate.execute(action);
  }

  public void execute(String sql) throws DataAccessException {
    delegate.execute(sql);
  }

  public <T> T query(String sql, ResultSetExtractor<T> rse) throws DataAccessException {
    return delegate.query(sql, rse);
  }

  public void query(String sql, RowCallbackHandler rch) throws DataAccessException {
    delegate.query(sql, rch);
  }

  public <T> List<T> query(String sql, RowMapper<T> rowMapper) throws DataAccessException {
    return delegate.query(sql, rowMapper);
  }

  public Map<String, Object> queryForMap(String sql) throws DataAccessException {
    return delegate.queryForMap(sql);
  }

  public <T> T queryForObject(String sql, RowMapper<T> rowMapper) throws DataAccessException {
    return delegate.queryForObject(sql, rowMapper);
  }

  public <T> T queryForObject(String sql, Class<T> requiredType) throws DataAccessException {
    return delegate.queryForObject(sql, requiredType);
  }

  public long queryForLong(String sql) throws DataAccessException {
    return delegate.queryForLong(sql);
  }

  public int queryForInt(String sql) throws DataAccessException {
    return delegate.queryForInt(sql);
  }

  public <T> List<T> queryForList(String sql, Class<T> elementType) throws DataAccessException {
    return delegate.queryForList(sql, elementType);
  }

  public List<Map<String, Object>> queryForList(String sql) throws DataAccessException {
    return delegate.queryForList(sql);
  }

  public SqlRowSet queryForRowSet(String sql) throws DataAccessException {
    return delegate.queryForRowSet(sql);
  }

  public int update(String sql) throws DataAccessException {
    return delegate.update(sql);
  }

  public int[] batchUpdate(String... sql) throws DataAccessException {
    return delegate.batchUpdate(sql);
  }

  public <T> T execute(PreparedStatementCreator psc, PreparedStatementCallback<T> action)
      throws DataAccessException {
    return delegate.execute(psc, action);
  }

  public <T> T execute(String sql, PreparedStatementCallback<T> action) throws DataAccessException {
    return delegate.execute(sql, action);
  }

  public <T> T query(PreparedStatementCreator psc,
      PreparedStatementSetter pss,
      ResultSetExtractor<T> rse) throws DataAccessException {
    return delegate.query(psc, pss, rse);
  }

  public <T> T query(PreparedStatementCreator psc, ResultSetExtractor<T> rse)
      throws DataAccessException {
    return delegate.query(psc, rse);
  }

  public <T> T query(String sql, PreparedStatementSetter pss, ResultSetExtractor<T> rse)
      throws DataAccessException {
    return delegate.query(sql, pss, rse);
  }

  public <T> T query(String sql, Object[] args, int[] argTypes, ResultSetExtractor<T> rse)
      throws DataAccessException {
    return delegate.query(sql, args, argTypes, rse);
  }

  public <T> T query(String sql, Object[] args, ResultSetExtractor<T> rse)
      throws DataAccessException {
    return delegate.query(sql, args, rse);
  }

  public <T> T query(String sql, ResultSetExtractor<T> rse, Object... args)
      throws DataAccessException {
    return delegate.query(sql, rse, args);
  }

  public void query(PreparedStatementCreator psc, RowCallbackHandler rch)
      throws DataAccessException {
    delegate.query(psc, rch);
  }

  public void query(String sql, PreparedStatementSetter pss, RowCallbackHandler rch)
      throws DataAccessException {
    delegate.query(sql, pss, rch);
  }

  public void query(String sql, Object[] args, int[] argTypes, RowCallbackHandler rch)
      throws DataAccessException {
    delegate.query(sql, args, argTypes, rch);
  }

  public void query(String sql, Object[] args, RowCallbackHandler rch) throws DataAccessException {
    delegate.query(sql, args, rch);
  }

  public void query(String sql, RowCallbackHandler rch, Object... args) throws DataAccessException {
    delegate.query(sql, rch, args);
  }

  public <T> List<T> query(PreparedStatementCreator psc, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.query(psc, rowMapper);
  }

  public <T> List<T> query(String sql, PreparedStatementSetter pss, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.query(sql, pss, rowMapper);
  }

  public <T> List<T> query(String sql, Object[] args, int[] argTypes, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.query(sql, args, argTypes, rowMapper);
  }

  public <T> List<T> query(String sql, Object[] args, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.query(sql, args, rowMapper);
  }

  public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... args)
      throws DataAccessException {
    return delegate.query(sql, rowMapper, args);
  }

  public <T> T queryForObject(String sql, Object[] args, int[] argTypes, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.queryForObject(sql, args, argTypes, rowMapper);
  }

  public <T> T queryForObject(String sql, Object[] args, RowMapper<T> rowMapper)
      throws DataAccessException {
    return delegate.queryForObject(sql, args, rowMapper);
  }

  public <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object... args)
      throws DataAccessException {
    return delegate.queryForObject(sql, rowMapper, args);
  }

  public <T> T queryForObject(String sql, Object[] args, int[] argTypes, Class<T> requiredType)
      throws DataAccessException {
    return delegate.queryForObject(sql, args, argTypes, requiredType);
  }

  public <T> T queryForObject(String sql, Object[] args, Class<T> requiredType)
      throws DataAccessException {
    return delegate.queryForObject(sql, args, requiredType);
  }

  public <T> T queryForObject(String sql, Class<T> requiredType, Object... args)
      throws DataAccessException {
    return delegate.queryForObject(sql, requiredType, args);
  }

  public Map<String, Object> queryForMap(String sql, Object[] args, int[] argTypes)
      throws DataAccessException {
    return delegate.queryForMap(sql, args, argTypes);
  }

  public Map<String, Object> queryForMap(String sql, Object... args) throws DataAccessException {
    return delegate.queryForMap(sql, args);
  }

  public long queryForLong(String sql, Object[] args, int[] argTypes) throws DataAccessException {
    return delegate.queryForLong(sql, args, argTypes);
  }

  public long queryForLong(String sql, Object... args) throws DataAccessException {
    return delegate.queryForLong(sql, args);
  }

  public int queryForInt(String sql, Object[] args, int[] argTypes) throws DataAccessException {
    return delegate.queryForInt(sql, args, argTypes);
  }

  public int queryForInt(String sql, Object... args) throws DataAccessException {
    return delegate.queryForInt(sql, args);
  }

  public <T> List<T> queryForList(String sql, Object[] args, int[] argTypes, Class<T> elementType)
      throws DataAccessException {
    return delegate.queryForList(sql, args, argTypes, elementType);
  }

  public <T> List<T> queryForList(String sql, Object[] args, Class<T> elementType)
      throws DataAccessException {
    return delegate.queryForList(sql, args, elementType);
  }

  public <T> List<T> queryForList(String sql, Class<T> elementType, Object... args)
      throws DataAccessException {
    return delegate.queryForList(sql, elementType, args);
  }

  public List<Map<String, Object>> queryForList(String sql, Object[] args, int[] argTypes)
      throws DataAccessException {
    return delegate.queryForList(sql, args, argTypes);
  }

  public List<Map<String, Object>> queryForList(String sql, Object... args)
      throws DataAccessException {
    return delegate.queryForList(sql, args);
  }

  public SqlRowSet queryForRowSet(String sql, Object[] args, int[] argTypes)
      throws DataAccessException {
    return delegate.queryForRowSet(sql, args, argTypes);
  }

  public SqlRowSet queryForRowSet(String sql, Object... args) throws DataAccessException {
    return delegate.queryForRowSet(sql, args);
  }

  public int update(PreparedStatementCreator psc) throws DataAccessException {
    return delegate.update(psc);
  }

  public int update(PreparedStatementCreator psc, KeyHolder generatedKeyHolder)
      throws DataAccessException {
    return delegate.update(psc, generatedKeyHolder);
  }

  public int update(String sql, PreparedStatementSetter pss) throws DataAccessException {
    return delegate.update(sql, pss);
  }

  public int update(String sql, Object[] args, int[] argTypes) throws DataAccessException {
    return delegate.update(sql, args, argTypes);
  }

  public int update(String sql, Object... args) throws DataAccessException {
    return delegate.update(sql, args);
  }

  public int[] batchUpdate(String sql, BatchPreparedStatementSetter pss) throws DataAccessException {
    return delegate.batchUpdate(sql, pss);
  }

  public int[] batchUpdate(String sql, List<Object[]> batchArgs) throws DataAccessException {
    return delegate.batchUpdate(sql, batchArgs);
  }

  public int[] batchUpdate(String sql, List<Object[]> batchArgs, int[] argTypes)
      throws DataAccessException {
    return delegate.batchUpdate(sql, batchArgs, argTypes);
  }

  public <T> int[][] batchUpdate(String sql,
      Collection<T> batchArgs,
      int batchSize,
      ParameterizedPreparedStatementSetter<T> pss) throws DataAccessException {
    return delegate.batchUpdate(sql, batchArgs, batchSize, pss);
  }

  public <T> T execute(CallableStatementCreator csc, CallableStatementCallback<T> action)
      throws DataAccessException {
    return delegate.execute(csc, action);
  }

  public <T> T execute(String callString, CallableStatementCallback<T> action)
      throws DataAccessException {
    return delegate.execute(callString, action);
  }

  public Map<String, Object> call(CallableStatementCreator csc,
      List<SqlParameter> declaredParameters) throws DataAccessException {
    return delegate.call(csc, declaredParameters);
  }

  
  
}
