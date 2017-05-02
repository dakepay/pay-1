# 支付系统

嵌入微信公众号、支付宝支付

## 网关

###### 路由
   - 微信公众号
   - 支付宝

###### 接口

> `https://api.${domain}/${}`

>> `https://api.sipay.com/trades`

- 创建交易 /trade/create
  - 创建订单
  - 避免重复创建
  - 生成预付订单号和签名
- 交易查询 /trade/query
  - 订单查询
  - 提供订单处理状态查询
  - 订单状态异常时通过微信接口查询订单状态
- 交易回调 /trade/notify
  - 通知地址
  - 接受第三方支付平台异步回调通知
  - 告知第三方支付平台通知处理结果

## 业务模块

- 用户
- 订单
- 支付
- 财务

## 公共服务

- 短信服务
- 消息服务
- 数据收集服务

## 后台

## 数据库设计

<table>
    <tr>
        <th rowspan="2">支付业务</th>
        <th>支付订单表</th>
    </tr>
    <tr>
        <th>支付记录表</th>
    </tr>
</table>