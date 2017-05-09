package com.my.test.redis;

public class RJedisPoolConfig {
    //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    public static final int MAX_ACTIVE=StringUtils.getInt(PropertyConfig.getProperty(PropertyConfig.redis, "redis.pool.maxActive")); 
    //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
    public static final int MAX_IDLE =StringUtils.getInt(PropertyConfig.getProperty(PropertyConfig.redis, "redis.pool.maxIdle"));
    //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
    public static final long MAX_WAIT=StringUtils.getLong(PropertyConfig.getProperty(PropertyConfig.redis, "redis.pool.maxWait")); 
    //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    public static final boolean TEST_ON_BORROW=StringUtils.getBoolean(PropertyConfig.getProperty(PropertyConfig.redis, "redis.pool.testOnBorrow")); 
    //在borrow一个jedis实例时，是否提前进行alidate操作；如果为true，则得到的jedis实例均是可用的； 
    public static final boolean TEST_ON_RETURN=StringUtils.getBoolean(PropertyConfig.getProperty(PropertyConfig.redis, "redis.pool.testOnReturn"));
    //IP
    public static final String REDIS_IP=PropertyConfig.getProperty(PropertyConfig.redis, "redis.ip");  
    //Port
    public static final int REDIS_PORT=StringUtils.getInt(PropertyConfig.getProperty(PropertyConfig.redis, "redis.port"));  
    //Password
    public static final String REDIS_PASSWORD=PropertyConfig.getProperty(PropertyConfig.redis, "redis.pwd"); 
    public static final String TIMEOUT=PropertyConfig.getProperty(PropertyConfig.redis, "redis.timeout"); 
     
     
     
     
}