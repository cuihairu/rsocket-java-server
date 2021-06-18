# RSocket java server

RSocket Java Server Demo

演示 Java RSocket Server

## 架构图

```
+-------------+    +--------------+   +-------------+
| game server |--->| cross server |<--| game server |
+-------------+    +--------------+   +-------------+
                     /|\    /|\
+-------------+       | wire |        +-------------+
| game server |-------+      +--------| game server |
+-------------+                       +-------------+
```

采用`RSocket`+`websocket`+`protobuf`实现一个简易的`Demo`

## 概念:

1. `game server` 为游戏服，主要用于接收玩家主逻辑服
2. `cross server` 为跨服，用于游戏服连接到跨服，处理一些需要跨游戏服的玩法
3. `wire`: 硬件不同设备之间通信的协议，嵌入式引入这个概念，这边 代表不同进程之间的通信协议。


## 主要演示:

- [ ] 进程间通信
- [ ] 进程间广播
- [ ] 断线重连
- [ ] 背压

