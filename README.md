# TestPSrepository
Test QPS TPS RT Repository

## 配置

### 本地Windows配置

cpu: i5-1135G7 2.40GHz

内存: 8.0G 2400MHz DDR4 X 2 

## 测试

### Springboot 3.3.2 + Mybatis plus 3.5.7 + jdbc

#### 请求

线程数:5 请求数: 100 总共: 500

总耗时: 261.86 s

接口请求耗时: 187 s

平均接口请求耗时: 374 ms

### Springboot 3.3.2 + Mybatis plus 3.5.7 + jdbc + hikariCP

hikariCP配置: 

```yaml
 hikari:
     max-lifetime: 120000
     auto-commit: true
     minimum-idle: 10
     maximum-pool-size: 100
     validation-timeout: 5000 #连接被测试活动的最长时间 - 默认值：5秒

```



#### 请求

线程数:5 请求数: 100 总共: 500

总耗时: 226.346 s

接口请求耗时: 157 s

平均接口请求耗时: 314 ms

线程数:10 请求数: 100 总共: 1000

总耗时: 365.76 s

接口请求耗时: 470 s

平均接口请求耗时: 470 ms

### Springboot 3.3.2 + Mybatis plus 3.5.7 + jdbc + Druid

Druid配置: 

```yaml
    druid:
      initial-size: 10
      min-idle: 10
      max-active: 100
      max-wait: 600000
      min-evictable-idle-time-millis: 300000
      pool-prepared-statements: true
      filter:
        slf4j:
          enabled: true
        stat:
          enabled: true
          merge-sql: true
          slow-sql-millis: 5000
          log-slow-sql: true
```

#### 请求

线程数:5 请求数: 100 总共: 500

总耗时: 224.724 s

接口请求耗时: 179.5 s

平均接口请求耗时: 359 ms

线程数:10 请求数: 100 总共: 1000

总耗时: 427.991 s

接口请求耗时: 470 s

平均接口请求耗时: 470 ms
